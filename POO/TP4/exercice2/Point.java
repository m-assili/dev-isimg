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
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void afficher(){
        System.out.println("Point( "+this.x+" , "+this.y+" )");
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    
}
