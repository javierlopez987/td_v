package edu.tudai.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.tudai.pojo.Mostrador;
import edu.tudai.pojo.Pedido;

public class CocinaTest {
	private static Mostrador _defaultMostrador;
	private static Pedido _defaultPedido;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("CocinaTest -> setupBeforeClass");
		_defaultMostrador = new Mostrador();
		_defaultPedido = new Pedido();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("CocinaTest -> tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("CocinaTest -> setUp");
		
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("CocinaTest -> tearDown");
	}

	@Test
	public void testMostrador() {
		System.out.println("CocinaTest -> testMostrador");		
	}
	
	@Test
	public void testAddPedido() {
		System.out.println("CocinaTest -> testAddPedido");
		
		int cantPedidos = Mostrador.getCantidadPedidos();
		cantPedidos++;
		_defaultMostrador.agregarPedido(_defaultPedido);
		assertEquals(cantPedidos, Mostrador.getCantidadPedidos());
	}
}
