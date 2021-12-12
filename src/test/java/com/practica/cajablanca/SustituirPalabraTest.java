package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SustituirPalabraTest {

	Editor e;

	@BeforeEach
	void setUp() throws Exception {
		e = new Editor();
	}

	@Test
	@DisplayName("Camino 1")
	/**
	 * Test Camino1 = 2, 21. Comprueba únicamente la arista 2->21
	 */
	void sustituirPalabraTestEditorSizeEmpty() {
		e.leerFichero("src/test/resources/ficherovacio.txt");
		e.sustituirPalabra("por", "en");
		assertEquals(e.size(), 0);
	}

	@Test
	@DisplayName("Camino 2")
	/**
	 * Test Camino1 = 2, 3-4, 5-8, 9, 17-18, 19, 20, 21.
	 */
	void sustituirPalabraTestListaSizeEmpty() {
		e.leerFichero("src/test/resources/FicheroVacioConEspacio");
		e.sustituirPalabra("por", "en");
		assertEquals(e.size(), 0);
	}

	@Test
	@DisplayName("Camino 3")
	/**
	 * Test Camino1 = 2, 3-4, 5-8, 9, 17-18, 19, 5-8, 9, 17-18, 19, 20, 22
	 */
	void sustituirPalabraTestListaDosVecesSizeEmpty() {
		e.leerFichero("src/test/resources/FicheroVacioCon2Espacios");
		e.sustituirPalabra("por", "en");
		assertEquals(e.size(), 0);
	}

	@Test
	@DisplayName("Camino 4")
	/**
	 * Test Camino1 = 2, 3-4, 5-8, 9, 10, 13, 15, 9, 17-18, 19, 20, 22
	 */
	void sustituirPalabraTestNoSeEncuentraPalabra() throws EmptyCollectionException {
		e.leerFichero("src/test/resources/Coche");
		e.sustituirPalabra("por", "en");
		assertEquals(e.size(), 1);
		assertEquals("[Coche]", e.getLinea(1).toString());
	}

	@Test
	@DisplayName("Camino 5")
	/**
	 * Test Camino1 = 2, 3-4, 5-8, 9, 10, 13, 15, 9, 17-18, 19, 20, 22
	 */
	void sustituirPalabraTestSeEncuentraPalabra() throws EmptyCollectionException {
		e.leerFichero("src/test/resources/por");
		e.sustituirPalabra("por", "en");
		assertEquals(e.size(), 1);
		assertEquals("[en]", e.getLinea(1).toString());
	}


}
