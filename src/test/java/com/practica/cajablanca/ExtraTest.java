package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExtraTest {

	@Test
	void sizeTest() {
		Editor e = new Editor();
		ClassLoader classLoader = this.getClass().getClassLoader();
		e.leerFichero(classLoader.getResource("fichero.txt").getPath());

		assertEquals(e.size(), 130);
	}

	@Test
	void testLeerFichero() {
		Editor e = new Editor();
		ClassLoader classLoader = this.getClass().getClassLoader();
		e.leerFichero(classLoader.getResource("fichero.txt").getPath());

	}

	@Test
	void getLineaTest() throws EmptyCollectionException {
		Editor e = new Editor();
		ClassLoader classLoader = this.getClass().getClassLoader();
		e.leerFichero(classLoader.getResource("fichero.txt").getPath());

		assertEquals(5, e.getLinea(1).size());
		assertThrows(IllegalArgumentException.class, () -> e.getLinea(0));
	}

}
