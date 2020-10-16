package test;

import org.testng.annotations.Test;

import programacion.Tarea;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ProgramaTest {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite()");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest()");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod()");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod()");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass()");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest()");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite()");
	}

	@Test
	public void addProgramacion() {
		System.out.println("addProgramacion");
	}

	@DataProvider(name = "gen-task")
	public Object[][] generateTasks() {
		Object[][] v = new Object[10][2];
		for (int i = 0; i < 10; i++) {
			Tarea t = new Tarea("tarea " + i);
			v[i][0] = i;
			v[i][1] = t;
		}
		return v;
	}

	@Test(dataProvider = "gen-task", invocationCount = 5)
	public void addProgramacion(Object a, Object b) {
		System.out.println(a.toString() + " " + b.toString());
	}

	@Test
	@Parameters({ "prog-count" })
	public void addMuchasProgramaciones(int count) {
		System.out.println("Se crearan: " + count);
	}

	@DataProvider
	public Object[][] dp() {
		System.out.println("dp()");
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

	@Test(dataProvider = "dp")
	public void f(Integer n, String s) {
		System.out.println("f(" + s + ")");
	}

	@Test
	public void eliminarProgramaciones() {
		System.out.println("EliminarProgramaciones");
	}

	@Test
	public void getCantOcurrencias() {
		System.out.println("getCantOcurrencias");
	}

	@Test
	public void getCantProgramaciones() {
		System.out.println("getCantProgramaciones()");
	}

	@Test
	public void getCantTareasEntre() {
		// throw new RuntimeException("Test not implemented");
	}

	@Test
	public void programaVacio() {
		// throw new RuntimeException("Test not implemented");
	}

	@Test
	public void removeProgramacion() {
		// throw new RuntimeException("Test not implemented");
	}
}
