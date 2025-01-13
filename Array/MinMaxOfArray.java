package Array;

public class MinMaxOfArray {

    public static void mini(int[] a){
        int minim = Integer.MAX_VALUE;
        for (int i=0;i<a.length;i++){
            if(a[i]<minim){
                minim=a[i];
            }
        }
        System.out.println("Min "+minim);
    }

    public static void maxi(int[] a){
        int maxim=Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            if(a[i]>maxim){
                maxim=a[i];
            }
        }
        System.out.println("Max "+maxim);
    }

    public static void main(String[] args) {
        int [] a={2,1,6,9,7};
        mini(a);
        maxi(a);
    }
}
