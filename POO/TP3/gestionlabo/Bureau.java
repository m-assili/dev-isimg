/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionlabo;

/**
 *
 * @author Lenovo
 */
public class Bureau {
    final int CH_MAX=3;
   private int code;
   private Chercheur chercheurs[];
   private int nbCh;
   public Bureau(int code){
       this.code = code;
       this.nbCh=0;
       chercheurs=new Chercheur[CH_MAX];
   }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getNbCh() {
        return nbCh;
    }

    public void setNbCh(int nbCh) {
        this.nbCh = nbCh;
    }

    public Chercheur[] getChercheurs() {
        return chercheurs;
    }
    
   public void ajouterChercheur(Chercheur ch){
       this.chercheurs[this.nbCh++]=ch;
   }

    @Override
    public String toString() {
        String ch= "Bureau{code=" + code + ", Nombre Chercheurs=" + nbCh + "\n";
        for(Chercheur chr:this.chercheurs)
            if(chr!=null)
                ch+="\t"+chr.toString();
        
        return ch;
    }
   
    
}
