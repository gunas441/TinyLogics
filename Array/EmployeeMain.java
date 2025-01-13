package Array;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
                List<Employee> em = new ArrayList<>();
        em.add(new Employee(1, "HR", "Arun"));
        em.add(new Employee(2, "DEV", "Guna"));
        em.add(new Employee(2, "HR", "Raja"));

         em.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                 Collectors.mapping(Employee::getName,Collectors.toList())))
                 .entrySet().stream().filter(e->e.getKey().equals("DEV"))
                 .toList().forEach(System.out::println);

       //  int[] ar = {2,8,1,5,1,2,0};

         List<String> st = Arrays.asList("abc","bac","cba","abc","bac");

        for (int i = 0; i < st.size(); i++) {
            int flag=0;
            for (int j = 0; j < i; j++) {
                if(i!=j && Objects.equals(st.get(i), st.get(j))){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(st.get(i));
            }
        }


//        for (int i = 0; i < ar.length; i++) {
//            int flag=0;
//            for (int j = 0; j < i; j++) {
//                if(i!=j && ar[i]==ar[j]){
//                    flag=1;
//                    break;
//                }
//            }
//            if(flag==0){
//                System.out.println(ar[i]);
//            }
//        }



    }
}
