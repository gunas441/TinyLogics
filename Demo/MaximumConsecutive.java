import static java.lang.Integer.max;

    public class MaximumConsecutive {
    public static void main(String[] args) {
        int[] ones = {1,1,0,1,1,1,0,1,1,1,1};
        int maxi = 0;
        int count = 0;
        for (int i=0;i<ones.length;i++){
            if(ones[i]==1){
                count++;
                maxi = max(maxi,count);
            }else {
                count=0;
            }
        }
        System.out.println(maxi);
    }
}
