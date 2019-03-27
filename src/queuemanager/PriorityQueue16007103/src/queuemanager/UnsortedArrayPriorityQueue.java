package queuemanager;


import java.util.Scanner;



public class UnsortedArrayPriorityQueue<T> implements PriorityQueue<T> {
    
    
    private Object[] storage;
    

    
    private int capacity;

    
    public int tailIndex;

    /**
     * Create a new empty queue of the given size.
     *
     * @param size
     */
    public UnsortedArrayPriorityQueue(int size) {
        storage = new Object[size];
        capacity = size;
        tailIndex = -1;
    }

    @Override
    public T head() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            int highest_pos;
            highest_pos = highest_priority();
           
            return ((PriorityItem<T>) storage[highest_pos]).getItem();
        }
    }
    
   
    

    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        tailIndex = tailIndex + 1;
        if (tailIndex >= capacity) {
            /* No resizing implemented, but that would be a good enhancement. */
            tailIndex = tailIndex - 1;
            throw new QueueOverflowException();
        } 
            /* Scan backwards looking for insertion point */
            
            
            storage[tailIndex] = item;
            storage[tailIndex] = new PriorityItem<>(item, priority);
            
            
        
    }
    
    
    public int highest_priority()
    {      
        int i =0;
        int Pos=0;
     
        int p = 0;
        
           while(i < tailIndex){
               if(((PriorityItem<T>) storage[i]).getPriority() >= p){
                   Pos = i;
                   p = ((PriorityItem<T>) storage[i]).getPriority();
               }
               
               i++;
            }
            return Pos;
    }
    
    public void test()
    {
        int test;
        test = highest_priority();
        System.out.println(storage[test]);
    }
  

   public void remove() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            int highest_pri = highest_priority();
            for (int i = highest_pri; i < storage.length - 1; i++) {
                storage[i] = storage[i + 1];
            }
            tailIndex = tailIndex - 1;
        }
    }

    @Override
    public boolean isEmpty() {
        return tailIndex < 0;
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i <= tailIndex; i++) {
            if (i > 0) {
                result = result + ", ";
            }
            result = result + storage[i];
        }
        result = result + "]";
        return result;
    }
}
