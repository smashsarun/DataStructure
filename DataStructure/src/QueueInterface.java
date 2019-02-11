
/**
 *
 * @author SARUNSUMETPANICH
 */
public interface QueueInterface<E> {

    public boolean isEmpty();

    public E getFront();

    public E dequeue();

    public void enqueue(AnyType e);

    public void clear();
    
    public int size();
}
