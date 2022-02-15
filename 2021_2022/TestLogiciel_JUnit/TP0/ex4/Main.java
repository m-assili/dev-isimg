package ex4;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[]args){
        List<Personne> personnes = new ArrayList<>();
        personnes.add(new Personne("Med","AAssili",41));
        personnes.add(new Personne("Ahmed","Haddadi",8));
        personnes.add(new Personne("Saima","Azzi",38));
        personnes.add(new Personne("Hasna","Mizouri",65));
        personnes.add(new Personne("Mariem","Adeli",45));
 afficherSelon(personnes,p1 -> p1.getAge() > 40,(p1, p2)->p1.getLastName().compareTo(p2.getLastName()),personne->System.out.println(personne));
    }
    public static void afficherSelon(List<Personne> personnes, Predicate<Personne> filtre,Comparator<Personne> criteres, Consumer<Personne> affichage){
        personnes.stream().filter(filtre).sorted(criteres).forEach(affichage);
    }
}
