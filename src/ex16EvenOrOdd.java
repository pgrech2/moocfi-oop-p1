import java.util.Scanner;

public class ex16EvenOrOdd {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Input Value: ");
        int val = Integer.parseInt(reader.nextLine());
        int myMod = val % 2;

        if (myMod == 1) {
            System.out.println("Odd value: " + val);
        } else {
            System.out.println("Even value: " + val);
        }

    }
}
