package Searches;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
    //Note : Better for large data sets and sorted data structure.
        int[] arr={2,3,4,5,6,7};
        int target = 4;
        int index = getBinaryValues(arr,target);
        if(index==-1){
            System.out.println("Element not there!");
        }else {
            System.out.println("Element index position at = "+index);
        }
    }

    private static int getBinaryValues(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;
        while (left<=right){
            int mid = right-left/2;
            if(arr[mid]==target){
               return mid;
            }
            if(arr[mid]>target){
                right--;
            }else {
                left++;
            }
        }
        return -1;
    }
}
