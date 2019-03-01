/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int320.hash;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author INT303
 */
public class WordFrequencyCounter {

    private Map<String, Word> words;

    public WordFrequencyCounter() {
        words = new HashMap(125);
    }

    public void clear() {
        words.clear();
    }

    public void processFile(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fileName));
        String line;
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            StringTokenizer stk = new StringTokenizer(line, " —,.;:/-()\\");
            while (stk.hasMoreTokens()) {
                String word = stk.nextToken().toLowerCase();
                if (words.get(word) == null) {
                    words.put(word, new Word(word));
                } else {
                    words.get(word).increment();
                }
            }
        }
    }

    public List<Word> getResult() {
        return new ArrayList(words.values()); //value return เป็น collection จึง new arraylist ซ้อน
    }
    
    @Override
    public String toString(){
        StringBuilder stb = new StringBuilder(100*20); //100คำ 20อักษร
        List<Word> list = getResult();
        Collections.sort(list);
        for (Word word : list) {
            stb.append(String.format("%-15s : %3d\n", word.getWord(),word.getCount()));
        }
        return stb.toString();
    }
}
