
import java.util.Scanner;

public class PGCD {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Donner a et b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("PGCD("+a+","+b+")="+PGCD.pgcd_recursive(a, b));
        
    }
    public static int pgcd_iterative(int a, int b){
        while ( a != b )
        {
            if ( a < b )
                b = b - a;
            else
                a = a - b;
        }
        return a;
    }
    public static int pgcd_recursive(int a, int b){
        if(a==b)
            return a;
        else
            if(a<b)
               return pgcd_recursive(a,b-a);
            else
                return pgcd_recursive(a-b,b);
    }
}
