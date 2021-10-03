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
public class Chercheur {
    private String nom;
    private String poste;
    private int numPc;

    public Chercheur(String nom, String poste, int numPc) {
        this.nom = nom;
        this.poste = poste;
        this.numPc = numPc;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public int getNumPc() {
        return numPc;
    }

    public void setNumPc(int numPc) {
        this.numPc = numPc;
    }

    public boolean comparer(Chercheur ch)
    {
        return this.nom.equalsIgnoreCase(ch.getNom()) && this.numPc==ch.getNumPc();
    }
    @Override
    public String toString() {
        return  nom + ", " + poste + ", " + numPc + "\n";
    }
    
    
}
