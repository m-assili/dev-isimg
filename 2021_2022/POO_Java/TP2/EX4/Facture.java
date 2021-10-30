package ex4;

import java.util.Calendar;
import java.util.Date;

public class Facture {
    private static long numero=0;
    private Date dateFacturation;
    private LigneFacture lignes[];
    private int nbLigne;
    public Facture(){
        numero++;
        dateFacturation = Calendar.getInstance().getTime();
        lignes = new LigneFacture[5000];
        nbLigne = 0;
    }
    public void ajouterAchat(LigneFacture ligneFacture){
        lignes[nbLigne++]=ligneFacture;
    }
    public void afficher()
    {
        for (LigneFacture l:lignes ) {
            if(l!=null)
                System.out.println(l.toString());
        }
    }
    public double montant(){
        double montant=0;
            for (LigneFacture lig:lignes)
                if(lig!=null)
                    montant+=lig.getArticle().getPrix();


        return montant;
    }
}
