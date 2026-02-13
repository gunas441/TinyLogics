package Interview;

import java.util.*;
import java.util.stream.Collectors;

public class EmpMain {
    public static void main(String[] args) {
        List<Emp> employees = Arrays.asList(
                new Emp("Raja", 9000, 1, "Bengaluru", "HR","Male"),
                new Emp("Nandu", 30000, 2, "Chennai", "Testing","Male"),
                new Emp("Helen", 18000, 3, "Bengaluru", "Accounts","Female"),
                new Emp("Rohini", 8000, 4, "Chennai","Accounts","Female"),
                new Emp("Rakesh", 18000,5, "Cochin", "HR","Male"),
                new Emp("Harini", 12000, 6, "Cochin", "Accounts","Female"),
                new Emp("Susheela",22000,7, "Bengaluru","Testing","Female"),
                new Emp("Nisha",7000, 8, "Chennai", "Accounts","Female"));

        // 1, Find all employees from a specific city and get the count

        Map<String, Long> empCityCount = employees.stream()
                .collect(Collectors.groupingBy(Emp::getCity, Collectors.counting()));
        System.out.println(empCityCount);

        // 2. Find all employees where salary is greater than a particular value
        Map<String, Integer> empSalary = employees.stream().filter(e -> e.getSalary() > 10000)
                .collect(Collectors.toMap(Emp::getName, Emp::getSalary));
        System.out.println(empSalary);

        // 3. Print all the employee names only in upper case and alphabetical order
        employees.stream().map(e->e.getName().toUpperCase()).sorted()
                .forEach(System.out::println);

        // 4. Get the first employee where dept is "HR" and if not available throw exception
        Emp emp = employees.stream().filter(e->e.getDept().equals("HR"))
                .findFirst().orElseThrow(()->new NoEmployeeFound("No employee in this dept!"));
        System.out.println(emp);

        // 5. Get the total salary of all employees in a specific department
        Map<String, Integer> totalSalary = employees.stream()
                .collect(Collectors.groupingBy(Emp::getDept, Collectors.summingInt(Emp::getSalary)));
        System.out.println(totalSalary);

        // 6. Check if all employees have a salary greater than a specific Value
        employees.stream().filter(e->e.getSalary()>10000).toList().forEach(System.out::println);

        // 7. Get the sum of salaries of all employees and the average salary
        int sum = employees.stream().mapToInt(Emp::getSalary).sum();
        System.out.println(sum);
        double asDouble = employees.stream().mapToInt(Emp::getSalary).average().getAsDouble();
        System.out.println(asDouble);

        // 9. Print the employee details from highest to lowest salary
        List<Emp> salaryHighToLow = employees.stream()
                .sorted(Comparator.comparingInt(Emp::getSalary).reversed()).toList();
        System.out.println(salaryHighToLow);

        // 11. Get the employees with the second-highest salary
        Emp secondHighest = employees.stream().sorted(Comparator.comparingInt(Emp::getSalary).reversed())
                .skip(1).findFirst().orElseThrow(() -> new NoEmployeeFound("Employee Not Found"));
        System.out.println(secondHighest);

        // 13. Get the employee with the longest name
        String empLongName = employees.stream().map(Emp::getName).max(Comparator.comparingInt(String::length)).get();
        System.out.println(empLongName);

        // 14.Group all employees by department
        Map<String, List<Emp>> groupList = employees.stream().collect(Collectors.groupingBy(Emp::getDept, Collectors.toList()));
        System.out.println(groupList);

        // 15.Get the count of employees by department
        Map<String, Long> groupListCount = employees.stream().collect(Collectors.groupingBy(Emp::getDept, Collectors.counting()));
        System.out.println(groupListCount);

        // 16.Get the sum of salaries of all employees by department
        Map<String, Integer> sumOfDept = employees.stream().collect(Collectors.groupingBy(Emp::getDept, Collectors.summingInt(Emp::getSalary)));
        System.out.println(sumOfDept);

        // 17.Get the average salaries of all employees per department
        Map<String, Double> avgOfDept = employees.stream().collect(Collectors.groupingBy(Emp::getDept, Collectors.averagingDouble(Emp::getSalary)));
        System.out.println(avgOfDept);

        // 18.Check if all employees belong to a specific department
        boolean accounts = employees.stream().anyMatch(e -> e.getDept().equals("Accounts"));
        System.out.println(accounts);

        // 19.List all employees grouping by cities but belong to the same department
        Map<String, List<Emp>> collect = employees.stream().collect(Collectors.groupingBy(Emp::getDept));
        collect.forEach((key,value)->{
            System.out.println("Department :"+key);
            value.stream().collect(Collectors.groupingBy(Emp::getCity)).forEach((city,em)->{
                em.forEach(e-> System.out.println("Employee :"+e.getName()));
                System.out.println("City :"+city);
            });
        });

        // 20.Find the department with the highest average salary
        double max  = employees.stream().collect(Collectors.groupingBy(Emp::getDept, Collectors.averagingDouble(Emp::getSalary)))
                .entrySet().stream().max(Comparator.comparingDouble(Map.Entry::getValue)).get().getValue();
        System.out.println(max);

        String str="the3 this1 is2 book4";
        String[] arr=str.split(" ");
        Arrays.stream(arr).sorted(Comparator.comparingInt(a -> a.charAt(a.length()-1)))
                .map(e->e.substring(0,e.length()-1)).toList().forEach(e->{
                    System.out.print(e+" ");
                });
    }
}
