package ex2;

import ex2.exceptions.NegativeValueException;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Donner un entier positif:");
        int n = in.nextInt();
        try {
            System.out.println("f("+n+")="+Fibonacci.fibonacci(n));
        } catch (NegativeValueException e) {
            System.out.println(e.getMessage());
        }
    }
}
