package cl.awakelab.clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class LavadoraJunit {
	static Lavadora pruebaJunit0;
	static Lavadora pruebaJunit1;
	static Lavadora pruebaJunit2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		pruebaJunit0 = new Lavadora();
		pruebaJunit1 = new Lavadora(4374,40);
		pruebaJunit2 = new Lavadora(3562,"rojo",'a',90,90);
	
		
	}

	@Test
	void testPrecioFinal() {
		assertEquals(3812, pruebaJunit2.precioFinal());
	}

	@Test
	void testLavadora() {
		assertEquals('f', pruebaJunit0.getConsumoEnergetico());
	}

	@Test
	void testLavadoraFloatInt() {
		assertEquals(40, pruebaJunit1.getPeso());
	}

	@Test
	void testLavadoraFloatStringCharIntInt() {
		assertEquals(90, pruebaJunit2.getCarga());
	}

}
