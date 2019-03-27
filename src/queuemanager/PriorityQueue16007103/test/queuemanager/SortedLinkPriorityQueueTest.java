/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GraciousGraham
 */
public class SortedLinkPriorityQueueTest {
    
    public SortedLinkPriorityQueueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of isEmpty method, of class SortedLinkPriorityQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        SortedLinkPriorityQueue instance = new SortedLinkPriorityQueue();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of head method, of class SortedLinkPriorityQueue.
     */
    @Test
    public void testHead() throws Exception {
        System.out.println("head");
        System.out.println("highest_priority");
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue<>(8);
        Object expResult ="tim" ;
        instance.add("tim", 9);
        Object result = instance.head();
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class SortedLinkPriorityQueue.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        SortedLinkPriorityQueue instance = new SortedLinkPriorityQueue();
        instance.add("tim", 4);
        instance.add("bob", 7);
        instance.remove();
        Object expResult = "tim";
        Object result = instance.head();
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class SortedLinkPriorityQueue.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        
        SortedLinkPriorityQueue instance = new SortedLinkPriorityQueue();
        instance.add("tim", 2);
        Object result = instance.head();
        Object expResult = "tim";
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class SortedLinkPriorityQueue.
     */
    /*
    @Test
    public void testToString() {
        System.out.println("toString");
        SortedLinkPriorityQueue instance = new SortedLinkPriorityQueue();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    
}
