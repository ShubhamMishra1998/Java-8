package com.shubham.functionalinterfaces;

import com.shubham.data.Student;
import com.shubham.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {
     static Function<List<Student>,Map<String,Double>> studentMapFunction=(student -> {
         Map<String,Double> m1=new HashMap<>();
         student.forEach(student1 -> {
             m1.put(student1.getName(),student1.getGpa());
         });
         return m1;
     });
    public static void main(String[] args) {
        System.out.println(studentMapFunction.apply(StudentDataBase.getAllStudents()));
    }
}
