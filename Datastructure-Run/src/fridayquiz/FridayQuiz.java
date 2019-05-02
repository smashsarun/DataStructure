/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fridayquiz;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Sardine
 */
public class FridayQuiz {

    public static String Check(String msg) {
        if (msg == null) {
            return "No symbol";
        }

        LinkedList<String> stack = new LinkedList<String>();
        StringTokenizer st = new StringTokenizer(msg, "{}[]()<>", true);
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            //System.out.println(token);
            if (isSymbol(token)) {
                if (isOpenSymbol(token)) {
                    stack.push(token);
                } else {
                    String top = stack.peek();
                    if (top == null) {
                        return "false - ";
                    }
                    if (caseOfValue(top) != caseOfValue(token)) {
                        return "false - "; 
                    }
                    stack.pop();
                }
            }
        }
        if (!stack.isEmpty()) {
            return "false - ";
        }
        return "true -";
    }

    public static int caseOfValue(String symbol) {
        switch (symbol) {
            case "[":
            case "]":
                return 1;
            case "{":
            case "}":
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

    public static boolean isSymbol(String symbol) {
        switch (symbol) {
            case "(":
            case "{":
            case "[":
            case "<":
            case ")":
            case "}":
            case "]":
            case ">":
                return true;
        }
        return false;
    }

    private static boolean isOpenSymbol(String symbol) {
        switch (symbol) {
            case "(":
            case "{":
            case "[":
            case "<":
                return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String msg = sc.next();
        
        System.out.println(Check(msg));
    }
}
