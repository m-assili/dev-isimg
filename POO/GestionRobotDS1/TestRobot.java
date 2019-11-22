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
public class TestRobot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Robot r1=new Robot("Smarty", 2, 3, "Nord");
        Robot r2=new Robot("Marius", 4, 2, "Sud");
        Robot r3=new Robot("Alpha");
        Robot r4=new Robot();
        
        r1.avance();
        r2.droite();
        // tourner r3 de 270° --> c'est faire tourner r3 3 fois
        r3.droite();
        r3.droite();
        r3.droite();
        r3.avance();
        // tableau de robots
        Robot[] robots={r1,r2,r3,r4};
        // trie du tableau selon la distance de manhattan
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
                if(TestRobot.distanceManhattan(robots[i].getX(), robots[i].getY()) < TestRobot.distanceManhattan(robots[j].getX(), robots[j].getY()) )
                {
                    Robot raux=robots[i];
                    robots[i]=robots[j];
                    robots[j]=raux;
                }
        // affichage du tableau
        for(Robot r:robots)
        {
            r.afficher();
           System.out.println( TestRobot.distanceManhattan(r.getX(), r.getY())+"\n");
        }
    }
    public static int distanceManhattan(int x,int y){
        return Math.abs(x)+Math.abs(y);
    }
    
}
