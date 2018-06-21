import java.util.Scanner;

public class NameAndAgeGreeting {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Name: ");
        String inputName = reader.nextLine();

        System.out.print("Age: ");
        int inputAge = Integer.parseInt(reader.nextLine());

        System.out.println("Hello " + inputName + ", your age is " + inputAge + " but goodbye!");

    }
}

