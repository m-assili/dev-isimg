package ex4;

public class Entier implements ExpressionArithmetique{
    private int valeur;
    Entier(int valeur){
        this.valeur = valeur;
    }
    @Override
    public int evaluer() {
        return valeur;
    }

    @Override
    public String decompiler() {
        return ""+valeur;
    }
}
