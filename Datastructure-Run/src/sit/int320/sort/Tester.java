/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int320.sort;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author INT303
 */
public class Tester {

    private static final int SIZE = 200_000;
    
    public static void main(String[] args) {
        Integer[] data = new Integer[SIZE];
        Integer[] data2 = new Integer[SIZE];
        
        Random r = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = i;//r.nextInt(100);
        }
        System.arraycopy(data, 0, data2, 0, data.length);
        //System.out.println("Original sorted: ");
        //printArray(data);
        long before = System.currentTimeMillis();
        Arrays.parallelSort(data2);
        long duration1 = System.currentTimeMillis() - before;
        
        before = System.currentTimeMillis();
        Sorter.insertionSort(data);
        long duration2 = System.currentTimeMillis() - before;
        
        System.out.println("Parallel sort: "+duration1 + " milliseconds");
        System.out.print("Insertion sort: "+duration2 + " milliseconds");
//        Sorter.insertionSort(data,new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
        //System.out.println("After sorted: ");
        //printArray(data);
    }
    
    private static void printArray(Integer[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%2d%s",data[i],(i+1)%10==0?"\n":"\t");
        }
        System.out.println("");
    }
}
