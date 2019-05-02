/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.hash;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import practice.hash.Word.compareByCount;

/**
 *
 * @author Sardine
 */
public class WordFrequencyCounter {
    private Map<String,Word> words;

    public WordFrequencyCounter() {
        words = new HashMap(25);
    }
    
    public void processFile(String fileName) throws FileNotFoundException{
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            StringTokenizer st = new StringTokenizer(line, " ().|/\\-_;,.:", true);
            while(st.hasMoreTokens()){
                String token = st.nextToken();
                if (words.containsKey(token)) {
                    words.get(token).increament();
                } else {
                    words.put(token, new Word(token));
                }
            }
        }
    }
    
    public List<Word> getResult(){
        return new ArrayList(words.values());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(100*20);
        List<Word> words = this.getResult();
        Collections.sort(words, new compareByCount());
        for (Word word : words) {
            builder.append(String.format("%s : %d\n", word.getWord(),word.getCount()));
        }
        return builder.toString();
    }
    
    
    
}
