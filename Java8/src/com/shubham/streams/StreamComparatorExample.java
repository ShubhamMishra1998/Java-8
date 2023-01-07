package com.shubham.streams;

import com.shubham.data.Student;
import com.shubham.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

public class StreamComparatorExample {
    public static List<Student> getStudentSortedByName(){
       return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName).reversed())
                .toList();
    }
    public static void main(String[] args) {
        System.out.println(getStudentSortedByName());
    }
}

