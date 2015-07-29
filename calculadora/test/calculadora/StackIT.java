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
public class StackIT {
    
    public StackIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of push method, of class Stack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object item = null;
        Stack instance = new StackImpl();
        instance.push(item);
    }

    /**
     * Test of pop method, of class Stack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Stack instance = new StackImpl();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
    }

    /**
     * Test of peek method, of class Stack.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        Stack instance = new StackImpl();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
    }

    /**
     * Test of empty method, of class Stack.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        Stack instance = new StackImpl();
        boolean expResult = false;
        boolean result = instance.empty();
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class Stack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Stack instance = new StackImpl();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    public class StackImp implements Stack {

        public void push(E item) {
        }

        public E pop() {
            return null;
        }

        public E peek() {
            return null;
        }

        public boolean empty() {
            return false;
        }

        public int size() {
            return 0;
        }
    }
    
}
