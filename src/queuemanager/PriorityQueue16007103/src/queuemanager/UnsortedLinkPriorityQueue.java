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
    
   
    public int highest_priority()
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
               p = node.getPriority();
           }
           node = node.getNext();
           counter++;    
       }
      return highest_pos;
   }
    
    public T head(){
        int highest_pos = highest_priority();
        
        ListNode<T> node = top;
        
        if (isEmpty())
        {
            throw new StackUnderflowException();
        }else
        {
            for(int i=0;i<highest_pos;i++)
            {
                node = node.getNext();
            }
        }
            return node.getItem();
        }
        
        
   
    
    public void remove() {
        int h = highest_priority();
        if (isEmpty()){
            throw new StackUnderflowException();
        }
        else {
            ListNode<T> temp = top;
            
            int counter = 1;
            if(h==0){
                top=top.next;
            }
            if (h==1) {
                top.next = top.next.next;
            }
            if (h>1){
                temp = top;
                while (counter <h)
                {
                    counter++;
                    temp=temp.next;
                }
                temp.next=temp.next.next;
            }
        }
           
        
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
