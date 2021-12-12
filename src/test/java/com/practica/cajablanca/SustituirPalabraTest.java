package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SustituirPalabraTest {

	@Test
	/**
	 * Test Camino1 = 2, 21. Comprueba únicamente la arista 2->21
	 */
	void sustituirPalabraTestEditorSizeEmpty() {
		Editor e = new Editor();

		assertEquals(e.size(), 0);
		e.sustituirPalabra("por", "en");
		assertEquals(e.size(), 0);
	}

	@Test
	/**
	 * Comprueba todas las aristas del grafo de flujo menos la 2->22
	 */
	void sustituirPalabraTest1() throws EmptyCollectionException {
		Editor e = new Editor();
		ClassLoader classLoader = this.getClass().getClassLoader();
		e.leerFichero(classLoader.getResource("fichero.txt").getPath());

		e.sustituirPalabra("por", "en");
		assertEquals("[Con, diez, cañones, en, banda]", e.getLinea(1).toString()); //Llamo a toString porque el equals está mal hecho
		assertEquals("[en, su, bravura, el, Temido]", e.getLinea(7).toString());
	}

}
