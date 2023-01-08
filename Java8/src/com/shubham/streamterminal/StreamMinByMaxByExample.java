package com.shubham.streamterminal;

import com.shubham.data.Student;
import com.shubham.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.minBy;

public class StreamMinByMaxByExample {
    private static Optional<Student> minByExample(){
       return StudentDataBase.getAllStudents().stream()
                .collect(minBy(Comparator.comparing(Student::getName)));
    }
    public static void main(String[] args) {
        System.out.println(minByExample());
    }
}
