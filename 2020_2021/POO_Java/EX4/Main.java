public class Main {
    public static void main(String[]args){
        Eleve eleve = new Eleve("Ahmed Tounsi");
        eleve.ajouterNote(19.5);
        eleve.ajouterNote(20);
        eleve.ajouterNote(18.75);
        eleve.ajouterNote(12.33);
        System.out.println(eleve);
        System.out.println("**************");
        double[] list = eleve.getNotes();
        for (double note:list)
            System.out.println("["+note+"]");
    }
}
