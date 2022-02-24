package exeptions;

public class NegativeMonnaieException extends Exception{
	public NegativeMonnaieException() {
		super("Monnaie négative non acceptée");
	}

}
