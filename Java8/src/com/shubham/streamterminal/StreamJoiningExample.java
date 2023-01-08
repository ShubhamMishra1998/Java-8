package com.shubham.streamterminal;

import com.shubham.data.Student;
import com.shubham.data.StudentDataBase;
import static java.util.stream.Collectors.joining;

public class StreamJoiningExample {
    private static String joining1(){
       return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(joining());
    }

    private static String joining2(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(joining("-"));
    }

    private static String joining3(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(joining("-","(",")"));
    }
    public static void main(String[] args) {
        System.out.println(joining1());
        System.out.println(joining2());
        System.out.println(joining3());
    }
}
