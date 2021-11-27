package ex2;

public class ParaProduct extends Product{
    private String type;

    public ParaProduct(String reference, double price, int quantity, String type) {
        super(reference, price, quantity);
        this.type = type;
    }

    @Override
    public String toString() {
        return "ParaProduct{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }

}
