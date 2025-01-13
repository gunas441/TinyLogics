package String;

import java.util.Arrays;
import java.util.Objects;

public class Stringsortpar {
    public static void main(String[] args) {

// Arrange vowels order in String

        String text = "this is dog and it was barking";
        String ne="";
        String[] str = text.split(" ");
        for (String i:str) {
            if (i.charAt(0)=='a' || i.charAt(0)=='e' ||
                    i.charAt(0)=='i' || i.charAt(0)=='o' ||
                    i.charAt(0)=='u') {
                ne+=i+" ";
            }
        }
        for (String i:str) {
            if (i.charAt(0)!='a' && i.charAt(0)!='e' &&
                    i.charAt(0)!='i' && i.charAt(0)!='o' &&
                    i.charAt(0)!='u') {
               ne+=i+" ";

            }
        }
        System.out.println(ne);

        // Arrange ascending order in String

//        String text = "ball cat apple";
//        String[] str = text.split(" ");
//
//        StringBuilder sb =new StringBuilder();
//
//        char ch;
//        for (ch='z';ch>='a';ch--){
//            for (String i:str) {
//                if(i.charAt(0)==ch){
//                    sb.append(i);
//                    sb.append(" ");
//                }
//            }
//        }
//        System.out.println(sb);


// Find the duplicate character in String;

        String words = "bbaacdde";
        char[] ch = words.toCharArray();
        Arrays.sort(ch);
        for (int i = 0; i < ch.length; i++) {
            int count=0;
            while (i<ch.length-1 && ch[i] == ch[i + 1]){
                count++;
                i++;
            }
            if(count==0){
                System.out.println(ch[i]);
            }
        }

        int[] sel = {3,4,5,7,8,2,3,5};
        Arrays.sort(sel);
        for (int i = 0; i < sel.length; i++) {
            int count=0;
            while (i<sel.length-1 && sel[i]==sel[i+1]){
                count++;
                i++;
            }
            if(count==0){
                System.out.print(sel[i]+" ");
            }
        }

    }
}
