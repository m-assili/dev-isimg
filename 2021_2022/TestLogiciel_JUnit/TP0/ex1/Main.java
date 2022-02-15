package ex1;

import ex1.exceptions.IllegalDivisionException;
import ex1.exceptions.ValueTooLargeException;

public class Main {
    public static void main(String[] args){
        try {
            System.out.println(UtilitaireOperation.add(2000000000, 2000000000));
        }catch (ValueTooLargeException e){
            System.out.println("Addition:"+e.getMessage());
        }

        try {
            System.out.println(UtilitaireOperation.multiply(999999999, 999999999));
        }catch (Exception e){
            System.out.println("Multiplication:"+e.getMessage());
        }
        try{
            System.out.println(UtilitaireOperation.divide(1,0));
        }catch (IllegalDivisionException ex){
            System.out.println(ex.getMessage());
        }
    }
}
