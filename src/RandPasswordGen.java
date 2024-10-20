import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

public class RandPasswordGen {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("./resources/passwords.csv");
        PrintWriter out = new PrintWriter(file);
        Random rand = new Random();
        ArrayList<String> chars = new ArrayList<String>();
        List<String> ChList = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "!", "@", "#", "$", "%", "^", "&", "*", "(", ")",
                "-", "-", "-", "-", "-", "-", "-", "-", "-", "-",
                "!", "@", "#", "$", "%", "^", "&", "*", "(", ")"
                );
        //82, PW min length 15
        chars.addAll(ChList);
        Collections.shuffle(chars);
        System.out.println("How many passwords do you want to generate?");
        int loop = Integer.parseInt(scanner.nextLine());
        for (int x = 0; x < loop; x++) {
            StringBuilder PW = new StringBuilder();
            for (int i = 0; i <= 15; i++) {
                int num = rand.nextInt(82);
                PW.append(ChList.get(num));
            }
            String PWSaver = PW.toString();
            out.println(PWSaver);
        }
        out.close();
    }
}
