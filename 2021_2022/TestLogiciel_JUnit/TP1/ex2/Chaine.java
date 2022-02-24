package istqb.entites;

public class Chaine {
	private String chaine;
	public void setChaine(String chaine) {
		this.chaine = chaine;
	}
	public int nbOccurrence(char c) {
		int nb = 0;
		for(int i=0;i<chaine.length();i++)
			if(Character.toUpperCase(chaine.charAt(i))==Character.toUpperCase(c))
			nb++;
		return nb;
	}
	public boolean estPalindrome() {
		return new StringBuilder(chaine).reverse().toString().equalsIgnoreCase(chaine);
	}

}
