package Array;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        int x=-121;
        palindromecheck(x);
        System.out.println(palindromecheck(x));
        int[] arr = {1,3,3,4,1,2};
        removeDuplicates(arr);


    }

    public static int removeDuplicates(int[] arr) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;
            if (i == j)
                res.add(arr[i]);
        }

        System.out.println(res);

//        Set<Integer> se = new HashSet<>();
//        for(Integer i:arr){
//            se.add(i);
//        }
//        System.out.println(se);
        return -1;
    }

     public static boolean palindromecheck(int x) {
        int temp = x;
        int reverse=0;
        while (x>0){
            int remainder=x%10;
            reverse=reverse*10+remainder;
            x = x / 10;
        }

        // Amstrong no

//         while (x>0){
//             int remainder=x%10;
//             reverse=reverse+remainder*remainder*remainder;
//             x=x/10;
//         }
        return temp == reverse;
     }
}
