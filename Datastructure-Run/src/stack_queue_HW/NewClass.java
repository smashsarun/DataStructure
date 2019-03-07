package stack_queue_HW;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author SARUNSUMETPANICH
 */
public class NewClass {

    public static void main(String[] args) {

//a stack of integers
        Stack<Integer> st = new Stack<Integer>();
        System.out.println("push"+st.push(2));
        st.push((54));
        st.push(10);
        System.out.println("pop "+st.pop());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        
        System.out.println("----");
        
        Queue<Integer> qu = new LinkedList<Integer>();
        System.out.println(qu.isEmpty());
        System.out.println(qu.add(5));
        System.out.println(qu.add(12));
        System.out.println(qu.size());
        qu.clear();
        System.out.println(qu.size());
        
    }
}
