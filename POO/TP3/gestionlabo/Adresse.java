/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionlabo;

/**
 *
 * @author Lenovo
 */
public class Adresse {
    private String gouvernorat;
    private String ville;
    private int codePostal;

    public Adresse() {
    }

    public Adresse(String gouvernorat, String ville, int codePostal) {
        this.gouvernorat = gouvernorat;
        this.ville = ville;
        this.codePostal = codePostal;
    }

    public String getGouvernorat() {
        return gouvernorat;
    }

    public void setGouvernorat(String gouvernorat) {
        this.gouvernorat = gouvernorat;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    @Override
    public String toString() {
        return "Adresse{" + gouvernorat + ", " + ville + ", " + codePostal + "}\n";
    }
    public boolean comparer(Adresse adr){
    return this.gouvernorat.equalsIgnoreCase(adr.getGouvernorat()) &&
            this.ville.equalsIgnoreCase(adr.getVille());
    }
    
}
