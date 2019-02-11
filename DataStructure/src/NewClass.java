/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    }
}
