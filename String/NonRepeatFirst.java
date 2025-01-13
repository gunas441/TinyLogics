package String;

import java.util.*;

public class NonRepeatFirst {
    public static void main(String[] args) {
        String text = "swiss";
        //findchar(text);
        String words = "Java is great and Java is fun and Java is powerful";
      //  findWords(words);

        mostrepeatword(words);

        String tex="r#aa$pid";
        char[] tx=tex.toCharArray();
        int i=0;
        int j=tx.length-1;
        while (i<j){
            if(!Character.isAlphabetic(tx[i])){
                i++;
            }else if(!Character.isAlphabetic(tx[j])){
                j--;
            }else {
                char ch = tx[i];
                tx[i]=tx[j];
                tx[j]=ch;
                i++;
                j--;
            }
        }
        String s = new String(tx);
     //   System.out.println(s);

    }

    private static void mostrepeatword(String words) {
        String[] str = words.split(" ");
        for (int i = 0; i < str.length; i++) {
            for (int j = i+1; j < str.length; j++) {
                if(str[i].equals(str[j])){
                    System.out.println(str[i]);
                }
            }
        }

        Set<String> set = new HashSet<>();
        for (String i:str){
            if(set.add(i)==false){
                System.out.println(i);
            }
        }

    }

    private static void findWords(String words) {
        String[] arrWord = words.split(" ");
        System.out.println(arrWord.length-1);
        // remove duplicates
        StringBuilder sb = new StringBuilder();
        Set<String> set  = new HashSet<>();
        for (String i : arrWord){
            set.add(i);
        }
        for (String j:set){
            sb.append(j+" ");
        }
        System.out.println(sb.toString());

    }

    private static void findchar(String text) {

        Map<Character,Integer> map = new HashMap<>();
        for (char c:text.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        map.entrySet().forEach(System.out::println);
//        char a = ' ';
//        for (Map.Entry<Character,Integer> me:map.entrySet()){
//            if(me.getValue()==v){
//                a = me.getKey();
//            }
//        }
//        System.out.println(a);


        // first non repeat character.
        char c = map.entrySet().stream().filter(e -> e.getValue() == 1).toList().getFirst().getKey();

        System.out.println("First non repeating character = "+c);

        // repeated characters in string
        int v =  map.entrySet().stream().map(Map.Entry::getValue).sorted().toList().getLast();
        char o = map.entrySet().stream().filter(e -> e.getValue() == v).toList().getFirst().getKey();
        System.out.println("Most repeating character = "+o);

    }
}
