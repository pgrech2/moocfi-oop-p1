

public class BinarySearch {

    private static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value
        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2));
    }

    private static int average(int lower, int upper) {
        return ((upper + lower) / 2);
    }

    public static boolean search(int[] searchArray, int value){

        // Set Upper and Lower Index
        int lowerIdx = 0;
        int upperIdx = searchArray.length - 1;
        int iterations = howManyTimesHalvable(upperIdx-lowerIdx);

        for(int i = 0; i <= iterations; ++i) {
            int mean = average(lowerIdx, upperIdx);
            if(value > searchArray[mean]){
                lowerIdx = mean + 1;
            } else {
                upperIdx = mean;
            }
        }

        if (value == searchArray[upperIdx]){
            System.out.println("Index: " + upperIdx);
            return true;
        } else {
            return false;
        }
    }
}