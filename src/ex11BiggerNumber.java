import java.util.Scanner;

public class ex11BiggerNumber {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());

        if (firstNumber == secondNumber) {
            System.out.println(firstNumber + " is equal to " + secondNumber);
        } else if (firstNumber > secondNumber) {
            System.out.println("First Number Larger! " + firstNumber);
        } else {
            System.out.println("Second Number Larger!" + secondNumber);
        }
    }
}
