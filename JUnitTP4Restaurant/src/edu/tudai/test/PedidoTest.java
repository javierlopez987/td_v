package edu.tudai.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.tudai.pojo.Pedido;

public class PedidoTest {
	
	private static Pedido _defaultPedido;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("PedidoTest -> setupBeforeClass");
		_defaultPedido = new Pedido();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("PedidoTest -> tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("PedidoTest -> setUp");
		
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("PedidoTest -> tearDown");
	}

	@Test
	public void testPedido() {
		System.out.println("PedidoTest -> testPedido");
		
		
		
	}
}
