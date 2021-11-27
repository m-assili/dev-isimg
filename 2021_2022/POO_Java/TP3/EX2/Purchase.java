package ex2;

public class Purchase {
    private long id;
    static long counter=0;
    private Client client;
    private Product product;
    private int quantity;

    public Purchase(Client client, Product product, int quantity) {
        this.id = counter++;
        this.client = client;
        this.product = product;
        this.quantity = quantity;
    }
    public double getPurchaseAmount(){
        return product.getPrice()*quantity;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", client=" + client.getCnamID() +
                ", product=" + product.getReference() +
                ", quantity=" + quantity +
                ", Total Price=" + this.getPurchaseAmount() +
                '}';
    }
    public void display(){
        System.out.println(this);
    }
}
