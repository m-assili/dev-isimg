package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import classes.Chaine;

class ChaineTest {

	@ParameterizedTest
	@ValueSource(strings= {"ABC","assili","kayaak","12332"})
	void testChaineNonPalind(String ch) {
		Chaine c=new Chaine(ch);
		assertFalse(c.estPalindrome());
	}
	@ParameterizedTest
	@ValueSource(strings= {"ABBA","KAYAK","kayak","123321","Radar"," "})
	void testChainePalind(String ch) {
		Chaine c=new Chaine(ch);
		assertTrue(c.estPalindrome());
	}
	@ParameterizedTest
	@CsvSource({"bonjour,o,2","bonne,o,1","BONJOUR,o,2","test logiciel,a,0"})
	void testNbOccurrence(String ch,char c,int nb) {
		Chaine chaine=new Chaine(ch);
		assertEquals(nb,chaine.occurrence(c));
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "/sourceValues.csv", numLinesToSkip = 1)
	void testNbOccurrence2(String ch,char c,int nb) {
		Chaine chaine=new Chaine(ch);
		assertEquals(nb,chaine.occurrence(c));
	}
}
