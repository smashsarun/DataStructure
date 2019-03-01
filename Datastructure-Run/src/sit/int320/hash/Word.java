/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int320.hash;

import java.util.Comparator;

/**
 *
 * @author INT303
 */
public class Word implements Comparable<Word> {

    private String word;
    private int count;
    
    public static CountComparator countComparator = new CountComparator();

    private static class CountComparator implements Comparator<Word> {
        @Override
        public int compare(Word o1, Word o2) {
            return o2.count - o1.count;
        }
    }

    public Word(String word) {
        this.word = word;
        this.count = 1;
    }

    @Override
    public int compareTo(Word w) {
        return this.word.compareTo(w.word);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }

}
