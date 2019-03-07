package stack_queue_HW;


/**
 *
 * @author SARUNSUMETPANICH
 */
public interface QueueInterface<E> {

    public boolean isEmpty();

    public E getFront();

    public E dequeue();

    public void enqueue(E e);

    public void clear();
    
    public int size();
}
