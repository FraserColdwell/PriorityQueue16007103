/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

/**
 *
 * @author GraciousGraham
 * @param <T>
 */
public class SortedLinkPriorityQueue<T> implements PriorityQueue<T> {
    private ListNode<T> top;
    
    public SortedLinkPriorityQueue() {
        top = null;
    }
    

    @Override
    public boolean isEmpty() {
        return top == null;
    }
    
    
    @Override
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
    
  
    @Override
    public void add(T item, int priority){
        ListNode temp = new ListNode<>(item, priority, top);
        ListNode start = top;
        if(top==null){
            top = temp;
        }else if (top.getPriority()<priority){
            temp.next = top;
            top = temp;
        }else{
            while(start.next != null && start.next.getPriority() > priority){
                start = start.next;
            }     
            temp.next = start.next;
            start.next = temp;
        }
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