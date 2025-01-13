package Array;

public class FindMissing {
    public static void main(String[] args) {
        int a[]={0,2,3,4};
        int n=a.length;
        missing(a,n);
        System.out.println(missing(a,n));
    }

    private static int missing(int[] a,int n) {
        for (int i = 1; i <= n; i++) {
            int flag = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] == i) {
                   flag = 1;
                   break;
                }
            }
            if (flag == 0)
                return i;
        }
        return -1;
    }
    }
