package Array;

import java.util.ArrayList;
import java.util.List;

public class PlaceOne {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        plusOne(arr);
    }

    public static int[] plusOne(int[] digits) {
        List<Integer> li=new ArrayList<>();
        int n=digits.length;
        int a[] = new int[n];
        int sum=0;
        for (int digit : digits) {
            sum = sum * 10 + digit;
        }
        sum=sum+1;
        for(int i=0;i<n;i++){
            digits[i]=sum % 10;
            sum=sum/10;
        }
        for (int i=n-1;i>=0;i--){
            li.add(digits[i]);
        }
        for (int i=0;i<n;i++){
            a[i]=li.get(i);
        }
        return a;
    }
}
