package edu.tudai.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.tudai.pojo.Cocina;
import edu.tudai.pojo.Ingrediente;
import edu.tudai.pojo.ItemPedido;
import edu.tudai.pojo.ItemReceta;
import edu.tudai.pojo.Mostrador;
import edu.tudai.pojo.Pedido;
import edu.tudai.pojo.Producto;
import edu.tudai.pojo.ProductoBasico;
import edu.tudai.pojo.ProductoElaborado;
import edu.tudai.pojo.Receta;
import edu.tudai.pojo.Usuario;

public class CargaPedidosTest {
	private static Mostrador _defaultMostrador;
	private static Cocina _defaultCocina;
	private static List<Pedido> _defaultPedidos;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("CargaPedidosTest -> setupBeforeClass");
		Ingrediente huevo = new Ingrediente("huevo", "unidades", 240, 0);
		Ingrediente papa = new Ingrediente("Papa", "gramos", 20000, 0);
		Ingrediente sal = new Ingrediente("Sal", "gramos", 1000, 0);
		Ingrediente carnePicada = new Ingrediente("Carne picada", "grmos", 10000, 0);
		Ingrediente panHamburguesa = new Ingrediente("Pan de Hamburguesa", "unidades", 100, 0);

		ItemReceta ir1 = new ItemReceta(huevo, 1);
		ItemReceta ir2 = new ItemReceta(carnePicada, 100);
		ItemReceta ir3 = new ItemReceta(sal, 20);
		ItemReceta ir4 = new ItemReceta(huevo, 4);
		ItemReceta ir5 = new ItemReceta(papa, 3);
		ItemReceta ir6 = new ItemReceta(panHamburguesa, 1);

		Receta tortilla = new Receta("Tortilla", 15, 0);
		tortilla.addIngrediente(ir4);
		tortilla.addIngrediente(ir5);

		Receta hamburguesa = new Receta("hamburguesa grande", 5, 0);
		hamburguesa.addIngrediente(ir2);
		hamburguesa.addIngrediente(ir1);
		hamburguesa.addIngrediente(ir3);
		hamburguesa.addIngrediente(ir6);

		Receta papasFritas = new Receta("papas fritas", 7, 0);
		papasFritas.addIngrediente(ir5);
		papasFritas.addIngrediente(ir3);

		Usuario u1 = new Usuario("Homero Simpson", 0, 350, "homerojsimpson@springfield.com");

		Producto p1 = new ProductoBasico("Lata Coca Cola", 10, 20);
		Producto p4 = new ProductoElaborado("BIG O", 150);
		((ProductoElaborado) p4).setReceta(hamburguesa);

		_defaultMostrador = new Mostrador();
		_defaultMostrador.setNombreOperador("Jose");
		
		Mostrador m2 = new Mostrador();
		m2.setNombreOperador("Maria");

		Pedido p = new Pedido();
		p.setUsuario(u1);
		p.agregarItem(new ItemPedido(1, p1));
		
		_defaultPedidos = new ArrayList<Pedido>();
		_defaultPedidos.add(p);
		
		Cocina.setPedidos(_defaultPedidos);
		
		_defaultCocina = new Cocina();
		_defaultCocina.start();
		
		Pedido q = new Pedido();
		
		_defaultMostrador.agregarPedido(p);
		m2.agregarPedido(q);
		

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("CargaPedidosTest -> tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("CargaPedidosTest -> setUp");
		
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("CargaPedidosTest -> tearDown");
	}

	@Test
	public void testCargaPedido() {
		System.out.println("CargaPedidosTest -> testCargaPedido");	
		
		Pedido p = new Pedido();
		Pedido q = new Pedido();
		
		Mostrador m1 = new Mostrador();
		
		_defaultMostrador.agregarPedido(p);
		m1.agregarPedido(q);
		
		assertEquals(Mostrador.getCantidadPedidos(), Mostrador.getCantidadPedidos());
	}
	
}
