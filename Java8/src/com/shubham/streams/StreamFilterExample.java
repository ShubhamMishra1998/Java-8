package com.shubham.streams;

import com.shubham.data.Student;
import com.shubham.data.StudentDataBase;

import java.util.List;

public class StreamFilterExample {
    public static List<Student> getStudentFilter(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGradeLevel()>3.4)
                .toList();
    }
    public static void main(String[] args) {
        System.out.println(getStudentFilter());
    }
}
