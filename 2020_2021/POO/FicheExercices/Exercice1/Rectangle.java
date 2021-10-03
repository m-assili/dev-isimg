/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice1;

/**
 *
 * @author Lenovo
 */
public class Rectangle {
    private String nom;
    private double longueur;
    private double largeur;

    public Rectangle(String nom, double longueur, double largeur) {
        this.nom = nom;
        this.longueur = longueur;
        this.largeur = largeur;
    }
    public double getPerimetre(){
        return (this.largeur+this.longueur)*2;
    }

    @Override
    public String toString() {
        return "{" + "nom=" + nom + ", longueur=" + longueur + ", largeur=" + largeur + '}';
    }
    
    
}
