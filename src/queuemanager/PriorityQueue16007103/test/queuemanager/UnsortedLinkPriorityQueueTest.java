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
public class UnsortedLinkPriorityQueueTest {
    
    public UnsortedLinkPriorityQueueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of isEmpty method, of class UnsortedLinkPriorityQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        UnsortedLinkPriorityQueue instance = new UnsortedLinkPriorityQueue();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of highest_priority method, of class UnsortedLinkPriorityQueue.
     */
    @Test
    public void testHighest_priority() {
        System.out.println("highest_priority");
        UnsortedLinkPriorityQueue instance = new UnsortedLinkPriorityQueue();
        instance.add("bobby", 99);
        int expResult = 0;
        int result = instance.highest_priority();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of head method, of class UnsortedLinkPriorityQueue.
     */
    @Test
    public void testHead() {
        System.out.println("head");
        UnsortedLinkPriorityQueue instance = new UnsortedLinkPriorityQueue();
        instance.add("bobby", 99);
        Object expResult = "bobby";
        Object result = instance.head();
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class UnsortedLinkPriorityQueue.
     */
    
    @Test
    public void testRemove() {
        System.out.println("remove");
        UnsortedLinkPriorityQueue instance = new UnsortedLinkPriorityQueue();
        instance.add("tim", 4);
        instance.add("bob", 7);
        instance.remove();
        Object expResult = "tim";
        Object result = instance.head();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of add method, of class UnsortedLinkPriorityQueue.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        
        
        UnsortedLinkPriorityQueue instance = new UnsortedLinkPriorityQueue();
        instance.add("tim", 2);
        Object result = instance.head();
        Object expResult = "tim";
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class UnsortedLinkPriorityQueue.
     */
    /*
    @Test
    public void testToString() {
        System.out.println("toString");
        UnsortedLinkPriorityQueue instance = new UnsortedLinkPriorityQueue();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
