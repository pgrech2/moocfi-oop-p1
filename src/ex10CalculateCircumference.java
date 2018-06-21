import java.util.Scanner;

public class ex10CalculateCircumference {
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        double pi = 22.0 / 7.0;

        double circumfrence = 2 * pi * radius;
        System.out.println("Circumfrence: " + circumfrence);

    }
}
