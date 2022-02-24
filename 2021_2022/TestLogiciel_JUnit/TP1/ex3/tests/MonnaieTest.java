package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import entities.Monnaie;
import exeptions.DeviseInvalidException;
import exeptions.NegativeMonnaieException;

class MonnaieTest {

	@Test
	@DisplayName("Tester une monnaie négative")
	void testMonnaie() {
		
		assertThrows(NegativeMonnaieException.class,()->new Monnaie(-3,"DT"));
	}

	@Test
	@DisplayName("Ajouter 1DT à 2 DT")
	void testAjouterMonnaie() throws NegativeMonnaieException, DeviseInvalidException {
		Monnaie m1=new Monnaie(1,"DT");
		Monnaie m2=new Monnaie(2,"DT");
		m1.ajouterMonnaie(m2);
		assertEquals("1DT+2DT",3,m1.getValeur());
	}
	@Test
	@DisplayName("Ajouter 1DT à 2 Eur")
	void testAjouterMonnaie2() throws NegativeMonnaieException, DeviseInvalidException {
		Monnaie m1=new Monnaie(1,"DT");
		Monnaie m2=new Monnaie(2,"Eur");
		
		assertThrows(DeviseInvalidException.class,()->m1.ajouterMonnaie(m2));
	}
	@Test
	@DisplayName("Ajouter 5eur à 7 Eur")
	void testAjouterMonnaie3() throws NegativeMonnaieException, DeviseInvalidException {
		Monnaie m1=new Monnaie(5,"eur");
		Monnaie m2=new Monnaie(7,"Eur");
		m1.ajouterMonnaie(m2);
		assertEquals(12,m1.getValeur());
	}
	@Test
	@DisplayName("Ajouter 10 Dol à 20 Eur")
	void testAjouterMonnaie4() throws NegativeMonnaieException, DeviseInvalidException {
		Monnaie m1=new Monnaie(10,"Dol");
		Monnaie m2=new Monnaie(20,"Eur");
		assertThrows(DeviseInvalidException.class,()->m1.ajouterMonnaie(m2));
	}
	@Test
	@DisplayName("Retrancher 10 Dol à 20 Eur")
	void testSubMonnaie1() throws NegativeMonnaieException, DeviseInvalidException {
		Monnaie m1=new Monnaie(10,"Dol");
		Monnaie m2=new Monnaie(20,"Eur");
		assertThrows(DeviseInvalidException.class,()->m1.retrancherMonnaie(m2));
	}
	@Test
	@DisplayName("Retrancher 20 Dol à 10 Dol")
	void testSubMonnaie2() throws NegativeMonnaieException, DeviseInvalidException {
		Monnaie m1=new Monnaie(10,"Dol");
		Monnaie m2=new Monnaie(20,"Dol");
		assertThrows(NegativeMonnaieException.class,()->m1.retrancherMonnaie(m2));
	}
	@Test
	@DisplayName("Retrancher 20 Dol à 20 Dol")
	void testSubMonnaie3() throws NegativeMonnaieException, DeviseInvalidException {
		Monnaie m1=new Monnaie(20,"Dol");
		Monnaie m2=new Monnaie(20,"Dol");
		m1.retrancherMonnaie(m2);
		assertEquals(0,m1.getValeur());
	}
	@Test
	@DisplayName("Retrancher 10 Dol à 20 Dol")
	void testSubMonnaie4() throws NegativeMonnaieException, DeviseInvalidException {
		Monnaie m1=new Monnaie(20,"Dol");
		Monnaie m2=new Monnaie(10,"Dol");
		m1.retrancherMonnaie(m2);
		assertEquals(10,m1.getValeur());
	}

}
