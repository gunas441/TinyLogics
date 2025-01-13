package Array;

public class SsamllSlarge {
    public static void main(String[] args) {
        int arr[]={3,4,6,2,8,6,9};
        int n = arr.length;
        getElement(arr,n);
    }
    
    public static void getElement(int arr[],int n){
        int samll = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_small=Integer.MAX_VALUE;
        int second_large=Integer.MIN_VALUE;
        int i;
        for (i = 0; i < n; i++) {
            samll=Math.min(samll,arr[i]);
            large=Math.max(large,arr[i]);
        }
        for ( i = 0; i < n; i++) {
            if(arr[i]<second_small && arr[i]!=samll){
                second_small = arr[i];
            }
            if(arr[i]>second_large && arr[i]!=large){
                second_large = arr[i];
            }
        }
        System.out.println("Second smallest no: "+second_small);
        System.out.println("Second largest no: "+second_large);
    }
}
