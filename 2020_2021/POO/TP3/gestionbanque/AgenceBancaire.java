/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbanque;

/**
 *
 * @author Lenovo
 */
public class AgenceBancaire {
    private String nomAgence;
    private String adresse;
    private CompteBancaire comptes[];
    private int nbComptes;

    public AgenceBancaire(String nomAgence, String adresse, int nombreCompte) {
        this.nomAgence = nomAgence;
        this.adresse = adresse;
        this.comptes=new CompteBancaire[nombreCompte];
        this.nbComptes=0;
    }

    public String getNomAgence() {
        return nomAgence;
    }

    public void setNomAgence(String nomAgence) {
        this.nomAgence = nomAgence;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    public CompteBancaire chercherCompte(String nom)
    {
        for(CompteBancaire cp:this.comptes)
        {
            if(cp!=null)
                if(cp.getProprietaire().equalsIgnoreCase(nom))
                    return cp;
        }
        return null;
    }
    
    public void ajouterCompte(CompteBancaire cpt)
    {
        if(this.chercherCompte(cpt.getProprietaire())==null)
            if(this.nbComptes<this.comptes.length-1)
                this.comptes[this.nbComptes++]=cpt;
            else
                System.out.println("Capacité de l'agence est atteinte, il n'est plus possible d'ajouter de comptes");
    }

    @Override
    public String toString() {
        String agence= "AgenceBancaire[[\n" + "nomAgence=" + nomAgence + ", adresse=" + adresse + "\n\n";
        for(CompteBancaire cp:this.comptes)
        {
            if(cp!=null)
                agence+=cp.toString()+"\n";
        
        }
            
        return agence+"]]";
    }
    
    
}
