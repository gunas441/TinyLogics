package Searches;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] select = {2,7,6,5,1,9,0};
        int n=select.length;
        for (int i = 0; i < n; i++) {
            int minindex=i;
            for (int j = i+1; j < n; j++) {
                if(select[j]>select[minindex]){
                    minindex=j;
                }
            }
            if(i!=minindex){
                int temp = select[minindex];
                select[minindex]=select[i];
                select[i]=temp;
            }
        }
        System.out.println(Arrays.toString(select));
    }
}
