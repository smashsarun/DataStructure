package stack_queue_HW;


public interface StackInterface<E> {

    public E pop();

    public void push(E e);

    public E peek();

    public boolean isEmpty();
    
    public int size();

}
