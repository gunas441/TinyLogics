package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Reduce {
    public static void main(String[] args) {
//        int a[]={-3,1,2,3,4,5};
//        IntStream in = Arrays.stream(a);
//        int ans = in.reduce(0, (c,b)->c+b);
//        System.out.println(ans);

//        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//        Output: [1,2,2,3,5,6]

        int[] a1={0};
        int[] a2={1};

        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < a1.length; i++) {
            if(a1[i]!=0){
               li.add(a1[i]);
            }
        }
        for (int i = 0; i < a2.length; i++) {
            if(a2[i]!=0){
                li.add(a2[i]);
            }
        }
        Collections.sort(li);
        System.out.println(li);

    }
}
