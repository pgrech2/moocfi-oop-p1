import java.util.ArrayList;
import java.util.Scanner;

public class ex67Variance {

    public static void main (String [] args) {
        System.out.println("Variance!");
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<Integer>();

        while(true) {
            System.out.print("Integer: ");
            int newValue = Integer.parseInt(reader.nextLine());
            if(newValue != 0) {
                values.add(newValue);
            } else {
                break;
            }
        }

        System.out.println("Variance: " + variance(values));
    }

    public static double average(ArrayList<Integer> values) {
        double sum = 0.0;
        for (Integer val : values) {
            sum = sum + val;
        }
        return sum / values.size();
    }

    public static double variance(ArrayList<Integer> values) {
        double sampleMean = average(values);
        double accumulator = 0.0;

        for (Integer val : values) {
            accumulator = accumulator + Math.pow((val - sampleMean), 2);
        }

        return accumulator / (values.size() - 1);
    }
}
