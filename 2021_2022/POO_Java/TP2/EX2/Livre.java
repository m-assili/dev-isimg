package ex2;

import java.util.Objects;

public class Livre {
    private String titre;
    private String auteur;
    private int nbPages;
    static int nbLivres=0;

    public Livre() {
        nbLivres++;
    }

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        nbLivres++;
    }

    public Livre(String titre, String auteur, int nbPages) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
        nbLivres++;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setNbPages(int nbPages) {
        if(nbPages>0)
            this.nbPages = nbPages;
    }
    public void afficher(){
        System.out.println("Livre:\n"+"Tire:"+this.getTitre()+"\t Auteur:"+this.getAuteur()
                +"\t Pages:"+this.getNbPages());
    }
    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", nbPages=" + nbPages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // il s'agit de la même instance
        if (!(o instanceof Livre)) return false; // deux objets de type différent
        Livre livre = (Livre) o; // casting explicite vers le type Livre de l'Object
        return getNbPages() == livre.getNbPages()
                && getTitre().equals(livre.getTitre())
                && getAuteur().equals(livre.getAuteur());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitre(), getAuteur(), getNbPages());
    }
    public static int getNbLivres(){
        return nbLivres;
    }
}
