package Array;

import java.util.Arrays;

public class FindLargest {
    public static void main(String[] args) {
        int arr[] = {5,6,7,4,3};
        int arr1[]={2,5,3,25,4};
//        System.out.println("Array 1 largest = "+sort(arr));
//        System.out.println("Array 2 largest = "+sort(arr1));
        System.out.println("Array 1 largest = "+findlarge(arr));
        System.out.println("Array 2 largest = "+findlarge(arr1));
    }

    //TC->O(n*log(n)), SC->O(n)
    public static int sort(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    //TC->O(n), SC->O(1)
    public static int findlarge(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
