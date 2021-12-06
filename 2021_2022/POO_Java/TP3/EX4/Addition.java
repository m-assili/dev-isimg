package ex4;

public class Addition implements ExpressionArithmetique{
    private Entier entier1;
    private Entier entier2;
    Addition(Entier entier1,Entier entier2){
        this.entier1 = entier1;
        this.entier2 = entier2;
    }
    @Override
    public int evaluer() {
        return entier1.evaluer()+entier2.evaluer();
    }

    @Override
    public String decompiler() {
        return entier1.decompiler()+"+"+entier2.decompiler();
    }
}
