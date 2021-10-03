
import java.util.*;
public class Transtypage {
    public static void main(String[]args){
        String ch="123";
        int entier=Integer.parseInt(ch);
        System.out.println(entier);
        Scanner sc=new Scanner(System.in);
        System.out.println("Donner une chaine nombre");
        String chnb=sc.nextLine();
        double nb=Double.parseDouble(chnb);
        System.out.println(nb);
    }
}
