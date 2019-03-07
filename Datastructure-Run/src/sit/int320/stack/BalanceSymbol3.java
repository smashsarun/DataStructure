/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int320.stack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.annotation.processing.FilerException;

/**
 *
 * @author Sardine
 */
public class BalanceSymbol3 {
    
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(BalanceSymbol("BalanceSymbol.java"));
    }

    public static String BalanceSymbol(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(fileName);
        }
        Scanner sc = new Scanner(file);

        LinkedList<String> list = new LinkedList<String>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            StringTokenizer st = new StringTokenizer(line, "{}[]()<>", true);
            while (st.hasMoreTokens()) {
                String token = st.nextToken();
                if (isBalanceSymbol(token)) {
                    if (isOpeningSymbol(token)) {
                        list.push(token);
                    } else {
                        if (list.peek() == null) {
                            return "Missing opening symbol";
                        }
                        if (isSameSymbol(list.peek())!=isSameSymbol(token)) {
                            return "Not matching symbol";
                        }
                        list.pop();
                    }
                }
            }
        }
        if (list.peek()!=null) {
            return "Missing closing symbol";
        }
        return "Balanced";
    }

    public static boolean isBalanceSymbol(String symbol) {
        switch (symbol) {
            case "{":
            case "}":
            case "[":
            case "]":
            case "(":
            case ")":
            case "<":
            case ">":
                return true;
        }
        return false;
    }

    public static boolean isOpeningSymbol(String symbol) {
        switch (symbol) {
            case "{":
            case "[":
            case "(":
            case "<":
                return true;
        }
        return false;
    }

    public static int isSameSymbol(String symbol) {
        switch (symbol) {
            case "{":
            case "}":
                return 1;
            case "[":
            case "]":
                return 2;
            case "(":
            case ")":
                return 3;
            case "<":
            case ">":
                return 4;
        }
        return -1;
    }
}
