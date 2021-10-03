
public class Tableaux {

    public static void plusPetit(int t[]){
        int min=t[0];
        for(int i=1;i<t.length;i++)
        {
            if(t[i]<min)
                min=t[i];
        }
        System.out.println("Le plus petit entier du tableau est:"+min);
    }
    public static void trierTableau(int t[])
    {
        int aux;
        for(int i=0;i<t.length-1;i++)
            for(int j=i+1;j<t.length;j++)
                if(t[i]>t[j])
                {
                    aux=t[i];
                    t[i]=t[j];
                    t[j]=aux;
                }
    }
    public static void afficherTableau(int t[]){
    for(int i=0;i<t.length;i++)
        System.out.println("["+t[i]+"]");
    }
    public static void main(String[] args) {
       int t1[],t2[];
       t1=new int[5];
       t2=new int[5];
       t2[0]=1;
       t2[1]=567;
       t2[2]=-23;
       t2[3]=78;
       t2[4]=5;
       int t3[]={5,7,11};
       Tableaux.plusPetit(t3);
       Tableaux.trierTableau(t3);
       Tableaux.afficherTableau(t3);
       
    }
   
    
}
