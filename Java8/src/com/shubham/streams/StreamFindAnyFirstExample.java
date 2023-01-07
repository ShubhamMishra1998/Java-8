package com.shubham.streams;

import com.shubham.data.Student;
import com.shubham.data.StudentDataBase;

import java.util.Optional;

public class StreamFindAnyFirstExample {
    private static Optional<Student> findFirst(){
      return   StudentDataBase.getAllStudents().stream()
                .filter(e->e.getGradeLevel()>=3.9)
                .findFirst();
    }
    public static void main(String[] args) {
        System.out.println(findFirst());
    }
}
