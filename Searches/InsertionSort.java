package Searches;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        String[] names = {"ram","priya","arun","deena"};
        int[] nums={2,3,1,5,4,6,9,7};
        int n=names.length;
        int no=nums.length;
        ascNames(names,n);
        ascNumber(nums,no);
    }

    private static void ascNumber(int[] nums, int no) {
        for (int i = 1; i < no; i++) {
            int temp = nums[i];
            int j=i-1;
            while (j>=0 && nums[j]>temp){
                nums[j+1]=nums[j];
                nums[j]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void ascNames(String[] names, int n) {
        for (int i=1;i<n;i++){
            String key = names[i];
            int j=i-1;
            while (j>=0 && names[j].compareTo(key)>0){
                names[j+1]=names[j];
                names[j]=key;
                j--;
            }
        }
        System.out.println(Arrays.toString(names));
    }

}
