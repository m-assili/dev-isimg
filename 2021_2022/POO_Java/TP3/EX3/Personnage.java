package ex3;

public class Personnage extends Element{
   private String name;
   private int vie;
   private int vieMax;
   private Objet[] equipements;
   private int nbObjs;

    public Personnage() {
        this.equipements = new Objet[3];
        this.nbObjs = 0;
    }

    @Override
    public String getType() {
        return "PERSONNAGE";
    }
    public String getDescription(){
        return "Personnage["+name
                +", Vie:"+vie
                +", Max Vie:"+vieMax+"]";
    }
    public String afficheInventaire(){
        String ch="";
        for(Objet o:equipements)
            if(o!=null)
                ch+=o.getDescription();

            return ch;
    }
    public void ajouterObjet(Objet i)throws Exception{
        if(nbObjs<3)
            this.equipements[nbObjs++]=i;
        else
            throw new Exception("Tableau plein");
    }
    public Objet poseObjet(int numero){
        if(numero<nbObjs){
            Objet obj=equipements[numero];
            for(int i=numero;i<nbObjs;i++)
                if(i<nbObjs-1)
                    equipements[i]=equipements[i+1];
                equipements[this.nbObjs--]=null;
                return obj;
        }
        else
            return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVie() {
        return vie;
    }

    public int getVieMax() {
        return vieMax;
    }
}
