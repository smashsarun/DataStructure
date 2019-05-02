/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.hash2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Sardine
 */
public class WordFrequencyCounter {
    private Map<String,Word> words;

    public WordFrequencyCounter() {
        words = new HashMap<>(25);
    }   
    

    public void File(String filename) throws FileNotFoundException{
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            StringTokenizer st = new StringTokenizer(line, " ./\\:/-()", false);
            while(st.hasMoreTokens()){
                String token = st.nextToken();
                if (words.get(token)==null) { 
                    words.put(token, new Word(token));
                } else {
                    words.get(token).increament();
                }
            }
        }
    }
    
    public ArrayList<Word> result(){
        return new ArrayList<Word>(words.values());
    }
    
}
