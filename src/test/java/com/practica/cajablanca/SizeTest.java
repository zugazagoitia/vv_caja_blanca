package com.practica.cajablanca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SizeTest {

	@Test
	void sizeTest() {
		Editor e = new Editor();
		ClassLoader classLoader = this.getClass().getClassLoader();
		e.leerFichero(classLoader.getResource("fichero.txt").getPath());

		assertEquals(e.size(), 130);
	}
}
