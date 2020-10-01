package edu.tudai.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

public class IngredienteTest extends TestCase {
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

	@Test
	public void testProgramacion() {
		System.out.println("ProgramacionTest -> testProgramacion");
	}
}
