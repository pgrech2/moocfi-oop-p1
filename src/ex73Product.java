public class ex73Product {

    public static void main(String [] args){
        System.out.println("Hello!");
        Product apple = new Product("apple");
        apple.printProduct();

        apple.setPrice(1.50);
        System.out.println("Price: " + apple.getPrice());

        apple.setQuantity(10);
        System.out.println("Quantity: " + apple.getQuantity());

    }
}
