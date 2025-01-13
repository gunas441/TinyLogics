package Searches;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={18,15,12,13,11,10};
        int low=0;
        int high=arr.length-1;
        quicksort(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }

    private static void quicksort(int[] arr, int low, int high) {
        if(low<high){
            int pi=partition(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i=low-1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
         int temp=arr[i+1];
         arr[i+1]=arr[high];
         arr[high]=temp;
         return i+1;
        }
    }

