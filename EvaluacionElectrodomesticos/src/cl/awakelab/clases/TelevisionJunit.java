package cl.awakelab.clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TelevisionJunit {

	static Television pruebaJunit0;
	static Television pruebaJunit1;
	static Television pruebaJunit2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		pruebaJunit0 = new Television();
		pruebaJunit1 = new Television(34567,67);
		pruebaJunit2 = new Television(35000,"azul",'b',88,89,true);
	}

	@Test
	void testPrecioFinal() {
		assertEquals(45784.0, pruebaJunit2.precioFinal());
	}

	@Test
	void testTelevision() {
		assertEquals('f', pruebaJunit0.getConsumoEnergetico());
	}

	@Test
	void testTelevisionFloatInt() {
		assertEquals(67, pruebaJunit1.getPeso());
	}

	@Test
	void testTelevisionFloatStringCharIntIntBoolean() {
		assertEquals(89, pruebaJunit2.getResolucion());
	}

}
