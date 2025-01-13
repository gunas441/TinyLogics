package Hashmaps;

import java.util.*;
import java.util.stream.Collectors;


public class HashMaps {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
            student.add(new Student(1,"Maths",80));
            student.add(new Student(2,"Physics",70));
            student.add(new Student(3,"Geography",90));
//            System.out.println(student);


    }
}

class Student {
    Integer id;
    String subjectName;
    Integer scoredMarks;

    public Student(Integer id, String subjectName, Integer scoredMarks) {
        this.id = id;
        this.subjectName = subjectName;
        this.scoredMarks = scoredMarks;
    }

    @Override
    public String toString() {
        return "Student[" +
                "id=" + id +
                ", subjectName='" + subjectName + '\'' +
                ", scoredMarks=" + scoredMarks +
                ']';
    }
}