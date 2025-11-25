/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.aparicio.calculadora.ci.cd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Juanest15
 */
public class CalculadoraCiCdTest {
    
    private CalculadoraCiCd calculadora;
    
    public CalculadoraCiCdTest() {
    }

    @BeforeEach
    public void setUp() throws Exception {
        calculadora = new CalculadoraCiCd();
    }
    @Test
    public void testSumar(){
        int resultado = calculadora.sumar(5, 3);
        assertEquals(8, resultado, "5 + 3 debe ser 8");
    }
    
    @Test
    public void testSumarNegativos(){
        int resultado = calculadora.sumar(-5, -3);
        assertEquals(-8, resultado, "-5 + -3 debe ser -8");
    }
    
    @Test
    public void testRestar() {
        int resultado = calculadora.restar(10, 4);
        assertEquals(6, resultado, "10 - 4 debe ser 6");
    }
    
    @Test
    public void testRestarNegativos(){
        int resultado = calculadora.restar(5, 10);
        assertEquals(-5, resultado, "5 - 10 debe ser -5");
    }
    
    @Test
    public void testMultiplicar(){
        int resultado = calculadora.multiplicar(6,7);
        assertEquals(42 , resultado, "6 * 7 debe ser 42");
    }
    
    @Test
    public void testMultiplicarPorCero(){
        int resultado = calculadora.multiplicar(5, 0);
        assertEquals(0, resultado, "5 * 0 debe ser 0");
    }
    
    @Test
    public void testDividir(){
        double resultado = calculadora.dividir(20, 4);
        assertEquals(5.0, resultado, 0.001, "20 / 4 debe ser 5.0");
    }
    
    @Test
    public void testDividirConDecimales(){
        double resultado = calculadora.dividir(10, 3);
        assertEquals(3.333, resultado, 0.01, "10 / 3 debe ser aprox 3.333");
    }
    
    @Test
    public void testDividirPorCero(){
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.dividir(10, 0),
                "Dividir por cero debe lanzar IllegalArgumentException"
        );
         assertTrue(exception.getMessage().contains("No se puede dividir por cero"));
    }
    
    @Test
    public void testPotenciaUno(){
        int resultado = calculadora.potencia(7, 1);
        assertEquals(7, resultado, "7^1 debe ser 7");
    }
    
    @Test
    public void testPotenciaNegativa(){
        Exception exception = assertThrows(
        IllegalArgumentException.class,
        () -> calculadora.potencia(2, -3),
        "Potencia negativa debe lanzar IllegalArgumentException"
        );
        assertTrue(exception.getMessage().contains("Exponente debe ser positivo"));
    }
}
