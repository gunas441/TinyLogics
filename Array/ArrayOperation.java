package Array;

import java.util.Arrays;

public class ArrayOperation {
    public static void main(String[] args) {
        //Add element in array
        int[] a={1,2,3,4,5};
        int n=a.length;
        int addel=6;
        int[] b=new int[n+1];
        for(int i=0;i<n;i++){
            b[i]=a[i];
        }
        b[n]=addel;
        a=b;
        System.out.println(Arrays.toString(a));

        //Remove element in array by index
        int removeIndex=1;
        int [] c=new int[a.length-1];
        int j=0;
        for (int i = 0; i < a.length; i++) {
            if(i!=removeIndex) {
                c[j++] = a[i];
            }
        }
        a=c;
        System.out.println(Arrays.toString(a));

        //Update the element by index
        int updateIndex=1;
        int newelement=5;
        a[updateIndex]=newelement;
        System.out.println(Arrays.toString(a));
    }
}
