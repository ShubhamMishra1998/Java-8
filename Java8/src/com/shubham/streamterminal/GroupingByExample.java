package com.shubham.streamterminal;

import com.shubham.data.Student;
import com.shubham.data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class GroupingByExample {
    private static void groupingBy1(){
      Map<String, List<Student>> stringListMap=StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGender));
        System.out.println(stringListMap);
    }

    private static void customizedGrouping(){
        Map<String, List<Student>> stringListMap=StudentDataBase.getAllStudents().stream()
                .collect(groupingBy((student -> student.getGpa()>=3.8?"Good":"Average")));
        System.out.println(stringListMap);
    }

    private static void groupingBy2(){
       Map<Integer,Map<String,List<Student>>> studentMap= StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(student -> student.getGpa()>=3.8?"Good":"Average")));

        System.out.println(studentMap);
    }

    private static void groupingBy3(){
        Map<Integer,Integer> studentMap= StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        summingInt(Student::getNotebooks)));

        System.out.println(studentMap);
    }

    private static void threeArgumentGroupingBy(){
        LinkedHashMap<String, Set<Student>>stringSetLinkedHashMap=StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new,toSet()));
        System.out.println(stringSetLinkedHashMap);
    }

    private static void maxByGrouping(){
       Map<String,Optional<Student>> studentMap=StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName,maxBy(Comparator.comparingInt(Student::getGradeLevel))));
        System.out.println(studentMap);
    }



    public static void main(String[] args) {
//         groupingBy1();
//        customizedGrouping();
//        groupingBy2();
//        groupingBy3();
//        threeArgumentGroupingBy();
        maxByGrouping();
    }
}
