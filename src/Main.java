public class Main {

    public static void main(String[] args) {

        String[] stringArray = {"Paul", "Grech", "hello"};

        System.out.println(stringArray.length);
        System.out.println("Last Number: " + stringArray[2]);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;

        int i = 0;
        while(i < numbers.length) {
            System.out.println(numbers[i]);
            sum += numbers[i];
            i += 1;
        }
        System.out.println("Sum 0 " + sum);

        sum = 0;
        System.out.print("\n");
        for (int number : numbers){
            sum += number;
        }
        System.out.println("Sum 1 " + sum);

        sum = 0;
        System.out.print("\n");
        for(int x = 0; x < numbers.length; x++){
            sum += numbers[x];
        }
        System.out.println("Sum 2 " + sum);




    }
}
