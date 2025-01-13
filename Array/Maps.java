package Array;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Maps {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("anil", 1000);
        map1.put("bhavna", 1300);
        map1.put("micael", 1500);
        map1.put("tom", 1600);
        map1.put("ankit", 1200);
        map1.put("daniel", 1700);
        map1.put("james", 1400);

        if(map1.size()<n){
            System.out.println("out of limit");
            return;
        }

        Map.Entry<String, Integer> results = getNthHighestSalary(n, map1);
        System.out.println(results);
    }

    public static Map.Entry<String, Integer> getNthHighestSalary(int num, Map<String, Integer> map) {
        return map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .toList()
                .get(num - 1);
    }

//          List<Integer> list = Arrays.asList(1,2,3,4);
//            list.stream()
//            .sorted(Collections.reverseOrder()) // Method on Stream<Integer>
//            .forEach(System.out::println);

}
