/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Sardine
 */
public class infixToPostfix {

    public static void main(String[] args) {
        System.out.println(infixToPost("3*2+5-8"));
    }

    public static String infixToPost(String statement) {
        LinkedList<String> stack = new LinkedList();

        Scanner sc = new Scanner(statement);
        while (sc.hasNext()) {
            String nextstep = sc.next();
            StringTokenizer st = new StringTokenizer(nextstep, "", true);
            while (st.hasMoreTokens()) {
                String next = st.nextToken();
                if (isSymbol(next)) {
                    if (stack.isEmpty()) {
                        stack.push(next);
                    } else {
                        String top = stack.peek();
                        while (compareImportant(next) <= compareImportant(top) && !stack.isEmpty()) {
                            top = stack.peek();
                            if (compareImportant(next) > compareImportant(top)) {
                                stack.push(next);
                            } else {
                                stack.pop();
                            }
                        }
                    }
                } else {
                    stack.push(next);
                }
            }
        }
        return stack.peek();
    }

    private static boolean isSymbol(String value) {
        switch (value) {
            case "+":
            case "-":
            case "*":
            case "/":
                return true;
        }
        return false;
    }

    private static int compareImportant(String value) {
        switch (value) {
            case "*":
            case "/":
                return 2;
            case "+":
            case "-":
                return 1;
        }
        return -1;
    }
}
