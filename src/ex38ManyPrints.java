import java.util.Scanner;

public class ex38ManyPrints {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Who: ");
        String name = reader.nextLine();

        System.out.print("How many: ");
        int iterations = Integer.parseInt(reader.nextLine());
        int i = 0;

        while (i < iterations) {
            printText(name);
            i += 1;
        }
    }

    public static void printText(String name) {
        System.out.println("---> hello, " + name);
    }
}
