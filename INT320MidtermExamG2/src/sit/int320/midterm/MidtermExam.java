/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int320.midterm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class MidtermExam {

    private static int precedenceLevel(String operator) {
        switch (operator) {
            case "(":
            case ")":
                return 0;
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
            case "%":
                return 2;
        }
        throw new RuntimeException("Invalid operator");
    }

    private static boolean isOperator(String operator) {
        switch (operator) {
            case "(":
            case ")":
            case "+":
            case "-":
            case "*":
            case "/":
            case "%":
                return true;
        }
        return false;
    }

    public static String infixToPostfix(String exp) {
        StringBuilder result = new StringBuilder(128);
        StringTokenizer st = new StringTokenizer(exp, " ()+-*/%", true); //trueเพื่อขอดิลิมิเตอร์มาด้วย
        LinkedList<String> stack = new LinkedList();
        String token;
        while (st.hasMoreElements()) {
            token = st.nextToken();
            if (token.equals(" ")) {
                continue;
            } else if (!isOperator(token)) { //เป็น operand
                result.append(" ");
                result.append(token);
            } else if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.isEmpty() && !"(".equals(stack.peek())) {
                    result.append(" ");
                    result.append(stack.pop());
                }
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                while (!stack.isEmpty() && precedenceLevel(token) <= precedenceLevel(stack.peek())) {
                    result.append(" ");
                    result.append(stack.pop());
                }
                stack.push(token);
            }
        }
        while (!stack.isEmpty()) {
            result.append(" ");
            result.append(stack.pop());
        }

        return result.toString().trim();
    }

    public static String getTopMostNumber(int[] numbers) {
        Map<Integer, KeyAndPositions> freq = new HashMap();
        int key;
        for (int i = 0; i < numbers.length; i++) {
            key = numbers[i];
            if (freq.get(key) == null) {
                freq.put(key, new KeyAndPositions(key, i));
            } else {
                freq.get(key).addPosition(i);
            }
        }
        List<KeyAndPositions> list = new ArrayList(freq.values());
        Collections.sort(list);
        //        for (KeyAndPositions keyAndPositions : list) {
        //            System.out.println(keyAndPositions.key+" ("+keyAndPositions.positions.size()+
        //                    ") : "+keyAndPositions.positions);
        //        }

        KeyAndPositions result = list.get(0);
        return result.key + " (" + result.positions.size() + ") : " + result.positions;
    }

    public static Object[] arrayUnion(Object[] obj1, Object[] obj2) {
        return arrayUnion(obj1, obj2, null);
    }

    public static Object[] arrayUnion(Object[] obj1, Object[] obj2, Comparator c) {
        Set setA;
        if (c == null) {
            setA = new TreeSet();
        } else {
            setA = new TreeSet(c);
        }
        setA.addAll(Arrays.asList(obj1));
        setA.addAll(Arrays.asList(obj2));
        return setA.toArray();
    }

    static class StringCompareIgnoreCase implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o1.compareToIgnoreCase(o2); //ไม่สน case sensitive
        }
    }

    public static void main(String[] args) {
//        String[] a = {"A","B","C","D","e","f","x","x"};
//        String[] b = {"a","b","C","d","e","x"};
//        System.out.println(Arrays.toString(arrayUnion(a, b)));
//        System.out.println(Arrays.toString(arrayUnion(a, b, new StringCompareIgnoreCase())));

//        int[] x = {1, 3, 5, 6, 3, 5, 7, 3, 1, 5, 1, 7, 8};
//        System.out.println(getTopMostNumber(x));
        String exp = "A+(B-salary)/2.59*X%b";
        System.out.println(infixToPostfix(exp));
    }
}

class KeyAndPositions implements Comparable<KeyAndPositions> {

    int key;
    List<Integer> positions = new ArrayList(20);

    public KeyAndPositions(int key, int position) {
        this.key = key;
        positions.add(position);
    }

    public void addPosition(int position) {
        this.positions.add(position);
    }

    @Override
    public int compareTo(KeyAndPositions o) {
        int first = -(this.positions.size() - o.positions.size());
        if (first != 0) {
            return first;
        } else {
            return this.key - o.key; //เอาค่าน้อยสุด ถ้าเอามากก็สลับ
        }
    }
}
