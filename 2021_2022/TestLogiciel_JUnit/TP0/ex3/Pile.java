package ex3;

import ex3.exceptions.ParentheseOuvrantException;

import java.util.ArrayList;
import java.util.List;

public class Pile {
    private List<Character> chars;
    Pile(){
        chars = new ArrayList<>();
    }
    public void empiler(char c){
        chars.add(c);
    }
    public Character depiler() throws ParentheseOuvrantException {
        if(chars.size()>0)
            return chars.remove(chars.size()-1);
        else
            throw new ParentheseOuvrantException();
    }
    public int getSize(){
        return chars.size();
    }
}
