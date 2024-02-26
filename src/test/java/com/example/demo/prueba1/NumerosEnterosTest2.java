package com.example.demo.prueba1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NumerosEnterosTest2 {

    @Test
    public void intercambiarTest() {
        int [] arreglo = new int[2];
        arreglo[0] = 5;
        arreglo[1] = 9;

        NumerosEnteros ne = new NumerosEnteros(arreglo);

        int [] arregloEsperado = new int[2];
        arregloEsperado[0] = 9;
        arregloEsperado[1] = 5;

        ne.intercambiar(0, 1);

        int [] arregloObtenido = ne.obtenerArreglo();

        for(int i = 0; i < arreglo.length; i++) {
            assertEquals(arregloEsperado[i], arregloObtenido[i]);
        }
    }

    @Test
    public void reemplazarTest() {
        int [] arreglo = new int[2];
        arreglo[0] = 0;
        arreglo[1] = 1;

        NumerosEnteros ne = new NumerosEnteros(arreglo);

        int [] arregloEsperado = new int[2];
        arregloEsperado[0] = 0;
        arregloEsperado[1] = 9;

        ne.reemplazar(1, 9);

        int [] arregloObtenido = ne.obtenerArreglo();

        for(int i = 0; i < arreglo.length; i++) {
            assertEquals(arregloEsperado[i], arregloObtenido[i]);
        }
    }

    @Test
    public void reemplazarPrimeraTest() {
        int [] arreglo = new int[3];
        arreglo[0] = 0;
        arreglo[1] = 1;
        arreglo[2] = 1;

        NumerosEnteros ne = new NumerosEnteros(arreglo);

        int [] arregloEsperado = new int[3];
        arregloEsperado[0] = 0;
        arregloEsperado[1] = 3;
        arregloEsperado[2] = 1;

        ne.reemplazarPrimera(1, 3);

        int [] arregloObtenido = ne.obtenerArreglo();

        for(int i = 0; i < arreglo.length; i++) {
            assertEquals(arregloEsperado[i], arregloObtenido[i]);
        }
    }

    @Test
    public void reemplazarUltimaTest() {
        int [] arreglo = new int[3];
        arreglo[0] = 0;
        arreglo[1] = 1;
        arreglo[2] = 1;

        NumerosEnteros ne = new NumerosEnteros(arreglo);

        int [] arregloEsperado = new int[3];
        arregloEsperado[0] = 0;
        arregloEsperado[1] = 1;
        arregloEsperado[2] = 3;

        ne.reemplazarUltima(1, 3);

        int [] arregloObtenido = ne.obtenerArreglo();

        for(int i = 0; i < arreglo.length; i++) {
            assertEquals(arregloEsperado[i], arregloObtenido[i]);
        }
    }

    @Test
    public void establecerPosTest() {
        int [] arreglo = new int[2];
        arreglo[0] = 0;
        arreglo[1] = 1;

        NumerosEnteros ne = new NumerosEnteros(arreglo);

        int pos = 1;
        int num = 3;
        ne.establecerPos(pos, num);

        int [] arregloObtenido = ne.obtenerArreglo();

        assertEquals(3, arregloObtenido[pos]);
    }

    @Test
    public void enteroPosTest() {
        int [] arreglo = new int[3];
        arreglo[0] = 0;
        arreglo[1] = 1;
        arreglo[2] = 2;

        NumerosEnteros ne = new NumerosEnteros(arreglo);

        int resultado = ne.enteroPos(2);

        assertEquals(2, resultado);
    }

    @Test
    public void longitudTest() {
        int [] arreglo = new int[3];
        arreglo[0] = 0;
        arreglo[1] = 1;
        arreglo[2] = 2;

        NumerosEnteros ne = new NumerosEnteros(arreglo);

        int resultado = ne.longitud();

        assertEquals(3, resultado);
    }

    @Test
    public void obtenerArregloTest() {
        int [] arreglo = new int[10];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i;
        }

        NumerosEnteros ne = new NumerosEnteros(arreglo);

        int [] arregloEsperado = new int[arreglo.length];
        for (int i = 0; i < arregloEsperado.length; i++) {
            arregloEsperado[i] = i;
        }

        int [] arregloObtenido = ne.obtenerArreglo();

        for(int i = 0; i < arreglo.length; i++) {
            assertEquals(arregloEsperado[i], arregloObtenido[i]);
        }
    }
}
