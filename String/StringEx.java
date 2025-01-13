package String;

import java.util.*;

public class StringEx {
    public static void main(String[] args) {

        String city = "rar";
//        int countm=0,counti=0;
//        for (int i = 0; i < city.length(); i++) {
//            char ch = city.charAt(i);
//            if(ch=='G'){
//                countm++;
//            }
//            if(ch=='u'){
//                counti++;
//            }
//        }
//        System.out.println("G = "+countm);
//        System.out.println("u = "+counti);

//        int[] a1 = {1,2,3,4,5,8,9};
//
//        int max1 = Integer.MIN_VALUE;
//        int max2 = Integer.MIN_VALUE;
//
//        for (Integer i:a1){
//            if(max1<i) {
//                max1 = i;
//            }
//        }
//        for (Integer j:a1){
//            if(j!=max1 && j>max2) {
//                max2 = j;
//            }
//        }
   //     System.out.println(max2);


//        Input: nums = [2,0,2,1,1,0]
//        Output: [0,0,1,1,2,2]

        int[] arr = {2,0,2,1,1,0};
        int left = 0;
        int mid = 0;
        int right= arr.length-1;
        int temp=0;
        while (mid<=right){
            if(arr[mid]==0) {
                temp = arr[mid];
                arr[mid]=arr[left];
                arr[left]=temp;
                mid++;
                left++;
            }else if(arr[mid]==1){
                mid++;
            }else {
                temp = arr[mid];
                arr[mid]=arr[right];
                arr[right]=temp;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
