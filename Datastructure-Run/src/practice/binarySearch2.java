/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Sardine
 */
public class binarySearch2 {
    public static void main(String[] args) {
        int[] data = {1,11,12,14,24,30,35,38,65,78,99,100};
        int key = 99;
        System.out.println(binarySearch(data, key));
    }
    
    public static int binarySearch(int[] data, int key){
        int length = data.length;
        int left = 0;
        int right = length-1;
        int middle;
        int position = -1;
        
        while(left <= right){
            middle = (right+left)/2;
            if (key < data[middle]) {
                right = middle-1;
            } else if (key > data[middle]){
                left = middle+1;
            } else {
                position = middle;
                break;
            }
        }
        return position;
    }
}
