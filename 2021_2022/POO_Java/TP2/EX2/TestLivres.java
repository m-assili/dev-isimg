package ex2;

public class TestLivres {
    public static void main(String[]args){
        Livre livre1=new Livre("Thinking in Java","Bruce Eckel");
        Livre livre2=new Livre("Programmer en Java","Claude Delannoy");
        // 3. Afficher les auteurs des deux livres
        System.out.println(livre1.getAuteur());
        System.out.println(livre2.getAuteur());
        // 7.a affecter des nombres de pages
        livre1.setNbPages(250);
        livre2.setNbPages(300);
        // 7.b afficher les deux livres
        System.out.println("Livre 1:"+livre1.getTitre()+"\t"+ livre1.getAuteur()+"\t"+livre1.getNbPages()+" pages");
        System.out.println("Livre 2:"+livre2.getTitre()+"\t"+ livre2.getAuteur()+"\t"+livre2.getNbPages()+" pages");
        // 7.c le nombre total de pages
        System.out.println("Nombre total des pages="+(livre1.getNbPages()+livre2.getNbPages()));
        // 8. affichage avec afficher()
        livre1.afficher();
        livre2.afficher();
        // 9. affichage avec toString
        System.out.println(livre1);
        System.out.println(livre2);
        // 15. création de 3 livres
        Livre liv3 = new Livre();
        Livre liv4 = new Livre("UML","Grady");
        Livre liv5 = new Livre("Java 17","Med",800);
        Livre liv6 = new Livre("Java 17","Med",800);
        System.out.println(liv5+"\n est = à \n"+liv6+"\n:"+(liv5==liv6)); // == compare deux adresses donc il est tjrs à false
        System.out.println(liv5+"\n est = à \n"+liv6+"\n:"+(liv5.equals(liv6)));
        // 21. affichage du nombre de livres créés
        System.out.println("Le nombre de livre cree:"+Livre.getNbLivres());
    }
}
