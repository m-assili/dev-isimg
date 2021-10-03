public class Eleve {
    private String nom;
    private double[] notes;
    private double moyenne;
    private int nbNotes;
    public Eleve(String nom){
        this.nom = nom;
        notes = new double[10];
        nbNotes = 0;
    }
    private void mettreAJourMoyenne(){
        int i;
        double s;
        for( i=0, s=0.0;i<nbNotes;i++)
            s+=notes[i];
        this.moyenne = s / i;
    }
    public void ajouterNote(double note){
        if(note<0)
            note = 0;
        else if (note > 20)
            note = 20;

        notes[nbNotes++]=note;
        this.mettreAJourMoyenne();
    }
    public double getMoyenne(){
        return moyenne;
    }

    public double[] getNotes() {
        return notes;
    }
    public int getNbNotes(){
        return nbNotes;
    }

    public String toString(){
        return nom+"("+moyenne+")";
    }
}
