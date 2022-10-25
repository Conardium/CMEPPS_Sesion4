package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testCuenta {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Cuenta c = new Cuenta("1234", "Pepe", 10);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		c.ingreso(50);
		assertEquals(60, c.getSaldo());
	}
	
	@Test
	void testReintegrar() {
		c.reintegro(10);
		assertEquals(0, c.getSaldo());
	}

}
