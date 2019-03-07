/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_queue_HW;

/**
 *
 * @author Sardine
 */
public class testStackQueueList {
    public static void main(String[] args) {
        StackQueueList<String> sql = new StackQueueList<String>();
        
        sql.enqueue("Test1");
        sql.enqueue("test2");
        sql.enqueue("test3");
        sql.enqueue("test4");
        System.out.println(sql.getFront());
        sql.dequeue();
        System.out.println(sql.size());
        System.out.println(sql.getFront());
        System.out.println(sql.peek());
        sql.push("A");
        sql.push("B");
        System.out.println(sql.peek());
        sql.dequeue();
        sql.enqueue("C");
        System.out.println(sql.getFront());
        System.out.println(sql.peek());
        System.out.println(sql.pop());
        System.out.println(sql.peek());
    }
}
