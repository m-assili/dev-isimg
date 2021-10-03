import java.util.Scanner;
class Calculatrice
{
	public static void public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Donner nb1:");
		int nb1=sc.nextInt();
		System.out.println("Donner nb2:");
		int nb2=sc.nextInt();
		System.out.println("Donner Operation (+,-,*,/):");
		String op=sc.next();
		switch(op){
             case "+":System.out.println(nb1+" + "+nb2+" = "+ (nb1+nb2));
				break;
            case "-":System.out.println(nb1+" - "+nb2+" = "+ (nb1-nb2));
			break;
                    case "*":System.out.println(nb1+" * "+nb2+" = "+ (nb1*nb2));
			break;
                    case "/": if(nb2==0)
					System.out.println("Impossible division par Zero");
				else
					System.out.println(nb1+" / "+nb2+" = "+ ((float)nb1/(float)nb2));
			break;

		}

	}
}