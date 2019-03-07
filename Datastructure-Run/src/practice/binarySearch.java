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
public class binarySearch {
    public static void main(String[] args) {
        int[] data = {1,2,5,10,11,18,28,57,88,104,105,108,116,157};
        System.out.println(binarySearch(data, 104));        
    }
    
    public static int binarySearch(int[] data, int key){
        int length = data.length;
        int left = 0;
        int right = length-1;
        int middle;
        int position = -1;
        
        while(left <= right){
            middle = (left+right)>>>1;
            if (key < data[middle]) {
                right = middle-1;
            } else if( key > data[middle]){
                left = middle+1;
            } else {
                position = middle;
                break;
            }
        }
        return position;
    }
}
