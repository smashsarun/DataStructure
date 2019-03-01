/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int320.hash;

import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author INT303
 */
public class TestWord {
    public static void main(String[] args) {
        WordFrequencyCounter wfc = new WordFrequencyCounter();
        try {
            wfc.processFile("data.txt");
            List<Word> list = wfc.getResult();
            Collections.sort(list, Word.countComparator);
            for (Word word : list) {
                System.out.printf("%-15s : %3d\n",word.getWord(),word.getCount());
            }
            //System.out.println(wfc);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
