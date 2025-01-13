package Searches;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinerSearch {
    public static void main(String[] args) {
    //Note : Better for unsorted and small size of data structures.
        int[] arr={3,4,3,2,9,8,7,5,3};
        int target = 3;
        int[] finalElements = getValues(arr,target);
        System.out.println(Arrays.toString(finalElements));
    }

    private static int[] getValues(int[] arr, int target) {
        List<Integer> arrList = new ArrayList<>();
        for (int i : arr) {
            if (i == target) {
                arrList.add(i);
            }
        }
        int[] newIntArray = new int[arrList.size()];
        for (int i = 0; i < newIntArray.length; i++) {
            newIntArray[i]=arrList.get(i);
        }
        return newIntArray;
    }
}
