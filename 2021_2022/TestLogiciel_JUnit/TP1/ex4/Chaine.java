package classes;

public class Chaine {
	private String chaine;

	public Chaine(String chaine) {
		this.chaine = chaine;
	}
	public Chaine() {
	}

	public String getChaine() {
		return chaine;
	}

	public void setChaine(String chaine) {
		this.chaine = chaine;
	}
	public boolean estPalindrome() {
		return new StringBuilder(chaine).reverse().toString().equalsIgnoreCase(chaine);
	}
	public int occurrence(char c) {
		int nb=0;
		if(chaine!=null)
			for(int i=0;i<chaine.length();i++)
				if(chaine.charAt(i)==c || chaine.charAt(i)==Character.toUpperCase(c))
					nb++;
		return nb;
	}

}
