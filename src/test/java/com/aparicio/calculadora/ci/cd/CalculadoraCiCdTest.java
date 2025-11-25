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
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CalculadoraCiCd.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
