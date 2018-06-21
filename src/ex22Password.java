import java.util.Scanner;

public class ex22Password {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);
        String password = "password";

        while(true) {
            System.out.print("Password: ");
            String input = reader.nextLine();

            if (password.equals(input)){
                break;
            } else {
                System.out.println("INCORRECT\n\n");
            }
        }

        System.out.println("The secret is.... : ) ");
    }
}
