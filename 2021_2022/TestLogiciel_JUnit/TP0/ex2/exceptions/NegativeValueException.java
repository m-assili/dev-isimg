package ex2.exceptions;

public class NegativeValueException extends Exception{
    public NegativeValueException(){
        super("Attention la valeur doit être positive !!");
    }
}
