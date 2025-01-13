package Demo;


import java.util.*;

public class DemoRunner {
    public static void main(String[] args) {
        int[] ar1 = {7,3,6,8,2,5,0,8};
        int[] ar2 = {7,1,9,5,0,8};
        int a = ar1.length;
        int b = ar2.length;



        int[] ar3 = new int[a+b];

        for(int i=0;i<a;i++){
            ar3[i]=ar1[i];
        }
        for(int i=0;i<b;i++){
            ar3[a+i]=ar2[i];
        }

        for (int i = 0; i < ar3.length; i++) {
            for (int j = 0; j < ar3.length-i-1; j++) {
                if(ar3[j]>ar3[j+1]){
                   int temp = ar3[j];
                   ar3[j]=ar3[j+1];
                   ar3[j+1]=temp;
                }
            }
        }
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < ar3.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if(ar3[i]==ar3[j]){
                    break;
                }
            }
            if(i==j){
               li.add(ar3[i]);
            }
        }
       // System.out.println(li);
    }

}
