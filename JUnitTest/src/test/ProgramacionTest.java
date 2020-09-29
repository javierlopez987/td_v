package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProgramacionTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("ProgramacionTest -> setupBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("ProgramacionTest -> tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("ProgramacionTest -> setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("ProgramacionTest -> tearDown");
	}

	/**
	 *  
	 */
	@Test
	public void testProgramacion() {
		System.out.println("ProgramacionTest -> testProgramacion");
	}

	@Test
	public void testGetTask() {
		System.out.println("ProgramacionTest -> testGetTask");
	}

	@Test
	public void testGetInicio() {
		System.out.println("ProgramacionTest -> testGetInicio");
	}

	@Test
	public void testSetInicio() {
		System.out.println("ProgramacionTest -> testSetInicio");
	}

	@Test
	public void testGetFin() {
//		 fail("Not yet implemented");
	}

	@Test
	public void testSetFin() {
//		 fail("Not yet implemented");
	}

}