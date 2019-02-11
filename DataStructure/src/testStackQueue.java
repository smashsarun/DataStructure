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
        //stack
        StackQueue.StackQueueIm<Integer> st = new StackQueue.StackQueueIm<Integer>(); //generic โดยเรียกเป็น int
        st.push(5);
        st.push(8);
        st.push(2);

        System.out.println(st.peek());
        System.out.println(st.size());
            System.out.println(st.isEmpty());

    }
}
