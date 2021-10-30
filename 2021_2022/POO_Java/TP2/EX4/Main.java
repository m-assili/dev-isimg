package ex4;

public class Main {
    public static void main(String[]args){
        Article a = new Article(10, "PC Lenovo", 2000);
        Article b = new ArticleSolde(20, "Bureau", 1000,0.10);
        Article c = new Article(30, "Imprimante Rx", 500);
        Article d = new Article(40, "Rame papier", 10);
        Facture facture = new Facture();
        facture.ajouterAchat(new LigneFacture(a,2));
        facture.ajouterAchat(new LigneFacture(b,2));
        facture.ajouterAchat(new LigneFacture(c,1));
        facture.ajouterAchat(new LigneFacture(d,5));
        facture.afficher();
        System.out.println("Le montant a payer:"+facture.montant());
    }
}
