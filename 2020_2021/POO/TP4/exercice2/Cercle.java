/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice2;

/**
 *
 * @author Lenovo
 */
public class Cercle {
    private Point centre;
    private double rayon;

    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }
    public double perimetre(){
        return 2*Math.PI*this.rayon;
    }
    public void afficher(){
        System.out.println("Cercle("+centre.getX()+","+centre.getY()+","+this.rayon+")");
    }
    
    
}
