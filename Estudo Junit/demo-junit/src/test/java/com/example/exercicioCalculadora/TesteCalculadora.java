package com.example.exercicioCalculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TesteCalculadora {

    Calculadora calculo = new Calculadora();
    
    @Test
    public void soma(){
        assertEquals(2,calculo.calc(1, 1));
    }

}
