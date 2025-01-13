package Array;

import java.util.*;
import java.util.function.UnaryOperator;

public class ArrayContaions {

    static void unique(List<Integer> a, List<Integer>b){
        List<Integer> result = new ArrayList<>();
        for(Integer numa:a){
            if(b.contains(numa)){
                result.add(numa);
            }
        }
        for(Integer numb:b){
            if(a.contains(numb)){
                result.add(numb);
            }
        }
       result.stream().distinct().forEach(System.out::print);
//        for (Integer i : a) {
//            for (Integer j : b) {
//                if (Objects.equals(i, j)) {
//                    System.out.print(i+ " ");
//                }
//            }
//        }
    }

//    static void uniquech(List<Character> a, List<Character>b){
//        for (Character i : a) {
//            for (Character j : b) {
//                if (Objects.equals(i, j)) {
//                    System.out.print(i + " ");
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 3, 4);
        List<Integer> b = Arrays.asList(6, 2, 7, 4);


//        List<Character> c = Arrays.asList('g', 'u', 'n', 'a');
//        List<Character> d = Arrays.asList('s', 'e', 'k', 'a', 'r', 'a', 'n');


        List<String> link = new LinkedList<>();

        link.add("b");
        link.add("c");
        link.add("a");

        Collections.sort(link);

        System.out.println(link);

        unique(a,b);
//        uniquech(c,d);
        String text = "gunasekaran";

        String c = stringFirstre(text);
        System.out.println(c);

    }

      static String stringFirstre(String text) {
        String rev="";
        for (int i = 0; i < text.length(); i++) {
            int j;
            for (j = 0; j < text.length(); j++) {
                if(i!=j && text.charAt(i)==text.charAt(j)){
                    break;
                }
            }
            if(j!=text.length()-2){
                rev = text.charAt(i)+rev;
                return rev;
            }
        }
      return "";
    }


}
