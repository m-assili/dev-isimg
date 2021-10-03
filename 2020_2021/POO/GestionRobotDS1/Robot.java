/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.robot;

/**
 *
 * @author Lenovo
 */
public class Robot {
    private String nom;
    private int x;
    private int y;
    private String direction;
    public void avance()
    {
        switch(this.direction)
        {
            case "Nord":this.y++;break;
            case "Est":this.x++;break;
            case "Sud":this.y--;break;
            case "Ouest":this.x--;break;
        }
    }
    public void droite()
    {
        switch(this.direction)
        {
            case "Nord": this.direction="Est";break;
            case "Est":this.direction="Sud";break;
            case "Sud":this.direction="Ouest";break;
            case "Ouest":this.direction="Nord";break;
        }
    }
    public void afficher()
    {
        System.out.println("Nom:"+this.nom+"Position:("+this.x+" , "+this.y+")\t Direction:"+this.direction +"\n");
    }

    public Robot(String nom, int x, int y, String direction) {
        this.nom = nom;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Robot(String nom) {
        this.nom = nom;
        this.x=0;
        this.y=0;
        this.direction="Est";
    }
    public Robot(){
        this("Anonyme");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
