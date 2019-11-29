
package exercice2;

import java.text.DecimalFormat;


public class TestCercles {

    public static void main(String[] args) {
        Cercle cercle1=new Cercle(new Point(2,1), 2);
        Cercle cercle2=new Cercle(new Point(3,1), 1);
        Cercle cercleRouge=new CercleCouleur("Rouge", new Point(0,0), 1);
        
        Cercle mes_cercles[]={cercle1,cercle2,cercleRouge};
       // si on veut préciser le nombre de chiffre après la virgule
        DecimalFormat df=new DecimalFormat();
        df.setMaximumFractionDigits(2);
        for(Cercle c:mes_cercles)
            System.out.println("Périmetre Cercle:"+df.format(c.perimetre()));
        
        
    }
    
}
