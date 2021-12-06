package ex3;

public class Niveau {
    private Element[][] carte;
    private Personnage pj;
    private String titre;
    Niveau(){
        this.pj = new Personnage();
        this.carte = new Element[10][10];
    }
    Niveau(Personnage pj){
        this.pj = pj;
        this.carte = new Element[10][10];
    }
    public void setElement(int i, int j, Element k){
        if((i>=0&&i<10)&& (j>=0&&j<10)&&(carte[i][j]==null))
            carte[i][j] = k;
    }
    public Element getElement(int i, int j){
        if((i>=0&&i<10)&& (j>=0&&j<10))
            return carte[i][j];
        else
            return null;
    }
    public String decritCarte(int i, int j){
        if((i>=0&&i<10)&& (j>=0&&j<10))
            return carte[i][j].getDescription();
        else
            return "Case Vide";
    }
    public String decritCarte(){
        String ch="";
        for(int i=0;i<10;i++) {
            for (int j = 0; j < 10; j++) {
                ch += decritCarte(i, j);
            }
            ch+="\n";
        }
        return ch;
    }
    public Personnage getPersonnagePrincipal(){
        return this.pj;
    }
    public void setPersonnagePrincipal(Personnage personnagePrincipal){
        this.pj = personnagePrincipal;
    }
    public String getTitre(){
        return titre;
    }
    public void setTitre(String titre){
        this.titre = titre;
    }
}
