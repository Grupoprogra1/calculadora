/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlosmartinez
 */
public class CalculadoraIT {
    
    public CalculadoraIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setString method, of class Calculadora.
     */
    @Test
    public void testSetString() {
        System.out.println("setString");
        String linea = "";
        Calculadora instance = new CalculadoraImpl();
        instance.setString(linea);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of meterVector method, of class Calculadora.
     */
    @Test
    public void testMeterVector() {
        System.out.println("meterVector");
        Calculadora instance = new CalculadoraImpl();
        instance.meterVector();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calcularVector method, of class Calculadora.
     */
    @Test
    public void testCalcularVector() {
        System.out.println("calcularVector");
        Calculadora instance = new CalculadoraImpl();
        boolean expResult = false;
        boolean result = instance.calcularVector();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getResultado method, of class Calculadora.
     */
    @Test
    public void testGetResultado() {
        System.out.println("getResultado");
        Calculadora instance = new CalculadoraImpl();
        int expResult = 0;
        int result = instance.getResultado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    public class CalculadoraImpl implements Calculadora {

        public void setString(String linea) {
        }

        public void meterVector() {
        }

        public boolean calcularVector() {
            return false;
        }

        public int getResultado() {
            return 0;
        }
    }
    
}
