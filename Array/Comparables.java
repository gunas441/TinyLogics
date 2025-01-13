package Array;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
//     @Override
//     public int compareTo(Student o) {
//         if(o.name.compareTo(this.name)>0){
//             return 1;
//         }else {
//             return -1;
//         }
//     }
 }

public class Comparables {

    public static void main(String[] args) {
    // number Compare
      //   Comparator<Student> com = (o1,o2)-> o1.id>o2.id?1:-1;
    // Character Compare
        // Comparator<Student> com = (o1,o2)-> o1.name.charAt(o1.name.length()-1)>o2.name.charAt(o2.name.length()-1)?1:-1;

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(1, "Guna"));
        studs.add(new Student(3, "Arun"));
        studs.add(new Student(2, "Mani"));

        List<Integer> inli = Arrays.asList(2,5,4,3,7,9,8);

        int max = inli.stream().mapToInt(e -> e).min().orElseThrow(NoSuchElementException::new);
        System.out.println(max);

        Integer reduce = inli.stream().reduce(0, (a, c) -> a + c);

        int[] st = {2,5,4,3,7,9,8};

        int sum = Arrays.stream(st).max().orElseThrow(NoSuchElementException::new);
        System.out.println(sum);

        System.out.println(reduce);

        List<String> inst = Arrays.asList("guna","aunc","hunb");

        inst.stream().sorted(Comparator.comparing(e->e.charAt(e.length()-1))).toList().forEach(System.out::println);

        int second = inli.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).toList().getFirst();
        System.out.println(second);

        //studs.sort(com);

    //  Comparable compare using class inside Override a method compare to
//      Collections.sort(studs);

        // Using stream for comparing object element based.
       studs.stream().sorted(Comparator.comparing(Student::getName))
        .toList().forEach(System.out::println);

    // Using stream for comparing object element particular character based.
        studs.stream().
                sorted((a,b)->Character.compare(a.name.charAt(a.name.length()-1),b.name.charAt(b.name.length()-1)))
                .toList().forEach(System.out::println);

        //studs.forEach(e->System.out.println("ID=" +e.id +" "+"NAME="+e.name));

        int[] nums={9,6,4,2,3,5,7,0,1};
        int n=nums.length;
        int temp=0;
        for(int i=1;i<n;i++){
            int flag=0;
            for(int j=0;j<n-1;j++){
                if(nums[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                temp = i;
            }
        }
        System.out.println(temp);
    }
}
