package ex2;

public class Drug extends Product{
    private boolean isGeneric;
    private boolean underPrescription;
    public Drug(String reference, double price, int quantity, boolean isGeneric, boolean underPrescription) {
        super(reference, price, quantity);
        this.isGeneric = isGeneric;
        this.underPrescription = underPrescription;
    }

    @Override
    public String toString() {
        return super.toString()+"\t Drug{" +
                "isGeneric=" + isGeneric +
                ", underPrescription=" + underPrescription +
                "} ";
    }
    public void display(){
        System.out.println(this);
    }
}
