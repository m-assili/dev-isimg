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
public class TestMetiers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personne personnes[]={new Personne("Thomas"),new Menuisier("Pierre"), new Plombier("Alin")};
        
        
        for(Personne p:personnes)
            p.parler();
        
    }
    
}
