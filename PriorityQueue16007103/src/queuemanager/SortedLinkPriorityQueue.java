/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

/**
 *
 * @author GraciousGraham
 */
public class SortedLinkPriorityQueue<T> implements PriorityQueue<T> {
    private ListNode<T> top;
    
    public SortedLinkPriorityQueue() {
        top = null;
    }
    

    public boolean isEmpty() {
        return top == null;
    }
    
    
    public T head() {
        if (isEmpty()) {
            throw new StackUnderflowException();
        }
        return top.getItem();
    }
    
    
    public void remove() {
        if (isEmpty()) {
            throw new StackUnderflowException();
        }
        top = top.getNext();
    }
    
  
    public void add(T item, int priority) {
        if (top == null)
        {
            
        }
        
        if (top.getPriority()<priority)
        {
            top = new ListNode<>(item,priority, top);
        }
        
    }
    
    public String toString() {
        String result = "";
        for (ListNode<T> node = top; node != null; node = node.getNext()) {
            
            result += node.getItem();
            result += " ";
            result += node.getPriority();
            result += ", ";
        }
        
       
       
        
        
        return result;
    }
    
    private int size() {
        ListNode<T> node = top;
        int result = 0;
        while (node != null) {
            result = result + 1;
            node = node.getNext();
        }
        return result;
    }
   
}