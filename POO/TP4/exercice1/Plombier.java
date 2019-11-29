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
public class Plombier extends Personne{
    
    public Plombier(String prenom) {
        super(prenom);
    }
    @Override
    public void parler(){
        super.parler();
        System.out.println("Le plombier!\n");
    }
    
}
