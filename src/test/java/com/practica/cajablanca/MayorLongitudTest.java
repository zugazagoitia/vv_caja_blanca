package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MayorLongitudTest {


    @Test
    /**
     * Comprueba todas las aristas del grafo de flujo menos la 3->16
     */
    void MayorLongitudTest1() throws EmptyCollectionException {
        Editor e = new Editor();
        ClassLoader classLoader = this.getClass().getClassLoader();
        e.leerFichero(classLoader.getResource("fichero.txt").getPath());
        String s = e.mayorLongitud();
        assertEquals("superultracañonesmodernos", s);
    }

    @Test
    /**
     * Comprueba únicamente la arista 3->16
     */
    void MayorLongitudTest2() throws EmptyCollectionException {
        Editor e = new Editor();
        ClassLoader classLoader = this.getClass().getClassLoader();
        e.leerFichero(classLoader.getResource("ficherovacio.txt").getPath());
        String s = e.mayorLongitud();
        assertEquals(null, s);

    }

}
