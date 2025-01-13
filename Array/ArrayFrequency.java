package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayFrequency {
    public static void main(String[] args) {
//        int[] arr={1,2,1,2};
//        int n=arr.length;
//        freqency(arr,n);
        String s="abcb3ab1b";
        s=s.toLowerCase();
        int sn=s.length();
        freqencyChar(s,sn);
        //samarrayfreq();
    }


    private static void freqencyChar(String s, int sn) {
        char[] c = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (char ch:c) {
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        int max = map.get('a');
        int semax = map.get('a');
        char x=' ';
        for (Map.Entry<Character,Integer> em:map.entrySet()){
            if(em.getValue()<max){
                max = em.getValue();
            }
            if(em.getValue().equals(max)){
                x = em.getKey();
            }
        }
        System.out.println(x+"->"+max);

    }

    private static void freqency(int[] arr,int n) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
           if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
           }else{
               map.put(arr[i],1);
           }
        }
        for (Map.Entry en:map.entrySet()){
            System.out.println(en.getKey() +"->"+en.getValue());
        }
    }

    private static void samarrayfreq() {
        int[] nums = {1, 1, 2, 1, 3, 5, 1};
        int ans = 0;
        int count = 0;
        for (int i : nums) {
            if (count == 0) {
                ans = i;
            }
            if (ans == i) {
                count++;
            } else {
                count--;
            }
            System.out.println(ans);
        }
        System.out.println(ans);

    }
}
