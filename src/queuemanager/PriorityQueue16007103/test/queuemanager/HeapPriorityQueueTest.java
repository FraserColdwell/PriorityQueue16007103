/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GraciousGraham
 */
public class HeapPriorityQueueTest {
    
    public HeapPriorityQueueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of head method, of class HeapPriorityQueue.
     */
    @Test
    public void testHead() throws Exception {
        System.out.println("head");
        HeapPriorityQueue instance = new HeapPriorityQueue<>(20);
        Object expResult = "tim";
        instance.add("tim", 9);
        Object result = instance.head();
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class HeapPriorityQueue.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        HeapPriorityQueue instance = new HeapPriorityQueue<>(20);
        instance.add("tim", 4);
        assertThat("Array Length", instance.tailIndex,equalTo(1));
        
    }

    /**
     * Test of toString method, of class HeapPriorityQueue.
     */
    /*
    @Test
    public void testToString() {
        System.out.println("toString");
        HeapPriorityQueue instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of remove method, of class HeapPriorityQueue.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        HeapPriorityQueue instance = new HeapPriorityQueue<>(20);
        instance.add("tim", 4);
        instance.add("bob", 7);
        instance.remove();
        assertThat("Array Length", instance.tailIndex,equalTo(1));
    }

    /**
     * Test of isEmpty method, of class HeapPriorityQueue.
     */
    /*
    @Test
    public void testIsEmpty() throws Exception {
        System.out.println("isEmpty");
        HeapPriorityQueue instance = null;
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
