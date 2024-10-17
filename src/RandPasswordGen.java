import java.util.*;

public class RandPasswordGen {
    public static void main(String args[]) {
        String PW = "";
        Random rand = new Random();
        ArrayList<String> PwVar = new ArrayList<String>();
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
        for (int i = 0; i <= 15; i++) {
            int num = rand.nextInt(82);
            PwVar.add(String.valueOf(chars.get(num)));
            PW = PW + PwVar.get(i);
        }
        System.out.println("Password: " + PW);
    }
}
