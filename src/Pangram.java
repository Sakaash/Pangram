import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String input = scanner.nextLine();
        System.out.println(checkIfPangram(input)?"It is a pangram":"Not a pangram");
    }
    private static boolean checkIfPangram(String input) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i<input.length(); i++) {
            char ch = input.charAt(i);
            if(Character.isAlphabetic(ch)){
                if(ch>'Z') {
                    ch-=32;
                }
                set.add(ch);
            }
        }
        return set.size() == 26;
    }
}
