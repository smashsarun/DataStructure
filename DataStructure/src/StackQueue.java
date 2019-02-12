
import java.util.Stack;

/**
 *
 * @author SARUNSUMETPANICH
 */
public class StackQueue<E> implements StackInterface<E>, QueueInterface<E> {

    private int size = 0;
    private E arr[];

    public StackQueue() {
        arr = (E[]) new Object[1000];
    }

    @Override
    public E pop() { //stack
        if (size == 0) {
            return null;
        } else {
            E pop = arr[size - 1];
            arr[size - 1] = null; //แก้ค่าออก
            size--; //ลดค่า size
            return pop;
        }

    }

    @Override
    public void push(E e) { //stack
        if (size < arr.length) {
            size++;
            arr[size - 1] = e;
            System.out.println(e + " pushed");
        } else {
            System.out.println("! Stack is full !");
        }

    }

    @Override
    public E peek() { //stack
        if (size == 0) {            
            return null;
        } else {
            return arr[size - 1];
        }
    }

    @Override
    public boolean isEmpty() { //both
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() { //both
        return size;
    }

    @Override
    public E getFront() { //queue
        return arr[0];
    }

    @Override
    public E dequeue() { //queue*
        if (size != 0) {
            E value = arr[0];
            for (int i = 0; i < size; i++) {
                arr[i] = arr[i+1];
            }
            arr[size] = null;
            size--;
            return value;
        } else { //ถ้าว่าง
            return null;
        }
    }

    @Override
    public void enqueue(E e) { //queue
        if (size <= 1000) {
            size++;
            arr[size - 1] = e;
            System.out.println(e + " enqueued");
        } else {
            System.out.println("! Stack is full !");
        }

    }

    @Override
    public void clear() { //queue
        for (int i = 0; i < arr.length; i++) {
            arr[i] = null;
            size = 0;
        }
    }

}
