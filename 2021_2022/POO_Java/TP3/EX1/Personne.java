package ex1;

public class Personne {
    private String nom;
    private String prenom;
    private int age;

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    public String toString(){
         return "\t Nom:"+nom+"\t Prenom:"+prenom+"\t Age:"+age;
    }
    public void afficher(){
        System.out.println(this.toString());
    }
}
