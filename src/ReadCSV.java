import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class ReadCSVWithScanner {
    public static void main(String[] args) {
        ReadCSVWithScanner test = new ReadCSVWithScanner();
        LinkedList<PWData> pwData = test.getPWFromCSV("./resources/passwords.csv");
        for (PWData phonebookEntry: pwData) {
            System.out.println(phonebookEntry);
        }
    }

    public LinkedList<PWData> getPWFromCSV(String filePath) {
        LinkedList<PWData> pwData = new LinkedList<>();
        String line = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            while ((line = reader.readLine()) != null) {
                PWData pw = new PWData();
                String[] data = line.split(",");
                pw.setpw(data[0]);
                pwData.add(pw);
            }
            reader.close();
        } //fixing later
        catch (IOException e) {
            System.out.println("File not found");
        }
        return pwData;
    }
}