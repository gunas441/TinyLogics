package Array;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int n = arr.length;
        slove(arr,n);
        int d=2;
      //  rotated(arr,d);
    }

    // rotate d element
    private static void rotated(int[] arr, int d) {
        for(int i=0;i<d;i++){
            int temp = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void slove(int[] arr,int n){
        int i = 0, j = arr.length - 1;
        while (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
