package istqb.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import istqb.entites.Operation;

class TestOperation {

	@Test
	@DisplayName("Ajouter 0 a 5")
	public void addZeroToFive() throws Exception {
		int res=new Operation().addToFive(0);
		assertEquals(5,res);
	}
	@Test
	@DisplayName("Ajouter -20 a 5")
	public void addMinusToFive() throws Exception {
		int res=new Operation().addToFive(-20);
		assertEquals(-15,res);
	}
	@Test
	@DisplayName("Ajouter 10 a 5")
	public void addTenToFive() throws Exception {
		int res=new Operation().addToFive(10);
		assertEquals(15,res);
	}
	@Test
	@DisplayName("Ajouter MAX_VALUE a 5")
	public void addMaxIntToFive() {
		assertThrows(Exception.class,()->new Operation().addToFive(Integer.MAX_VALUE));
	}
	@Test
	@DisplayName("Divide 4 by 2")
	void divide4by2() {
		double r = new Operation().divide(4,2);
		assertEquals(2,r,0);
	}
	@Test
	@DisplayName("Divide 4 by 2")
	void divide2by4() {
		double r = new Operation().divide(2,4);
		assertEquals(0.5,r,0);
	}
	@Test
	@DisplayName("Divide 10 by 3")
	void divide10by3() {
		double r = new Operation().divide(10,3);
		assertEquals(3.33,r,0.01);
	}
	@Test
	@DisplayName("Divide -10 by 10")
	void divideMinus10by10() {
		double r = new Operation().divide(-10,10);
		assertEquals(-1,r,0);
	}
	@Test
	@DisplayName("Divide -1 by -1")
	void divideMinus1byMinus1() {
		double r = new Operation().divide(-1,-1);
		assertEquals(1,r,0);
	}
	@Test
	@DisplayName("Divide 9 by 0")
	void divide9by0() {
		assertThrows(ArithmeticException.class,()->new Operation().divide(9,0));
		
	}
}
