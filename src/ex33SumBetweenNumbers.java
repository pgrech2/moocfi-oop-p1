import java.util.Scanner;

public class ex33SumBetweenNumbers {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int first_number = Integer.parseInt(reader.nextLine());

        System.out.print("Second: ");
        int second_number = Integer.parseInt(reader.nextLine());

        int sum = 0;

        while (first_number <= second_number) {
            sum = sum + first_number;
            first_number += 1;
        }

        System.out.println("Sum: " + sum);

    }
}
