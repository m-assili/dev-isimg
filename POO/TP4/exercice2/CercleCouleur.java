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
public class CercleCouleur extends Cercle{
    private String couleur;

    public CercleCouleur(String couleur, Point centre, double rayon) {
        super(centre, rayon);
        this.couleur = couleur;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println(" de couleur:"+this.couleur+"\n");
    }
    
    
}
