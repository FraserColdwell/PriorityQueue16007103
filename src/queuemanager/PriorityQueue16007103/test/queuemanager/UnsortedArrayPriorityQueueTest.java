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
public class UnsortedArrayPriorityQueueTest {
    
    public UnsortedArrayPriorityQueueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of head method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testHead() throws Exception {
        System.out.println("head");
        System.out.println("highest_priority");
        UnsortedArrayPriorityQueue instance = new UnsortedArrayPriorityQueue<>(8);
        Object expResult ="tim" ;
        instance.add("tim", 9);
        Object result = instance.head();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of add method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        UnsortedArrayPriorityQueue instance = new UnsortedArrayPriorityQueue<>(8);
        instance.add("tim", 2);
        
        
        assertThat("Array Length", instance.tailIndex,equalTo(0));
        
    }

    /**
     * Test of highest_priority method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testHighest_priority() throws Exception {
        System.out.println("highest_priority");
        UnsortedArrayPriorityQueue instance = new UnsortedArrayPriorityQueue<>(8);
        
        instance.add("tim", 9);
        int expResult = 0;
        int result = instance.highest_priority();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of test method, of class UnsortedArrayPriorityQueue.
     */
    
    /*
    @Test
    public void testTest() {
        System.out.println("test");
        UnsortedArrayPriorityQueue instance = null;
        instance.test();
        
    }
    */

    /**
     * Test of remove method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue<>(8);
        instance.add("tim", 4);
        instance.add("bob", 7);
        instance.remove();
        assertThat("Array Length", instance.tailIndex,equalTo(0));
        
    }

    /**
     * Test of isEmpty method, of class UnsortedArrayPriorityQueue.
     */
    
    
    /*
    @Test
    public void testIsEmpty() throws Exception {
        System.out.println("isEmpty");
        UnsortedArrayPriorityQueue instance = null;
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
   
    }
*/
    /**
     * Test of toString method, of class UnsortedArrayPriorityQueue.
     */
    
    /*
    @Test
    public void testToString() {
        System.out.println("toString");
        UnsortedArrayPriorityQueue instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
*/
    
}
