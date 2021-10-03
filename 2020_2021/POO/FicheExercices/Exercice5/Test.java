/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice5;

/**
 *
 * @author Lenovo
 */
public class Test {

    public static void main(String[] args) {
        Point a = new Point(1,3);
        Point b = new Point(1,3);
        Point c = new Point(2,4);
        Point d=b;
        if(a==b)
            System.out.println("A et B ont la meme adresse, c'est la même instance");
        else
            System.out.println("A et B n'ont pas la meme adresse");
        if(a.equals(b))
            System.out.println("A et B sont égaux, superposés");
        else
            System.out.println("A et B sont différents");
        
        // déplacement du point D
        d.setX(2);
        d.setY(a.getX()+3);
        
        if(b.equals(c))
            System.out.println("B et C sont égaux, superposés :)");
        if(b!=c) 
            System.out.println("B et C contiennent des adresses différentes");
        if(d==b)
            System.out.println("B et D pointent vers la même adresse, même instance");
        if(a.equals(b)|| a==b)
            System.out.println("Il faut que je révise mon cours");
        else
            System.out.println("J'ai bien compris");
        
        
        
    }
    
}
