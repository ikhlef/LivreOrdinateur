package testUnit;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import ordinateur.DisqueDur;
import ordinateur.Ordinateur;

public class TestOrdinateur {
	
	Ordinateur o1;
	DisqueDur d ;
	private static final double DELTA = 1e-15;

	@Before
	public void setUp() throws Exception {
		System.out.println("Setting it up!");
		o1 = new Ordinateur("macbook", 1399.99);
		d = new DisqueDur(500);
	}

	@Test
	public void testGetNom() {
		String mac = "macbook";
		String res = o1.getNom();
		assertEquals(mac, res);	
	}
	
	@Test
	public void testGetPrix() {
		double mac = 1399.99;
		double res = o1.getPrix();
		assertEquals(mac, res,DELTA);	
	}
	
	@Test
	public void testSetPrix() {
		double newprice = 1499.99;
		o1.setPrix(newprice);
		double res = o1.getPrix();
		assertEquals(newprice, res,DELTA);	
	}
	
	@Test
	public void testSetPrixNegatif() {
		double newprice = -1499.99;
		o1.setPrix(newprice);
		double res = o1.getPrix();
		assertEquals(0, res,DELTA);	
	}
	
	@Test
	public void testSetPrixNegatifC() {
		o1 = new Ordinateur("macbook", -1399.99);
		double res = o1.getPrix();
		assertEquals(0, res,DELTA);	
	}

	@Test
	public void testSetDisqueDur() {
		DisqueDur d = new DisqueDur(500);
		o1.setDisqueDur(d);
		DisqueDur d1 = o1.getDisqueDur();
		assertEquals(d,d1);	
	}
	
	@Test
	public void testToStringSansDisqueDur() {
		String except = "Bonjour je suis l'ordinateur : macbook et je coûte : 1399.99€";
		assertEquals(except,o1.toString());	
	}
	
	@Test
	public void testToStringAvecDisqueDur() {
		String except = "Bonjour je suis l'ordinateur : macbook et je coûte : 1399.99€ ."+"La capacité de mon disque dur est de : 500 GB";
		DisqueDur d = new DisqueDur(500);
		o1.setDisqueDur(d);
		assertEquals(except,o1.toString());	
	}
	@Test
	public void testGetCapacite() {
		int res = d.getCapacite();
		assertEquals(res, 500);
	}
	
	@Test
	public void testSetCapacite() {
		d.setCapacite(1000);
		int res = d.getCapacite();
		assertEquals(res, 1000);
	}
	
	@Test
	public void testSetCapaciteNegatif() {
		d.setCapacite(-1000);
		int res = d.getCapacite();
		assertEquals(res, 0);
	}
	
	@Test
	public void testSetCapaciteNegatifConstrucuteur() {
		d = new DisqueDur(-500);
		int res = d.getCapacite();
		assertEquals(res, 0);
	}
	
	@Test
	public void testToString() {
		assertEquals(d.toString(), "La capacité de mon disque dur est de : 500 GB");
	}
}
