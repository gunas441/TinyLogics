package Array;

public class Demo {
    public static void main(String[] args) {
        //fibonacci();
        //fact();
       int z =  factre(5);
        System.out.println(z);
        //revStr();
        strloop();
        // prime(19);
        // primeCount(20);

    }

    private static int factre(int n) {
        if(n==0 || n==1){
            return 1;
        }else{
            return n*factre(n-1);
        }
    }

    public static void fact() {
        int fact = 1;
        int nooffact=5;
        for (int i = 1; i <= nooffact; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static void fibonacci() {
        int n = 10;
        int a = 1;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void revStr() {
        String s = "Hello";
        String rev = "";
        for (int i = 0; i < s.length(); i++) {
            rev = s.charAt(i) + rev;
        }
        System.out.println(rev);
    }

    public static void prime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
            System.out.println(i);
        }
        if(count==2){
            System.out.println("prime");
        }else {
            System.out.println("not");
        }
    }


    public static void primeCount(int n) {
        for (int i = 2; i <=n; i++) {
            int count=0;
            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.println(i);
            }
        }
    }


    public static void strloop(){
        char ch;
        String s="gubana";
        for (ch='a';ch<='z';ch++){
            int count=0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)==ch){
                    count++;
                }
            }
            if(count>0){
                System.out.println(ch+" "+count);
            }

        }
    }

}
