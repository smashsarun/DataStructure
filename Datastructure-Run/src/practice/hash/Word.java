/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.hash;

import java.util.Comparator;

/**
 *
 * @author Sardine
 */
public class Word implements Comparable<Word>{
    private int count;
    private String word;
    
    public static class compareByCount implements Comparator<Word>{

        @Override
        public int compare(Word o1, Word o2) {
            return o1.getCount()-o2.getCount();
        }
        
    }
    

    public Word(String word) {
        this.count = 1;
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
    
    public void increament(){
        count++;
    }

    @Override
    public int compareTo(Word o) {
        return this.word.compareTo(o.word);
    }
    
    
}
