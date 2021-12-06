package ex3;

public class Main {
    public static void main(String S[])
    {
        Personnage PJ1 = new Personnage();
        PJ1.setName("Chevalier miteux...");
        PJ1.setDescription("personnage alcoolique mais chevaleresque...");
        Personnage gobelin1 = new Personnage();
        gobelin1.setName("Gobelin Teigneux");
        gobelin1.setDescription("Petit humanoide verdatre et primitif...");
        Objet gourde = new Objet();
        gourde.setDescription("Petite gourde en peau");
        Objet epee = new Objet();
        epee.setDescription("Epee Durandil");
        Objet casque = new Objet();
        casque.setDescription("Casque Lebohaum");
        System.out.println("-----------------------------");
        System.out.println("Affichage Personnages : ");
        System.out.println(PJ1.getDescription());
        System.out.println(gobelin1.getDescription());
        System.out.println("-----------------------------");
        System.out.println("Affichage Objets");
        System.out.println(gourde.getDescription());
        System.out.println(epee.getDescription());
        System.out.println(casque.getDescription());
        System.out.println("-----------------------------");
        System.out.println("Un peu d'equipement ? ");
        /* Normalement, c'est vide */
        System.out.println(PJ1.afficheInventaire());
        /* Ajoutons quelques objets */
        try {


            PJ1.ajouterObjet(epee);
            PJ1.ajouterObjet(gourde);
            PJ1.ajouterObjet(casque);
            /* Normalement, c'est plein */
            System.out.println(PJ1.afficheInventaire());
            /* Un nouvel objet pour voir */
            Objet armure = new Objet();
            armure.setDescription("Armure rutilante");
            /* On essai de le rajouter, normalement, c'est impossible */
            PJ1.ajouterObjet(armure);
            System.out.println(PJ1.afficheInventaire());
            /* On pose d'abord un objet, puis on essai à nouveau  */
            PJ1.poseObjet(0); /* dehors l'objet 0 */
            System.out.println(PJ1.afficheInventaire());
            PJ1.ajouterObjet(armure);
            System.out.println(PJ1.afficheInventaire());
            /* Testons la vitalité de notre personnage */
            System.out.println("Point de vie actuels : " + PJ1.getVie());
            System.out.println("Point de vie maximal : " + PJ1.getVieMax());
            /* On change son nom ? */
            System.out.println(PJ1.getDescription());
            PJ1.setName("Bob");
            System.out.println(PJ1.getDescription());
            /**************************************************************
             MISE EN PLACE DU NIVEAU...
             **************************************************************/
            /* on crée quelques types de décors ? */
            Decor mur1 = new Decor();
            Decor mur2 = new Decor();
            mur1.setDescription("C'est un mur en bois, pas très épais");
            mur2.setDescription("C'est un mur en pierre, ça à l'air solide");
            /* Construction d'un niveau avec le constructeur par défaut */
            Niveau monNiveau1 = new Niveau();
            /* Mur en bois */
            monNiveau1.setElement(1, 1, mur1);
            monNiveau1.setElement(1, 2, mur1);
            monNiveau1.setElement(1, 3, mur1);
            /* mur en pierre */
            monNiveau1.setElement(5, 5, mur2);
            monNiveau1.setElement(5, 6, mur2);
            /* Certains objets trainent par terre... */
            monNiveau1.setElement(3, 3, epee);
            monNiveau1.setElement(3, 4, casque);
            /* Et en plus, y'a des monstres... */
            monNiveau1.setElement(7, 7, gobelin1);
            monNiveau1.setElement(8, 8, gobelin1);
	/*
	  Question : Si le gobelin qui est dans la case 7,7 est modifié
	  (perte de points de vie par exemple)
	  Que ce passe-t-il pour le gobelin dans la case 8,8 ?
	 */
            System.out.println(monNiveau1.decritCarte());
            /* Au fait, mon constructeur de niveau a-t-il bien crée un personnage par 	défaut ? */
            Personnage toto = monNiveau1.getPersonnagePrincipal();
            System.out.println(toto.getDescription());
            /* Changeons de personnage principal */
            monNiveau1.setPersonnagePrincipal(PJ1);
            /* Et verifions le deroulement... */
            toto = monNiveau1.getPersonnagePrincipal();
            System.out.println(toto.getDescription());
            /* On crée un nouveau niveau, avec le second constructeur */
            Niveau nouveauNiveau = new Niveau(PJ1);
            /* On teste ... */
            toto = monNiveau1.getPersonnagePrincipal();
            System.out.println(toto.getDescription());
            System.out.println(nouveauNiveau.decritCarte());
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
