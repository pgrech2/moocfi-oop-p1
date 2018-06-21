import java.util.Scanner;

public class ex25SumOfNumbers {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        int read;

        while (i < 3) {
            System.out.print("Value: ");
            read = Integer.parseInt(reader.nextLine());
            sum = sum + read;
            i ++;
        }
        System.out.println("Sum: " + sum);

    }
}
