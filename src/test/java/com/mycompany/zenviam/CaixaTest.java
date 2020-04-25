package com.mycompany.zenviam;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Daniela Pereira Rigoli
 */

public class CaixaTest {
    private Caixa caixa = new Caixa();
    
    public CaixaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        //Caixa caixa = new Caixa();
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sacar method, of class Caixa.
     */
    @org.junit.jupiter.api.Test
    public void testSacar1() {
        //lembrando no array temos {nota100, nota50, nota20, nota10}
        assertArrayEquals(new int[] {2,0,0,0}, caixa.sacar(200));  
    }

    @org.junit.jupiter.api.Test
    public void testSacar2() {
        assertArrayEquals(new int[] {0,0,1,1}, caixa.sacar(30));
    }
    
    @org.junit.jupiter.api.Test
    public void testSacar3() {
        assertArrayEquals(new int[] {4,1,1,1}, caixa.sacar(480)); 
    }
    
}
