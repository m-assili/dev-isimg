package ex1;

public class Adherent extends Personne{
    private long numAdherent;

    public Adherent(String nom, String prenom, int age, long numAdherent) {
        super(nom, prenom, age);
        this.numAdherent=numAdherent;
    }
    public void afficher(){
        System.out.println("\t Numero Adherent:"+numAdherent);
        super.afficher();
    }

}
