import java.util.Scanner;

public class GuessingGame {
    private Scanner reader;

    public GuessingGame(){
        this.reader = new Scanner(System.in);
    }

    private void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");
        System.out.println("I can guess the number you are thinking of with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
        System.out.println("");
    }

    private static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value
        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }

    private static int average(int lower, int upper) {
        return ((upper + lower) / 2);
    }

    private boolean isGreaterThan(int average){
        System.out.print("Is your number greater than " + average +"? (y/n)");
        String response = this.reader.nextLine();
        if (response.equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    public void play(int lowerLimit, int upperLimit){

        // Print instructions
        instructions(lowerLimit, upperLimit);

        // Set Upper and Lower Index
        int upperIdx = upperLimit;
        int lowerIdx = lowerLimit;
        int iterations = howManyTimesHalvable(upperIdx-lowerIdx) - 1;

        for(int i = 0; i < iterations; ++i){
            int mean = average(lowerIdx, upperIdx);
            if(isGreaterThan(mean)){
                lowerIdx = mean + 1;
            } else {
                upperIdx = mean;
            }
        }
        System.out.println("Is the value: " + upperIdx);
    }
}
