package Searches;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,2,1,6,9,8,6};
        mergeSort(arr,0,arr.length-1);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    private static void mergeSort(int[] arr, int l, int r) {

        if (l<r){
            int mid = (l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }

    }

    private static void merge(int[] arr,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i=0;i<n1;i++){
            leftArray[i]=arr[l+i];
        }
        for (int i=0;i<n2;i++){
            rightArray[i]=arr[mid+1+i];
        }

        int a=0;
        int b=0;
        int k=l;


        while (a<n1 && b<n2){
            if (leftArray[a]<=rightArray[b]){
                arr[k]=leftArray[a];
                a++;
            }else {
                arr[k]=rightArray[b];
                b++;
            }
            k++;
        }
        while (a<n1){
            arr[k]=leftArray[a];
            a++;
            k++;
        }
        while (b<n2){
            arr[k]=rightArray[b];
            b++;
            k++;
        }


    }
}
