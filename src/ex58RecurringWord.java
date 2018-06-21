import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex58RecurringWord {
    public static void main(String [] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);

        while(true) {
            System.out.print("Word: ");
            String newWord = reader.nextLine();

            if (words.contains(newWord)) {
                System.out.println("Already gave word " + newWord);
                break;
            } else {
                words.add(newWord);
            }
        }

        System.out.println("Word Count: " + words.size());

        System.out.println("Now Sort: " + words.size());
        Collections.sort(words);
        myPrint(words);

        System.out.println("Now Reverse");
        Collections.reverse(words);
        myPrint(words);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);

        numbers.remove(Integer.valueOf(4));

        System.out.println(numbers);


    }

    public static void myPrint(ArrayList<String> list) {
        for (String element : list) {
            System.out.println("..." + element);
        }
    }
}
