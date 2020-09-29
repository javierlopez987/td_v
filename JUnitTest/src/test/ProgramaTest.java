package test;

import static org.junit.Assert.*;

import java.util.Date;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import programacion.Programa;
import programacion.Programacion;
import programacion.ProgramacionNoEncontradaException;
import programacion.Tarea;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

//extends TestCase
public class ProgramaTest {
	
	private Programa 		_defaultPrograma;
	private Programacion 	_defaultProgramacion;
	private Tarea			_defaultTarea;
	
	
	/**
	 * Metodo setup para propiedades de clase
	 * @throws Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("ProgramaTest -> setUpBeforeClass ");
	}
	/**
	 * Metodo tearDown para propiedades de clase
	 * @throws Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("ProgramaTest -> tearDownAfterClass ");
	}

	/**
	 * Metodo setup para instancias de test
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("ProgramaTest -> setUp");
		
	}
	/**
	 * Metodo tearDown para instancias de test
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("ProgramaTest -> tearDown");
	}
	
	@Test
	public void testPrograma() {
		System.out.println("ProgramaTest -> testPrograma");
	}
	/**
	 * Prueba el metodo de cantidad de ocurrencias
	 * La prueba se realiza vaciando las programaciones existentes y luego agrega tres
	 * programaciones. La cantidad de programaciones debe ser exactamente 3
	 */
	@Test
	public void testGetCantOcurrencias() {
		System.out.println("ProgramaTest -> testGetCantOcurrencias");
	}
	/**
	 * Prueba el metodo getCantTareasEntre
	 * La prueba se realiza insertando tres tareas de las cuales exactamente 2
	 * cumplen los requisitos
	 */

	@Test
	public void testGetCantTareasEntre() {
		System.out.println("ProgramaTest -> testGetCantTareasEntre");
	}

	/**
	 * Prueba el metodo addPrrogramacion
	 * La prueba se realiza insertando una programacion nueva. El resultado es un
	 * programa con una nueva programacion
	 */
	@Test
	public void testAddProgramacion() {
		System.out.println("ProgramaTest -> testAddProgramacion");
	}

	/**
	 * Prueba el metodo removeProgramacion
	 * La prueba se realiza insertando una programacion, 
	 * luego se calculan cuantas programaciones se tienen y posteriormente
	 * se elimina. La cantidad de programaciones debe haber disminuido
	 * @throws ProgrmacionNoEncontradaException 
	 */
	@Test
	public void testRemoveProgramacion() throws ProgramacionNoEncontradaException {
		System.out.println("ProgramaTest -> testRemoveProgramacion");
		
	}
	
	@Test
	public void testEliminarProgramaciones() {
		System.out.println("ProgramaTest -> testEliminarProgramaciones");
	}

	@Test
	public void testProgramaVacio() {
		System.out.println("ProgramaTest -> testProgramaVacio");

	}
	
	@Test
	public void testIniciar() throws InterruptedException {
		
		System.out.println("ProgramaTest -> testIniciar");
		
	}
	
}
