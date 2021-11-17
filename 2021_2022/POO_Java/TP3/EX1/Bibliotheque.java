package ex1;


public class Bibliotheque {
    public static void main(String[]args){
        Livre l1 = new Livre(1111,"C++ Guide", new Auteur("MIMI","AAA",12,111));
        l1.ajouterAuteur(new Auteur("Assili","mohamed",60,8416511));
        l1.ajouterAuteur(new Auteur("Ouali","Riadh",66,44141144));
        l1.afficher();
    }
}
