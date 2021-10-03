import java.util.Scanner;
class ConversionDeg
{
	public static void public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Donner le Degres en Farhenheit:");
		float degF=sc.nextFloat();
		float degC=(degF-32)*5/9;
		System.out.println(degF+" F = "+degC+" C");
	}
}