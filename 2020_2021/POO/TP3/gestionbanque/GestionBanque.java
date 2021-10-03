/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbanque;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class GestionBanque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CompteBancaire c1=new CompteBancaire("Moi", "Sfax", 10);
        CompteBancaire c2=new CompteBancaire("MM", "GB", 20);
        CompteBancaire c3=new CompteBancaire("Med", "Sfax", 1000);
        CompteBancaire c4=new CompteBancaire("AHM", "SFX", 20);
        CompteBancaire c5=new CompteBancaire("MIMI", "Sfax", 10);
        CompteBancaire c6=new CompteBancaire("SALM", "SFX", 20);
        AgenceBancaire agenceA=new AgenceBancaire("M.ville", "Ariana, sfax", 100);
        agenceA.ajouterCompte(c1);
        agenceA.ajouterCompte(c2);
        agenceA.ajouterCompte(c3);
        agenceA.ajouterCompte(c4);
        agenceA.ajouterCompte(c5);
        agenceA.ajouterCompte(c6);
        System.out.println(agenceA.toString());
        System.out.println("---------------------------------------------------");
        Scanner sc=new Scanner(System.in);
        System.out.println("Donner nom du titulaire du compte:");
        String titulaire=sc.nextLine();
        CompteBancaire cp=agenceA.chercherCompte(titulaire);
        if(cp!=null)
            System.out.println(cp);
        else
        {
            System.out.println("Ce compte n'existe pas, voulez-vous le créer(Y/N)?");
            String chx=sc.nextLine();
            if(chx.equalsIgnoreCase("Y"))
            {
                System.out.println("Donner Adresse:");
                String adr=sc.nextLine();
                System.out.println("Donner montant de départ:");
                double mnt=sc.nextDouble();
                agenceA.ajouterCompte(new CompteBancaire(titulaire, adr, mnt));
            }
                
        }
        System.out.println("---------------------------------------------------");
        System.out.println(agenceA.toString());
        System.out.println("---------------------------------------------------");
        
        System.out.println("Choisir opération: (Q)uitter, (D)ébiter, (C)réditer?");
        String op=sc.nextLine();
        switch(op)
        {
            case "Q": System.exit(0);
            case "D": System.out.println("Titulaire du compte:");
                       CompteBancaire c= agenceA.chercherCompte(sc.nextLine());
                       if(c!=null)
                       {
                           System.out.println("Montant:");
                           c.debiterCompte(sc.nextDouble());
                       }
                       System.out.println(c);
                       break;
            case "C": System.out.println("Titulaire du compte:");
                       CompteBancaire cc= agenceA.chercherCompte(sc.nextLine());
                       if(cc!=null)
                       {
                           System.out.println("Montant:");
                           cc.debiterCompte(sc.nextDouble());
                       }
                       System.out.println(cc);
                       break;
        }
     
        
    }
    
}
