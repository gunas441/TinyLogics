package Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LastWord {
    public static void main(String[] args) {
        String str="The Sky is Blue ";
//        findlastword(str);
//        System.out.println(findlastword(str));
        reverseword(str);

        String a1="keep";
        String a2="poek";
        anagram(a1,a2);

        int i=12454;

        IntStream chars = String.valueOf(i).chars();
        int sum = chars.map(e->Character.getNumericValue(e)).sum();
        System.out.println(sum);
//        int f=0;
//        while (i!=0){
//            int ss=i%10;
//            f=ss+f;
//            i=i/10;
//        }
//        System.out.println(f);

        Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));

       // System.out.println(sumOfDigits);

        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        list1.stream().filter(list2::contains).forEach(System.out::println);
    }

    private static void anagram(String a1, String a2) {
        char[] a = a1.toCharArray();
        char[] b = a2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not");
        }
    }

    private static void reverseword(String str) {
        String[] words = str.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length-1; i>=0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());

        StringBuilder first = Arrays.stream(words).map(s -> new StringBuilder(s).reverse()).toList().getFirst();
        System.out.println(first);
    }





private static int findlastword(String str) {
        int length=0;
        str=str.trim();
        for (int i = str.length()-1; i >= 0 ; i--) {
           if(str.charAt(i)!=' '){
               length++;
           }else {
               break;
           }
        }
        return length;
    }
}
