package com.shubham.streams;

import com.shubham.data.Student;
import com.shubham.data.StudentDataBase;

import java.util.List;

public class StreamMapExample {

    public static List<String> namesList(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .toList();
    }

    public static void main(String[] args) {
        System.out.println(namesList());
    }
}
