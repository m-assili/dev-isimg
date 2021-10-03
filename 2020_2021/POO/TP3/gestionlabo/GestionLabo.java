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
public class GestionLabo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Adresse adr1=new Adresse();
        adr1.setGouvernorat("Gabes");
        adr1.setVille("Zrig");
        adr1.setCodePostal(6072);
        Adresse adr2=new Adresse("Sfax", "Centre ville", 3000);
     //   System.out.println(adr1);
      //  System.out.println(adr2);
        Bureau b1=new Bureau(1);
        Bureau b2=new Bureau(2);
      //  System.out.println(b1);
        Laboratoire lab=new Laboratoire("ISIMG", "IoT", adr1);
        lab.ajouterBureau(b1);
        lab.ajouterBureau(b2);
      //  System.out.println(lab);
        Chercheur chr1=new Chercheur("Assili", "membre", 2083);
        Chercheur chr2=new Chercheur("Rafik", "responsable", 3003);
        Chercheur chr3=new Chercheur("Anis", "membre", 1023);
        Chercheur chr4=new Chercheur("Mariem", "membre", 9988);
        lab.affecterChercheur(chr1);
        lab.affecterChercheur(chr2);
        lab.affecterChercheur(chr3);
        lab.affecterChercheur(chr4);
        System.out.println(lab);
        
        
    }
    
}
