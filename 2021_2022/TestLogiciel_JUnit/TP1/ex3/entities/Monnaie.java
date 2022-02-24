package entities;

import exeptions.DeviseInvalidException;
import exeptions.NegativeMonnaieException;

public class Monnaie {
	private int valeur;
	private String devise;
	public Monnaie(int valeur, String devise) throws NegativeMonnaieException {
		if(valeur <0)
			throw new NegativeMonnaieException();
		this.valeur = valeur;
		this.devise = devise;
	}
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) throws NegativeMonnaieException {
		if(valeur < 0)
			throw new NegativeMonnaieException();
		this.valeur = valeur;
	}
	public String getDevise() {
		return devise;
	}
	public void setDevise(String devise) {
		this.devise = devise;
	}
	private boolean verifierDevise(String dev) {
		return this.devise.equalsIgnoreCase(dev);
	}
	public void ajouterMonnaie(Monnaie m) throws DeviseInvalidException, NegativeMonnaieException {
		if(this.verifierDevise(m.getDevise())==false)
				throw new DeviseInvalidException();
		this.setValeur(this.getValeur()+m.getValeur());
	}
	public void retrancherMonnaie(Monnaie m) throws DeviseInvalidException, NegativeMonnaieException {
		if(this.verifierDevise(m.getDevise())==false)
				throw new DeviseInvalidException();
		this.setValeur(this.getValeur()-m.getValeur());
	}
}
