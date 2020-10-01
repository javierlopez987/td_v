package edu.tudai.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.tudai.pojo.Mostrador;
import edu.tudai.pojo.Pedido;

public class MostradorTest {
	
	private static Mostrador _defaultMostrador;
	private static Pedido _defaultPedido;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("MostradorTest -> setupBeforeClass");
		_defaultMostrador = new Mostrador();
		_defaultPedido = new Pedido();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("MostradorTest -> tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("MostradorTest -> setUp");
		
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("MostradorTest -> tearDown");
	}

	@Test
	public void testMostrador() {
		System.out.println("MostradorTest -> testMostrador");		
	}
	
	@Test
	public void testAddPedido() {
		System.out.println("MostradorTest -> testAddPedido");
		
		int cantPedidos = Mostrador.getCantidadPedidos();
		cantPedidos++;
		_defaultMostrador.agregarPedido(_defaultPedido);
		assertEquals(cantPedidos, Mostrador.getCantidadPedidos());
	}
}
