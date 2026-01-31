package streams;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Repeated {

    private static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
               return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // top 3 element
        List<Integer> a = Arrays.asList(8,5,7,9,4,9);
        List<Integer> b = Arrays.asList(9,4,6,2,98);
        List<Integer> c = Stream.concat(a.stream(),b.stream()).toList();
        c.stream().sorted(Comparator.reverseOrder()).limit(3).toList().forEach(System.out::println);
        System.out.println(c);

        // find common element
        Set<Integer> set = new HashSet<>();
        c.stream().filter(s->!set.add(s)).distinct().toList().forEach(System.out::println);

        // get the highest occurrence value
        c.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet()
                .stream().max(Map.Entry.comparingByValue()).ifPresent(w->{
                    System.out.println("max = "+w.getKey());
                });

        // Given a list of strings, write a program to count the number of strings containing a specific character ‘a’ using Java Stream API.
        List<String> list = Arrays.asList("apple", "banana", "orange", "grape");
        list.stream().filter(e->e.contains(String.valueOf('a'))).count();


        // Given a list of integers, write a program to calculate the average of all the numbers using Java Stream API
        List<Integer> avg = Arrays.asList(1,2,3,4,5);
        avg.stream().mapToDouble(e->e).average().ifPresent(System.out::println);

        // sort
        list.stream().sorted().toList().forEach(System.out::println);
        list.stream().sorted(Comparator.reverseOrder()).toList().forEach(System.out::println);

        // join
        String join = list.stream().collect(Collectors.joining());
        System.out.println(join);

        // Write a program to find the longest string in a list of strings using Java Stream API.
        String longStr = list.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(longStr);

        // Given a list of strings, write a program to find and print the shortest string using Java Stream API.
        List<String> fruit = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        String frtName = fruit.stream().max(Comparator.comparing(String::length)).orElse(null);
        System.out.println(frtName);

        // prime check
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        numbers.stream().filter(Repeated::isPrime).toList().forEach(System.out::println);

        // match string check
        boolean ifIsFruit = fruit.stream().anyMatch(e->e.equals("banana"));
        System.out.println(ifIsFruit);

        Collections.reverse(fruit);

        // intersection
        List<String> list1 = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        List<String> list2 = Arrays.asList("banana", "orange", "grape", "watermelon");
        list1.stream().filter(list2::contains).toList().forEach(System.out::println);

        // containing only vowels words
        List<String> vov = Arrays.asList("apple", "banana", "kiwi", "orange", "pear","nymph");
        vov.stream().filter(s->s.matches(".*[aeiouAEIOU].*")).toList().forEach(System.out::println);

        // give the union list
        List<Integer> u1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> u2 = Arrays.asList(4, 5, 6, 7, 8);
        List<Integer> u3 = Stream.concat(u1.stream(),u2.stream()).
                distinct().toList();
        u3.forEach(System.out::println);

        // find duplicate char at words print the words
        List<String> dupChar = Arrays.asList("apple", "banana", "kiwi", "orange", "pear", "strawberry", "watermelon");
        dupChar.stream().filter(dc->dc.length() != dc.chars().distinct().count())
                .toList().forEach(System.out::println);

       // Given a list of strings, write a program to find and print the strings with the maximum number of vowels using Java Stream API.
        List<String> maxVov = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        Map<String, Long> freMap = maxVov.stream().collect(Collectors.toMap(s -> s, s ->
                s.chars().filter(o -> "AEIOUaeiou".indexOf(o) != -1).count()));
        System.out.println(freMap);
        long l = freMap.values().stream().mapToLong(Long::longValue).max().orElse(0);
        System.out.println(l);
        freMap.entrySet().stream().filter(e->e.getValue()==l).
                map(Map.Entry::getKey).toList().forEach(System.out::println);

        // Write a program to remove all non-numeric characters from a list of strings using Java Stream API.
        List<String> difStr = Arrays.asList("a1b2c3", "1a2b3c", "123abc");
        Pattern pattern = Pattern.compile("[^0-9]");
        List<String> patList = difStr.stream().map(s -> pattern.matcher(s).replaceAll("")).toList();
        System.out.println(patList);

        // first non repeated character
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        Map<Character, Long> collect = inputString.chars().mapToObj(s -> (char) s)
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));
        collect.entrySet().stream().filter(e->e.getValue()==1)
                .map(Map.Entry::getKey).findFirst().ifPresentOrElse(value -> System.out.println("Found: " + value),
                        () -> System.out.println("No value found"));

        // find duplicate character
        Set<Character> sets = new HashSet<>();
        inputString.chars().mapToObj(e->(char) e).filter(ch->!sets.add(ch))
                .distinct().toList().forEach(System.out::println);

    }
}
