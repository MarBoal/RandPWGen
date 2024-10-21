import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class ReadCSVWithScanner {
    public static void main(String[] args) {
        ReadCSVWithScanner test = new ReadCSVWithScanner();
        LinkedList<PWData> pwData = test.getPWFromCSV("./resources/passwords.csv");
        for (PWData pwEntry : pwData) {
            System.out.println(pwEntry);
        }
    }//

    public LinkedList<PWData> getPWFromCSV(String filePath) {
        LinkedList<PWData> pwDataList = new LinkedList<>();
        String line;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }

                PWData pw = new PWData();
                String[] data = line.split(",");
                pw.setpw(data[0]);
                pwDataList.add(pw);
            }
            //checker here
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        return pwDataList;
    }
}