package ex4;

public class Article {
    private int code;
    private String designation;
    private double prix;

    public Article() {
    }
    public Article(int code, String designation, double prix) {
        this.code = code;
        this.designation = designation;
        this.prix = prix;
    }

    public int getCode() {
        return code;
    }

    public String getDesignation() {
        return designation;
    }

    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    @Override
    public String toString() {
        return "Article{" +
                "code=" + code +
                ", designation='" + designation + '\'' +
                ", prix=" + prix +
                '}';
    }
    public static boolean equals(Article article1,Article article2){
        System.out.println("equals article soldé");
        return article1.code == article2.code
                && article1.designation.equals(article2.designation)
                && article1.prix == article2.prix;
    }

}
