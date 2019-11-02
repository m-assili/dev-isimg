/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice4;

/**
 *
 * @author Lenovo
 */
public class Animal {
    private String espece;
    private boolean femelle;
    public Animal(String espece){
        this.espece=espece;
    }
    public Animal(String espece, boolean estfemelle){
        this(espece);
        this.femelle=estfemelle;
    }
    public String getEspece() {
        return espece;
    }
    public void setEspece(String espece) {
        this.espece = espece;
    }
    public boolean isFemelle() {
        return femelle;
    }
    public void setFemelle(boolean femelle) {
        this.femelle = femelle;
    }    
    @Override
    public String toString() {
        String chaine= "Animal ["+espece + ", ";
        if(isFemelle())
            chaine+= "femelle ]";
        else
            chaine+= "mâle ]";
        return chaine;
    }
}
