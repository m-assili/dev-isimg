import java.util.Scanner;

public class Principal {
    static Scanner clavier;
    static void init(){
        clavier = new Scanner(System.in);
    }
    static double serie(int n){
        double somme=0;
        for(int i=1;i<=n;i++)
            somme+=1/(float)i;
        return somme;
    }
    static void saisonV1(String mois){
        switch (mois.toLowerCase()){
            case "décembre":
            case "janvier":
            case "février": System.out.println(mois+ " est en Hiver");
            break;
            case "mars":
            case "avril":
            case "mai": System.out.println(mois+ " est en Printemps");
            break;
            case "juin":
            case "juillet":
            case "aout": System.out.println(mois+ " est en Eté");
            break;
            case "septembre":
            case "octobre":
            case "novembre": System.out.println(mois+ " est en Automne");
            break;
            default:System.out.println(mois+ " est incorrecte");
        }
    }
    static void saisonV2(String mois) {
        String saison = switch (mois.toLowerCase()) {
            case "décembre", "janvier", "février" -> "Hiver";
            case "mars", "avril", "mai" -> "Printemps";
            case "juin", "juillet", "aout" -> "Eté";
            case "septembre", "octobre", "novembre" -> "Automne";
            default -> "non reconnu";
        };
        System.out.println(mois + "est en "+ saison);
    }
    static void dessinTrinagleEtoile(int ligne){

        for(int i=1; i<=ligne; i++)
        {
            for(int espace=1; espace<=ligne-i; espace++)
                System.out.print(" ");
            for(int etoile=0;etoile<2*i-1;etoile++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void main(String[] args){
        init();
        System.out.println("Donner le nombre de terme de la serie:");
        int n = clavier.nextInt();
        System.out.println("La valeur de la serie ="+serie(n));
        System.out.println("Donner le mois:");
        String mois = clavier.next();
        System.out.print("Switch v1");
        saisonV1(mois);
        System.out.print("Switch v2");
        saisonV2(mois);
        System.out.print("Donner le nombre de ligne:");
        dessinTrinagleEtoile(clavier.nextInt());
    }
}
