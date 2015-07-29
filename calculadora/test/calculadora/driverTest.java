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
 * @author DiegoJossué
 */
public class driverTest {
    
    public driverTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setString method, of class driver.
     */
    @Test
    public void testSetString() {
        System.out.println("setString");
        String linea = "";
        driver instance = new driver();
        instance.setString(linea);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of meterVector method, of class driver.
     */
    @Test
    public void testMeterVector() {
        System.out.println("meterVector");
        driver instance = new driver();
        instance.meterVector();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of calcularVector method, of class driver.
     */
    @Test
    public void testCalcularVector() {
        System.out.println("calcularVector");
        driver instance = new driver();
        boolean expResult = false;
        boolean result = instance.calcularVector();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getResultado method, of class driver.
     */
    @Test
    public void testGetResultado() {
        System.out.println("getResultado");
        driver instance = new driver();
        int expResult = 0;
        int result = instance.getResultado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
