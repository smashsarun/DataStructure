/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author INT303
 */
public class BalanceSymbol {
    public static String check(String fileName) throws FileNotFoundException{
        File f = new File(fileName);
        if (!f.exists()) {
            throw new FileNotFoundException(fileName);
        }
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        return null;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(check("BalanceSymbol.java"));
    }
}
