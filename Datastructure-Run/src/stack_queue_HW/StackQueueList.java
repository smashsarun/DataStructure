/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_queue_HW;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Sardine
 */
public class StackQueueList<E> implements QueueInterface<E>, StackInterface<E>{
    
    int top = -1;
    private LinkedList<E> linklist;

    public StackQueueList() {
        linklist = new LinkedList<E>();
    }
    
    
    @Override
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public E getFront() {
        return linklist.get(0);
    }

    @Override
    public E dequeue() {
        if (top != -1) {
            E front = linklist.get(0);
            linklist.remove(0);
            top--;
            return front;
        } else {
            return null;
        }
    }

    @Override
    public void enqueue(E e) {
        linklist.add(e);
        top++;
    }

    @Override
    public void clear() {
        linklist.clear();
        top = -1;
    }

    @Override
    public int size() {
        return ++top;
    }

    @Override
    public E pop() {
        E removed = linklist.removeLast();
        return removed;
    }

    @Override
    public void push(E e) {
        linklist.add(e);
    }

    @Override
    public E peek() {
       return linklist.getLast();
    }
    
}
