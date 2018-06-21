import java.util.Scanner;

public class ex51SeparatingCharacters {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("A string: ");
        String input = reader.nextLine();

        int i = input.length() - 1;
        while (i >= 0) {
            toPrint(i, input.charAt(i));
            i -= 1;
        }
    }

    public static void toPrint(int index, char character) {
        System.out.println(index + ". To Print: " + character);
    }
}
