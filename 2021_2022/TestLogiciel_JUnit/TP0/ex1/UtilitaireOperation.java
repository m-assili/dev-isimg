package ex1;

import ex1.exceptions.IllegalDivisionException;
import ex1.exceptions.ValueTooLargeException;

public class UtilitaireOperation {
    public static int add(int a,int b) throws ValueTooLargeException {
        long res =  (long) a + (long) b;
        if(res>Integer.MAX_VALUE || res < Integer.MIN_VALUE)
            throw new ValueTooLargeException();
        return a+b;
    }
    public static int substract(int a, int b){
        return a-b;
    }

    public static int multiply(int a,int b) throws ValueTooLargeException {
        long res = (long)a*(long)b;
        if(res>Integer.MAX_VALUE)
            throw new ValueTooLargeException();
        return a*b;
    }
    public static double divide(int a,int b) throws IllegalDivisionException
    {
        if(b==0) throw new IllegalDivisionException();
        return (double)a/b;
    }

}
