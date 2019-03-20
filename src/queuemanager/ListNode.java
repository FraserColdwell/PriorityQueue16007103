package queuemanager;

public class ListNode<T> {
    private T item;
    private ListNode<T> next;
    private int priority;
    
    public ListNode(T item, int priority, ListNode<T> next) {
        this.item = item;
        this.priority = priority;
        this.next = next;
    }
    
    public T getItem() {
        return item;
    }
    
    public int getPriority() {
        return priority;
    }
    
    public ListNode<T> getNext() {
        return next;
    }
    
    public String toString() {
        return "(" + getItem() + ", " + getPriority() + ")";
    }
}
