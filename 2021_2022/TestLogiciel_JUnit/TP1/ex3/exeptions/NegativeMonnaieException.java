package exeptions;

public class NegativeMonnaieException extends Exception{
	public NegativeMonnaieException() {
		super("Monnaie n�gative non accept�e");
	}

}
