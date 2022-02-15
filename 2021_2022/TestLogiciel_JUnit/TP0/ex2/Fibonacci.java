package ex2;

import ex2.exceptions.NegativeValueException;

public class Fibonacci {
    public static int fibonacci(int n) throws NegativeValueException
    {
        if(n < 0) throw new NegativeValueException();
        if(n==0 || n==1)
            return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
}
