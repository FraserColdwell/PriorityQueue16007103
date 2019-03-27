
package queuemanager;

public class HeapPriorityQueue<T> implements PriorityQueue<T>{
    private Object[] storage;
    private int capacity;
    public int tailIndex;
    
    public HeapPriorityQueue(int size){
        storage =  new Object[size];
        capacity = size;
        tailIndex = 0;
        
    }
    
    @Override
    public T head() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        }
        else 
        {
            return ((PriorityItem<T>) storage[1]).getItem();
        }
    }
    
    private int parent(int position){
        return position / 2;
    }
    
    private int leftChild(int position)
    {
        return 2*position;
    }
    
    private int rightChild(int position)
    {
        return (2*position) + 1;
    }
    
    private boolean isLeaf(int position){
        if (position >= (capacity/2) && position <=capacity){
            return true;
        }
        return false;
    }
        
    
    private void swap(int fpos, int spos){
        Object temp;
        int priority;
        temp = ((PriorityItem<T>) storage[fpos]).getItem();
        priority = ((PriorityItem<T>) storage[fpos]).getPriority();

        Object temp1 = ((PriorityItem<T>) storage[spos]).getItem();
        int p1 = ((PriorityItem<T>) storage[spos]).getPriority();

        storage[fpos] = new PriorityItem<>(temp1, p1);
        storage[spos] = new PriorityItem<>(temp, priority);
            
    }
    
    private void maxheapify(int position)
    {
        if(!isLeaf(position)){
            if(((PriorityItem<T>) storage[rightChild(position)]) != null) {
                if (((PriorityItem<T>) storage[position]).getPriority() < ((PriorityItem<T>) storage[leftChild(position)]).getPriority() || ((PriorityItem<T>) storage[position]).getPriority() < ((PriorityItem<T>) storage[rightChild(position)]).getPriority())
                {
                    if (((PriorityItem<T>) storage[leftChild(position)]).getPriority() > ((PriorityItem<T>) storage[rightChild(position)]).getPriority())
                    {
                        swap(position, leftChild(position));
                        maxheapify(leftChild(position));
                    }
                    else 
                    {
                        swap(position, rightChild(position));
                        maxheapify(rightChild(position));
                    }
                    
                }
                       
            } 
            
            else if (((PriorityItem<T>) storage[rightChild(position)]) == null && ((PriorityItem<T>) storage[leftChild(position)]) !=null)
            {
                if (((PriorityItem<T>) storage[position]).getPriority() < ((PriorityItem<T>) storage[leftChild(position)]).getPriority() )
                {
                    if (((PriorityItem<T>) storage[leftChild(position)]).getPriority() >=0 )
                    {
                        swap(position, leftChild(position));
                        maxheapify(leftChild(position));
                    }
                    else 
                    {
                        swap(position, rightChild(position));
                        maxheapify(rightChild(position));
                    }
                    
                }
            }
            else if (((PriorityItem<T>) storage[rightChild(position)]) == null && ((PriorityItem<T>) storage[leftChild(position)]) ==null)
            {
                
            
        }
        }
    }
    
     @Override
    public void add(T item, int priority) 
    {
        storage[++tailIndex] =  new  PriorityItem<>(item, priority);
        
        int current = tailIndex;
        
        while(current > 1 && ((PriorityItem<T>) storage[current]).getPriority() > ((PriorityItem<T>) storage[parent(current)]).getPriority())
        {
            swap(current, parent(current));
            current = parent(current);
        }
    
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
    
    @Override
    public void remove() throws QueueUnderflowException {
        storage[1] = storage[tailIndex--];
        maxheapify(1);
    }
    
    @Override
    public boolean isEmpty()
    {
        return capacity==0;
    }
}




