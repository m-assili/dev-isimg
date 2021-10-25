package ex1;

import java.util.regex.Pattern;

public class Personne {
    private String firstName;
    private String lastName;
    public void setFirstName(String first){
        if(isAlphabetic(first))
            this.firstName=first;
        else
            System.out.println("Erreur sur le prénom!!");
    }
    public void setLastName(String last){
        if(isAlphabetic(last))
            this.lastName=last;
        else
            System.out.println("Erreur sur le nom!!");
    }
    private boolean isAlphabetic(String ch){
        // On supprime tous les espaces de ch
        ch=ch.replace(" ","");
        // on vérifier si tous les caracères sont alphabétiques
        // en utilisant l'API regex
        return Pattern.matches("[a-zA-Z]+",ch);

    }
    public String toString(){
        return this.firstName + " " + this.lastName;
    }
    public void afficher(){
        System.out.println("Je suis "+this.toString());
    }
}
