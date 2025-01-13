package Array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        String inputString = "Java id";
        String abc = Stream.of(inputString)
                .map(s -> new StringBuilder(s).reverse().toString())
                .toList().getFirst();
        System.out.println(abc);

//        IntStream in = Arrays.stream(arr);
//        in.filter(n->n%2==0).forEach(System.out::println);

        String para = "Guna is good is";
        List<String> pararry= Arrays.asList(para.toLowerCase().split(" "));
        Map<String,Long> wordcount = pararry.stream().
                collect(Collectors.groupingBy(w->w,Collectors.counting()));
       // System.out.println(wordcount);

        String c="abc23ab12";
        Map<Character,Long> map = c.chars()
        .mapToObj(e -> (char) e)
        .collect(Collectors.groupingBy(s->s, Collectors.counting()));

        map.forEach((k,v)-> System.out.println(k+"->"+v+" "));

        String s="is2 sentence4 This1 a3";
                String arr[] = s.split(" ");
                Arrays.sort(arr , (a,b) -> Character.compare(a.charAt(a.length()-1),b.charAt(b.length()-1)));
                s = "";
                for(String val : arr){
                    s += val.substring(0,val.length()-1)+" ";
                }
        //System.out.print(s);


    }
}
