/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice2;

/**
 *
 * @author Lenovo
 */
public class Test2 {
    public static void main(String[] args) {
        String ch = new String("Bonjou");
        ajouterUnR(ch);
    }
    public static void ajouterUnR(String s){
        char c='r';
        s+=c;
        System.out.println(s);
    }
}
