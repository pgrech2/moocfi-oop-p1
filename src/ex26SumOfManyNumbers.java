import java.util.Scanner;

public class ex26SumOfManyNumbers {
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        while(true) {
            System.out.print("Input: ");
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }
            sum = sum + read;
            System.out.println("Sum is now: " + sum);
        }
        System.out.println("Sum: " + sum);
    }
}
