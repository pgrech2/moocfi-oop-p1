public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product (String newProductName) {
        this.name = newProductName;
        this.price = 0.0;
        this.quantity = 0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void printProduct() {
        System.out.println(this.name + ": price of " + this.price + " and quantity " + this.quantity);
    }
}
