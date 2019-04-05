/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int320.recursion;

/**
 *
 * @author INT303
 */
public class BinarySearchExample {

    public static void main(String[] args) {
        String[] str = {"A", "B", "C", "G", "J", "K", "O", "P", "Q", "S", "T", "U", "V", "W"};
        Integer[] data = {1, 7, 15, 17, 29, 35, 42, 48, 49, 51, 102, 150};
        int pos = binarySearch(data, 17);
        System.out.println("Key 17, Position = " + pos);
        pos = binarySearch(str, "B");
        System.out.println("Key B, Position = " + pos);
    }

    private static int binarySearch(Object[] data, Object key, int left, int right) {
        if (left > right) {
            return -1;
        }
        Comparable k = (Comparable) key;
        int mid = (left + right) / 2;
        Comparable value = (Comparable) data[mid];
        int compareValue = k.compareTo(value);

        if (compareValue < 0) {
            return binarySearch(data, key, left, mid - 1);
        } else if (compareValue > 0) {
            return binarySearch(data, key, mid + 1, right);
        } else {
            return mid;
        }
    }

    private static int binarySearch(Object[] data, Object key) {
        return binarySearch(data, key, 0, data.length - 1);
//        int left = 0;
//        int right = data.length-1;
//        Comparable k = (Comparable)key;
//        while(left <= right){
//            int mid = (left+right) / 2;
//            Comparable value = (Comparable)data[mid];
//            int compareValue = k.compareTo(value);
//            if (compareValue < 0) { //ครึ่งซ้าย
//                right = mid -1;
//            } else if (compareValue > 0){ //ครึ่งขวา
//                left = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
    }
}
