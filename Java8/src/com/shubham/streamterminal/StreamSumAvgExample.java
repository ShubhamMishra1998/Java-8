package com.shubham.streamterminal;

import com.shubham.data.Student;
import com.shubham.data.StudentDataBase;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamSumAvgExample {
    private static int summingExample(){
       return StudentDataBase.getAllStudents().stream()
                .collect(summingInt(Student::getNotebooks));
    }
    private static double averagingExample(){
        return StudentDataBase.getAllStudents().stream()
                .collect(averagingInt(Student::getNotebooks));
    }
    public static void main(String[] args) {
        System.out.println(summingExample());
        System.out.println(averagingExample());
    }
}
