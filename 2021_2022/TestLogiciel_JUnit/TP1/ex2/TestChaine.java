package istqb.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import istqb.entites.Chaine;

class TestChaine {
	Chaine chaine;
	@BeforeEach
	void setUp() {
		chaine = new Chaine();
	}
	@Test
	@DisplayName("tester o dans Bonjour ")
	void testNbOccurrence1() {
		chaine.setChaine("Bonjour");
		int r = chaine.nbOccurrence('o');
		assertEquals(2,r);
	}
	@Test
	@DisplayName("tester O dans Bonjour ")
	void testNbOccurrence2() {
		chaine.setChaine("Bonjour");
		int r = chaine.nbOccurrence('O');
		assertEquals(2,r);
	}
	
	@Test
	@DisplayName("tester a dans Bonjour ")
	void testNbOccurrence3() {
		chaine.setChaine("Bonjour");
		int r = chaine.nbOccurrence('a');
		assertEquals(0,r);
	}
	@Test
	@DisplayName("tester o dans Chaine vide ")
	void testNbOccurrence4() {
		chaine.setChaine("");
		int r = chaine.nbOccurrence('o');
		assertEquals(0,r);
	}
	@Test
	@DisplayName("tester O dans Bonjour ")
	void testNbOccurrence5() {
		chaine.setChaine("Bonjour");
		int r = chaine.nbOccurrence('j');
		assertEquals(1,r);
	}
	@Test
	@DisplayName("Tester KAYAK")
	void testEstPalindrome1() {
		chaine.setChaine("KAYAK");
		assertTrue(chaine.estPalindrome());
	}
	@Test
	@DisplayName("Tester KayAk")
	void testEstPalindrome2() {
		chaine.setChaine("KayAk");
		assertTrue(chaine.estPalindrome());
	}
	@Test
	@DisplayName("Tester ISTQB")
	void testEstPalindrome3() {
		chaine.setChaine("ISTQB");
		assertFalse(chaine.estPalindrome());
	}
	@Test
	@DisplayName("Tester Istqb")
	void testEstPalindrome4() {
		chaine.setChaine("Istqb");
		assertFalse(chaine.estPalindrome());
	}

}
