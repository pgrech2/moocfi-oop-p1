import java.util.Scanner;

public class ComparingStrings {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First string: ");
        String text1 = reader.nextLine();
        text1 = text1.toLowerCase();
        text1 = text1.trim();

        System.out.print("Second string: ");
        String text2 = reader.nextLine();
        text2 = text2.toLowerCase();
        text2 = text2.trim();

        if (text1.equals(text2)) {
            System.out.println(text1 + " is equal to " + text2);
        } else {
            System.out.println(text1 + " is NOT equal to " + text2);
        }

    }
}
