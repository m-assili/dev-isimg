/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice1;

/**
 *
 * @author Lenovo
 */
public class TestRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle tabRec[]={new Rectangle("rec1",10,5)
                ,new Rectangle("rec2",10,8)
                , new Rectangle("rec3",15,2)
                ,new Rectangle("rec4",12,3)
                };
        TestRectangle.trier(tabRec);
        TestRectangle.afficher(tabRec);
    }
    public static void trier(Rectangle[]t)
    {
        Rectangle aux;
        for(int i=0;i<t.length-1;i++){
            for(int j=i+1;j<t.length;j++)
            if(t[i].getPerimetre()<t[j].getPerimetre())
            {
                aux=t[i];
                t[i]=t[j];
                t[j]=aux;
            }
        }
    }
    public static void afficher(Rectangle []t)
    {
        for(Rectangle r:t)
            System.out.println(r.toString()+"Perimetre="+r.getPerimetre());
    }
}
