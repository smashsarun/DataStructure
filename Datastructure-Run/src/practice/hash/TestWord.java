/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.hash;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sardine
 */
public class TestWord {
    public static void main(String[] args) {
        WordFrequencyCounter wfc = new WordFrequencyCounter();
        try {
            wfc.processFile("data.txt");
            System.out.println(wfc.toString());
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
