import java.util.Scanner;

public class ex69Palindrome {

    public static boolean palindrome(String text) {
        int idx1 = 0;
        int idx2 = text.length() - 1;
        while (idx1 < idx2) {
            if (text.charAt(idx1) != text.charAt(idx2)) {
                return false;
            }
            idx1 += 1;
            idx2 -= 1;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
