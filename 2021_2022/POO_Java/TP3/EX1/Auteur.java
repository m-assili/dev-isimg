package ex1;

public class Auteur extends Personne{
    private long numAuteur;

    public Auteur(String nom, String prenom, int age, long numAuteur) {
        super(nom, prenom, age);
        this.numAuteur=numAuteur;
    }
    public void afficher()
    {
        System.out.println("Numero Auteur:"+numAuteur);
        super.afficher();
    }
}
