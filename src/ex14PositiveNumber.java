import java.util.Scanner;

public class ex14PositiveNumber {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Number: ");
        int val = Integer.parseInt(reader.nextLine());

        if (val < 0) {
            System.out.println("Negative: " + val);
        } else if (val > 0) {
            System.out.println("Positive: " + val);
        } else {
            System.out.println("Zero!!!");
        }
    }
}
