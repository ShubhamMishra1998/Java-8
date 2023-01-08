package com.shubham.streamterminal;

import com.shubham.data.Student;
import com.shubham.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;

public class StreamsPartioningByExample {
    private static void partitioningBy1(){
        Predicate<Student> studentPredicate=(s)->s.getGpa()>=3.8;
        Map<Boolean, List<Student>> booleanListMap=StudentDataBase.getAllStudents().stream()
                .collect(partitioningBy(studentPredicate));
        System.out.println(booleanListMap);
    }
    public static void main(String[] args) {
     partitioningBy1();
    }
}
