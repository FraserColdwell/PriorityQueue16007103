package queuemanager;


import java.util.Scanner;



public class UnsortedArrayPriorityQueue<T> implements PriorityQueue<T> {
    
    
    private Object[] storage;
    

    
    private int capacity;

    
    private int tailIndex;

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
            
       
            return ((PriorityItem<T>) storage[0]).getItem();
        }
    }
    
   
    

    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        tailIndex = tailIndex + 1;
        if (tailIndex >= capacity) {
            /* No resizing implemented, but that would be a good enhancement. */
            tailIndex = tailIndex - 1;
            throw new QueueOverflowException();
        } else {
            /* Scan backwards looking for insertion point */
            
            
            
            storage[tailIndex] = new PriorityItem<>(item, priority);
            
            int high = highest_priority(priority);
            System.out.println(storage[high]);
        }
    }
    
    
    public int highest_priority(int p)
    {      
        int i =0;
        int Pos=0;
        int Pri = 0;
        
           while(i < tailIndex){
               if(((PriorityItem<T>) storage[i]).getPriority() <= p){
                   Pos = i;
                   Pri = ((PriorityItem<T>) storage[i]).getPriority();
               }
               
               i++;
            }
            return Pos;
    }
  

    @Override
    public void remove() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            for (int i = 0; i < tailIndex; i++) {
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
