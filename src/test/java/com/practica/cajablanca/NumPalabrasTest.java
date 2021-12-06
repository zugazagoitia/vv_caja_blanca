package com.practica.cajablanca;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.cajanegra.EmptyCollectionException;
public class NumPalabrasTest {
    @Test
    void numPalabrasTestCamino1 () throws IllegalArgumentException{

        Editor e = new Editor();
        ClassLoader classLoader = this.getClass().getClassLoader();
        e.leerFichero(classLoader.getResource("fichero.txt").getPath());

        assertThrows(IllegalArgumentException.class, () -> e.numPalabras(0,35,"mi"));


    }

    @Test
    void numPalabrasTestCamino2 () throws IllegalArgumentException{

        Editor e = new Editor();
        ClassLoader classLoader = this.getClass().getClassLoader();
        e.leerFichero(classLoader.getResource("fichero.txt").getPath());

        assertThrows(IllegalArgumentException.class, () -> e.numPalabras(1,135,"mi"));

    }

    @Test
    void numPalabrasTestCamino3 (){

        Editor e = new Editor();

        assertEquals(0 ,e.numPalabras(1,0,"mi"));

    }

    @Test
    void numPalabrasTestCamino4 (){

        Editor e = new Editor();
        ClassLoader classLoader = this.getClass().getClassLoader();
        e.leerFichero(classLoader.getResource("fichero.txt").getPath());



        assertEquals(0 ,e.numPalabras(38,35,"mi"));

    }
    @Test
    void numPalabrasTestCamino5 (){

        Editor e = new Editor();
        ClassLoader classLoader = this.getClass().getClassLoader();
        e.leerFichero(classLoader.getResource("fichero.txt").getPath());



        assertEquals(0 ,e.numPalabras(15,16,"capitán"));

    }
    @Test
    void numPalabrasTestCamino6 (){

        Editor e = new Editor();
        ClassLoader classLoader = this.getClass().getClassLoader();
        e.leerFichero(classLoader.getResource("fichero.txt").getPath());

        assertEquals(3 ,e.numPalabras(11,14,"en"));

    }
    @Test
    void numPalabrasTestCamino7 (){

        Editor e = new Editor();
        ClassLoader classLoader = this.getClass().getClassLoader();
        e.leerFichero(classLoader.getResource("fichero.txt").getPath());

        assertEquals(0 ,e.numPalabras(11,14,"Europa"));

    }



}
