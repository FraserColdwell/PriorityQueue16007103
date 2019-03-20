/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

/**
 *
 * @author 16007103
 */

public class UnsortedLinkPriorityQueue<T> implements PriorityQueue<T> {
    private ListNode<T> top;
    
    public UnsortedLinkPriorityQueue() {
        top = null;
    }
    
    @Override
    public boolean isEmpty() {
        return top == null;
    }
    
   
    public T head() {
        if (isEmpty()) {
            throw new StackUnderflowException();
        }
        return top.getItem();
    }
    
    @Override
    public void remove() {
        if (isEmpty()) {
            throw new StackUnderflowException();
        }
        top = top.getNext();
    }
    
    
    public void add(T item, int priority) {
        top = new ListNode<>(item, priority, top);
       
    }
    
    @Override
    public String toString() {
        String result = "";
        for (ListNode<T> node = top; node != null; node = node.getNext()) {
            
            result += node.getItem();
            result += " ";
            result += node.getPriority();
            result += ", ";
        }
        
       
        highest_priority();
        
        
        return result;
    }
    
   public void highest_priority()
   {
       ListNode<T> node = top;
       
       int counter = 0;
       int p = 0;
       int highest_pos = 0;
       int size = size();
       
       
       while (counter < size)
       {
           if (node.getPriority()>=p)
           {
               highest_pos = counter;
           }
           node = node.getNext();
           counter++;    
       }
      System.out.println(highest_pos);
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