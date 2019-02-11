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
        st.push((1));
//        st.push((5));
//        st.push((2));
//print the top
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.isEmpty());
    }
}
