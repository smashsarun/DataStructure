/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Sardine
 */
public class Stack {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        boolean check = Check(sc.next());
        if (check == false) {
            System.out.println(check+" -- Wrong");
        } else {
            System.out.println(check+" --Correct");
        }
    }

    public static boolean Check(String msg) {

        LinkedList<String> stack = new LinkedList<String>();

        StringTokenizer st = new StringTokenizer(msg, "[]{}()<>", true);

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (isSymbol(token)) {
                if (isOpenSymbol(token)) {
                    stack.push(token);
                } else {
                    String top = stack.peek();
                    if (top == null) {
                        return false;
                    }
                    if (isSameGroup(top) != isSameGroup(token)) {
                        return false;
                    }
                    stack.pop();
                }
            }
        }
        if (stack.peek()!=null) {
            return false;
        }
        return true;
    }

    public static boolean isSymbol(String symbol) {
        switch (symbol) {
            case "[":
            case "]":
            case "(":
            case ")":
            case "<":
            case ">":
            case "{":
            case "}":
                return true;
        }
        return false;
    }

    public static boolean isOpenSymbol(String symbol) {
        switch (symbol) {
            case "[":
            case "{":
            case "(":
            case "<":
                return true;
        }
        return false;
    }

    public static int isSameGroup(String symbol) {
        switch (symbol) {
            case "[":
            case "]":
                return 1;
            case "(":
            case ")":
                return 2;
            case "<":
            case ">":
                return 3;
            case "{":
            case "}":
                return 4;
        }
        return -1;
    }
}
