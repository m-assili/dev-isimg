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
public class CompteBancaire {
    public static long compteurCompte=1;
    private long numero;
    private String proprietaire;
    private String adresse;
    private double solde;

    public CompteBancaire(String proprietaire, String adresse, double solde) {
        this.numero = compteurCompte++;
        this.proprietaire = proprietaire;
        this.adresse = adresse;
        this.solde = solde;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte numero=" + numero + " posséder par :" + proprietaire + ", adresse=" + adresse + ",\n\t\t solde=" + solde;
    }
    public void crediterCompte(double montant)
    {
        if(this.solde<montant)
            System.out.println("Solde insuffisant ...");
        else
            this.solde-=montant;
    }
    public void debiterCompte(double montant)
    {
        this.solde+=montant;
    }
    
    
    
}
