

public class methods {
    public static void main(String[] args) {
        int number = 1;
        System.out.println("Main program variable: " + number);
        System.out.println("Main program variable: " + addThree(number));
    }

    public static int addThree(int number) {
        System.out.println("Method parameter: " + number);
        number = number + 3;
        System.out.println("Method parameter: " + number);
        return number;
    }
}
