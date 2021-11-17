package ex1;

public class Livre {
    private long isbn;
    private String titre;
    private Auteur auteurs[];
    private int nbAut;
    public Livre(long isbn,String titre,Auteur...tabAut){
        this.isbn = isbn;
        this.titre = titre;
        auteurs = new Auteur[4];
        for(Auteur a:tabAut){
            if(a!=null && nbAut<4)
                auteurs[nbAut++]=a;
        }
    }
    public Livre(long isbn, String titre) {
        this.isbn = isbn;
        this.titre = titre;
        auteurs = new Auteur[4];
        nbAut = 0;
    }
    public void ajouterAuteur(Auteur auteur){
        if(auteur!=null && nbAut<4)
            auteurs[nbAut++]=auteur;
        else
            System.out.println("ajout d'auteurs impossible!!");
    }
    public void afficher(){
        System.out.println("ISBN:"+isbn+"\t Titre:"+titre);
        System.out.println("Auteurs:");
        for (Auteur a:auteurs)
            if(a!=null)
                a.afficher();
    }
}
