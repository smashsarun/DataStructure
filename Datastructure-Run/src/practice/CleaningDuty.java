/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Queue;

/**
 *
 * @author Sardine
 */
public class CleaningDuty<E> implements queue<E>{
    protected queue<String> q1,q2;

    public CleaningDuty() {
        q1 = new CleaningDuty<String>();
        q2 = new CleaningDuty<String>();
    }
    
    

    @Override
    public boolean isEmpty() {
        if (q1 != null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public int size() {
        return q1.size();
    }

    @Override
    public E getFront() {
        return (E) q1.getFront();
    }

    @Override
    public E dequeue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enqueue(E e) {
        q1.enqueue((String) e);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        CleaningDuty<String> test = new CleaningDuty<String>();
        test.enqueue("AAA");
        test.size();
    }
}

