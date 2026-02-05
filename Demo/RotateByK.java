import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        int k=3;
        k = k % arr.length;
        reversearr(arr,0,arr.length-1);
        reversearr(arr,0,k-1);
        reversearr(arr,k,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reversearr(int[] arr, int l, int r) {
        while (l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
