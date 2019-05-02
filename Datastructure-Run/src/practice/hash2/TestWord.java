/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.hash2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import practice.hash2.Word.sortByCount;

/**
 *
 * @author Sardine
 */
public class TestWord {
    public static void main(String[] args){
        try {
            WordFrequencyCounter wfc = new WordFrequencyCounter();
            wfc.File("data.txt");
            ArrayList<Word> list = wfc.result();
            Collections.sort(list,new sortByCount());
            StringBuilder builder = new StringBuilder(100*20);
            for (Word word : list) {
                builder.append(String.format("%s : %d\n", word.getWord(),word.getCount()));
            }
            System.out.println(builder);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        
    }
}
