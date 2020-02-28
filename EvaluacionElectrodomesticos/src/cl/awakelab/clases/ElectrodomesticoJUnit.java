package cl.awakelab.clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ElectrodomesticoJUnit {
	
	static Electrodomestico pruebaJunit0;
	static Electrodomestico pruebaJunit1;
	static Electrodomestico pruebaJunit2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		pruebaJunit0 = new Electrodomestico();
		pruebaJunit1 = new Electrodomestico(1000,40);
		pruebaJunit2 = new Electrodomestico(3000,"negro",'a',90);
	}

	@Test
	void testElectrodomestico() {
		assertEquals('f', pruebaJunit0.getConsumoEnergetico());
	}

	@Test
	void testElectrodomesticoFloatInt() {
		assertEquals(40, pruebaJunit1.getPeso());
	}

	@Test
	void testElectrodomesticoFloatStringCharInt() {
		assertEquals("negro", pruebaJunit2.getColor());
	}

	@Test
	void testPrecioFinal() {
		assertEquals(3200, pruebaJunit2.precioFinal());
	}

}
