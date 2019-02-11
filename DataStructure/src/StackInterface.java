
public interface StackInterface<E> {

    public E pop();

    public void push(int e);

    public int peek();

    public boolean isEmpty();
    
    public int size();
    
    public E top(); 
}
