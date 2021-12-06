package ex4;

public class Main {
    public static void main(String[]args){
        Entier e1 = new Entier(5);
        Entier e2 = new Entier(2);
        Addition addition = new Addition(e1,e2);

        System.out.println(addition.decompiler()+"="+addition.evaluer());


    }
}
