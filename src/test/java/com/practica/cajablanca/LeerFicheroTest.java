package com.practica.cajablanca;

import org.junit.jupiter.api.Test;

public class LeerFicheroTest {

	@Test
	void testLeerFichero() { //TODO: Comprobar que el fichero se ha leido correctamente
		Editor e = new Editor();
		ClassLoader classLoader = this.getClass().getClassLoader();
		e.leerFichero(classLoader.getResource("fichero.txt").getPath());

	}
}
