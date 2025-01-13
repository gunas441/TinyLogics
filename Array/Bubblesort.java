package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bubblesort {
    public static void main(String[] args) {
        int[] array = {1, 9, 9, 1};
        int n=array.length;
//        bubble(array,n);
//     System.out.println(distinct(array));
       // fizzBuzz(10);
        int ans = multiply(10,10);
        System.out.println(ans);

    }

    private static int multiply(int a, int b) {
        if(a==0 || b==0){
            return 0;
        }else {
            return a+multiply(a,b-1);
        }
    }

    public static List<List<String>> fizzBuzz(int n) {
        List<String> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0){
                li.add("Fizz");
            }else if(i%5==0){
                li.add("Buzz");
            }else if(i%3==0 && i%5==0){
                li.add("FizzBuzz");
            }
            li.add(String.valueOf(i));
        }
        System.out.println(Arrays.asList(li));
        return List.of(li);
    }


    public static void bubble(int []arr,int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i : arr){
            System.out.print(i);
        }
    }




}
