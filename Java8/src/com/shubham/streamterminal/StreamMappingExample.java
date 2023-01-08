package com.shubham.streamterminal;

import com.shubham.data.Student;
import com.shubham.data.StudentDataBase;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class StreamMappingExample {

    private static void mappingExample(){
        System.out.println(StudentDataBase.getAllStudents().stream()
                .collect(mapping(Student::getName,toList())));
    }

    public static void main(String[] args) {
       mappingExample();
    }
}
