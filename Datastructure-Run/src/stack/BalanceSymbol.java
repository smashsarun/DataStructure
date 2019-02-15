/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author INT303
 */
public class BalanceSymbol {

    public static String check(String fileName) throws FileNotFoundException {
        File f = new File(fileName);
        if (!f.exists()) {
            throw new FileNotFoundException(fileName);
        }
        Scanner sc = new Scanner(f);

        LinkedList<String> stack = new LinkedList<String>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            StringTokenizer stk = new StringTokenizer(line, "{}[]()<>", true);
            while (stk.hasMoreTokens()) {
                String token = stk.nextToken();
                if (isBalanceSymbol(token)) {
                    if (isOpeningSymbol(token)) {
                        stack.push(token);
                    } else {
                        String top = stack.peek();
                        if (top == null) {
                            return "Missing opening symbol";
                        }
                        if (getSymbolValue(top) != getSymbolValue(token)) {
                            return "Unbalanced";
                        }
                        stack.pop();
                    }
                }
            }
        }
        if (! stack.isEmpty()) {
            return "Missing closing symbol";
        }
        return "Balanced";
    }

    private static int getSymbolValue(String symbol) {

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

    private static boolean isOpeningSymbol(String symbol) {
        switch (symbol) {
            case "{":
            case "[":
            case "(":
            case "<":
                return true;
        }
        return false;
    }

    private static boolean isBalanceSymbol(String symbol) {
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

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(check("BalanceSymbol.java"));
    }
}
