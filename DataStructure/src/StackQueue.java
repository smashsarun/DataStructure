
import java.util.Stack;

/**
 *
 * @author SARUNSUMETPANICH
 */
public class StackQueue {

    public static class StackQueueIm<E> implements StackInterface<E>, QueueInterface<E> {

        int top;
        int arr[] = new int[1000]; // Maximum size of Stack 

        public E pop() { //stack
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void push(int e) { //stack
            arr[++top] = e;
            System.out.println(e + " pushed");

        }

        @Override
        public int peek() { //stack
            return arr[top];
        }

        @Override
        public boolean isEmpty() { //both
            boolean result = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr != null) {
                    if (arr[i] != null) {
                        System.out.println("IN");
                        result = false;
                        return result;
                    }
                }

            }
            return result;
        }

        @Override
        public int size() { //both
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                //ยังใช้ไม่ได้
            }
            return count;
        }

        @Override
        public E top() { //stack
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public E getFront() { //queue
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public E dequeue() { //queue
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void enqueue(AnyType e) { //queue
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void clear() { //queue
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

}
