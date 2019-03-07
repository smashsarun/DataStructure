/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Sardine
 */
public interface queue<E> {
    
    public boolean isEmpty();
    
    public int size();
    
    public E getFront();
    
    public E dequeue();
    
    public void enqueue(E e);
    
    public void clear();
    
}
