package edu.tudai.test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.tudai.pojo.Ingrediente;
import edu.tudai.pojo.ItemReceta;
import edu.tudai.pojo.Receta;

public class RecetaTest {
	
	private static Receta 	_defaultReceta;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("RecetaTest -> setupBeforeClass");
		
		_defaultReceta = new Receta("Tortilla", 15, 200);
		Ingrediente huevo = new Ingrediente("huevo", "unidades", 240, 10);
		Ingrediente papa = new Ingrediente("Papa", "gramos", 20000, 40);
		Ingrediente sal = new Ingrediente("Sal", "gramos", 1000, 10);
		
		ItemReceta ir3 = new ItemReceta(sal, 20);
		ItemReceta ir4 = new ItemReceta(huevo, 4);
		ItemReceta ir5 = new ItemReceta(papa, 3);
		
		_defaultReceta.addIngrediente(ir4);
		_defaultReceta.addIngrediente(ir5);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("RecetaTest -> tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("RecetaTest -> setUp");
		
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("RecetaTest -> tearDown");
	}

	@Test
	public void testReceta() {
		System.out.println("RecetaTest -> testReceta");
		
		assertEquals(3, _defaultReceta.getIngredientes().size());
		
	}
	
}
