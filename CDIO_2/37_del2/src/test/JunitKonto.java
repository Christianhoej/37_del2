package test;
import spil.Konto;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import desktop_resources.GUI;

public class JunitKonto {

	Konto kontoTest1;
	Konto kontoTest2;
	Konto kontoTest3;
	
	@Before
	public void setUp() throws Exception {
		kontoTest1 = new Konto(0,0,3000);
		kontoTest2 = new Konto(1000,0,3000);
		kontoTest3 = new Konto(2900,0,3000);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNegativBeholdning() {
		// returnerer true, hvis beholdning bliver negativ og derfor bliver sat til 0.
		kontoTest1.opdaterBeholdning(-10);
		int actual = kontoTest1.getBeholdning();
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testOpdaterBeholdning1() {

		kontoTest2.opdaterBeholdning(-180);
		int actual = kontoTest2.getBeholdning();
		int expected = 1000-180;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testOpdaterBeholdning() {
		// returnerer true, hvis beholdning bliver negativ og derfor bliver sat til 0.
		kontoTest2.opdaterBeholdning(180);
		int actual = kontoTest2.getBeholdning();
		int expected = 1180;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testVinder() {
		// tester, om der vindes, hvis beholdningen kommer over 3000. 
		kontoTest3.opdaterBeholdning(100);
		boolean vinder;
		if(kontoTest3.getBeholdning() >= kontoTest3.getVinderBeholdning()) {
			vinder=true;
		}
		else vinder = false;
		
		boolean actual = vinder;
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
}

