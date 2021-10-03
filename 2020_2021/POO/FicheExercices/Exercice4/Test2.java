/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice4;

/**
 *
 * @author Lenovo
 */
public class Test2 {
    public static void main(String[] args) {
        Animal chat = new Animal("chat");
        Animal chien = new Animal("Chien", false);
        chat=chien;
        chat.setFemelle(true);
        System.out.println(chat.toString());
        System.out.println(chien.toString());
    }
    
}
