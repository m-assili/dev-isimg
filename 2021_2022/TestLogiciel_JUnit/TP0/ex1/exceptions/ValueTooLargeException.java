package ex1.exceptions;

public class ValueTooLargeException extends Exception{
    public ValueTooLargeException(){
        super("Valeur trop grande pour un entier!!");
    }
}
