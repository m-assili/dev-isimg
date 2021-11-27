package ex2;

public class Product {
    private String reference;
    private double price;
    private int quantity;

    public Product(String reference, double price, int quantity) {
        this.reference = reference;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "reference='" + reference + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public void display(){
        System.out.println(this);
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getReference() {
        return reference;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
