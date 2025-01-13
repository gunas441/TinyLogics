package Array;

public class Removechar {
    public static void main(String[] args) {
        String a="Guna";
        StringBuilder sb = new StringBuilder();
        int n = a.length();
        for(int i=0;i<n;i++){
            if(a.charAt(i)!='a'){
               sb.append(a.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
