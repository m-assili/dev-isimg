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
public class Laboratoire {
    final int B_MAX=50;
    private String nom;
    private String specialite;
    private Adresse adresse;
    private Bureau bureaux[];
    private int nbBur;

    public Laboratoire(String nom, String specialite, Adresse adresse) {
        this.nom = nom;
        this.specialite = specialite;
        this.adresse=adresse;
        bureaux=new Bureau[B_MAX];
        this.nbBur=0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    public void ajouterBureau(Bureau b)
    {
        this.bureaux[this.nbBur++]=b;
    }
    public void affecterChercheur(Chercheur ch){
        for(int i=0;i<nbBur;i++){
            if(bureaux[i].getChercheurs().length > bureaux[i].getNbCh())
            {
                bureaux[i].ajouterChercheur(ch);
                break;
            }
        }
    }

    @Override
    public String toString() {
        String desc= "Nom du labo=" + nom + ",\n specialite=" + specialite + ", \n adresse=" + adresse + "\n";
        for(Bureau b:this.bureaux)
            if(b!=null)
                desc+="\t"+b.toString()+"\n";
        
        return desc;
    }
    
}
