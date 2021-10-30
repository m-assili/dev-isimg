package ex4;

public class LigneFacture {
    private Article article;
    private int quantite;

    public LigneFacture(Article article, int quantite) {
        this.article = article;
        this.quantite = quantite;
    }

    public Article getArticle() {
        return article;
    }

    public int getQuantite() {
        return quantite;
    }

    @Override
    public String toString() {
        return "{" +article.getCode() +" , "
                +article.getDesignation() +" , "
                +article.getPrix()+" , "
                + quantite +
                '}';
    }
}
