package ar.unrn.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.unrn.remeras.Remeras;
import ar.unrn.remeras.RemerasImportadas;
import ar.unrn.remeras.RemerasNacionales;

class RemerasTest {

	@Test
	void testCalculoCostoRemerasImportadas() {
		Remeras remera = new RemerasImportadas("Remera Nike", 2000);
		
		double precioTotal = remera.calcularPrecioVenta();

		assertEquals(precioTotal, 2700.0);		
		
	}

	@Test
	void testCalculoCostoRemerasNacionales() {
		Remeras remera = new RemerasNacionales("Remera Ceremony", 2500);
		
		double precioTotal = remera.calcularPrecioVenta();
		
		assertEquals(precioTotal, 2343.125);	
	}
}
