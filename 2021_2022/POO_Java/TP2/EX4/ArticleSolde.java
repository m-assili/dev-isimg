package ex4;

public class ArticleSolde extends Article{
    private double remise;

    public ArticleSolde() {
    }
    public ArticleSolde(int code, String designation, double prix, double remise) {
        super(code, designation, prix);
        this.remise = remise;
    }

    @Override
    public double getPrix() {
        return super.getPrix()*(1-remise);
    }

    @Override
    public String toString() {
        return "ArticleSolde{" +super.toString()+
                "remise=" + remise +
                '}';
    }
    public static boolean equals(ArticleSolde articleSolde1, ArticleSolde articleSolde2){
        System.out.println("equals article soldé");
        return Article.equals(articleSolde1,articleSolde2)
                && articleSolde1.remise == articleSolde2.remise;
    }

}
