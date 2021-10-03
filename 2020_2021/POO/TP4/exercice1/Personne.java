/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice1;

/**
 *
 * @author Lenovo
 */
public class Personne {
    private String prenom;

    public Personne(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void parler()
    {
        System.out.print("Je suis "+this.prenom+"\n");
    }
    
}
