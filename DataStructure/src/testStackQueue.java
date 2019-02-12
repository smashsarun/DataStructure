
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SARUNSUMETPANICH
 */
public class testStackQueue {

    public static void main(String[] args) {
        
        StackQueue<String> A = new StackQueue<String>(); //generic โดยเรียกเป็น int
        
        
        System.out.print("Stack Empty?: ");
        System.out.println(A.isEmpty());

        System.out.print("Stack peak: ");
        System.out.println(A.peek());

        System.out.print("Stack pop: ");
        System.out.println(A.pop());

        A.push("A");
        A.push("U");
        
        System.out.print("Front: ");
        System.out.println(A.getFront());
        
        A.push("P");
        
        System.out.print("Front: ");
        System.out.println(A.getFront());
        
        A.push("PPAP");

        System.out.print("Stack peak: ");
        System.out.println(A.peek());

        System.out.print("Stack Empty?: ");
        System.out.println(A.isEmpty());

        System.out.print("Stack pop: ");
        System.out.println(A.pop());
        
        System.out.print("Dequeue: ");
        System.out.println(A.dequeue());
        
        System.out.print("Front: ");
        System.out.println(A.getFront());

        System.out.print("Stack size: ");
        System.out.println(A.size());
        
        A.push("New");
        
        A.clear();
        System.out.println("--Cleared--");
        
        A.enqueue("Seal");
        A.enqueue("Eagle");

        System.out.print("Stack peak: ");
        System.out.println(A.peek());
        
        System.out.print("Front: ");
        System.out.println(A.getFront());

        System.out.println("------");



        StackQueue<Integer> B = new StackQueue<Integer>();
        
        System.out.print("Front: ");
        System.out.println(B.getFront());
        
        B.enqueue(128);
        B.enqueue(256);
        B.push(12);
        B.enqueue(168);
        
        System.out.print("Front: ");
        System.out.println(B.getFront());
        
        System.out.print("Peek: ");
        System.out.println(B.peek());
        
        System.out.print("Size: ");
        System.out.println(B.size());
        
        System.out.print("Dequeue: ");
        System.out.println(B.dequeue());
        
        System.out.print("Front: ");
        System.out.println(B.getFront());

        System.out.print("Peek: ");
        System.out.println(B.peek());        

    }
}
