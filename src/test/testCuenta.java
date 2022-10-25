package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class testCuenta {

	static Cuenta c;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		c = new Cuenta("1234", "Pepe", 50.0);
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
		c.ingreso(50.0);
		assertEquals(100.0, c.getSaldo());
	}
	
	@Test
	void testReintegrar() {
		c.reintegro(50.0);
		assertEquals(50.0, c.getSaldo());
	}

}
