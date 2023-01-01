package com.shubham.functionalinterfaces;

import com.shubham.data.Student;
import com.shubham.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>>  biFunction=((students, studentPredicate) -> {
        Map<String,Double> m1=new HashMap<>();
        students.forEach(student -> {
            if(studentPredicate.test(student)){
                m1.put(student.getName(),student.getGpa());
            }
        });
        return m1;
    });
    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),student -> student.getGpa()>3));
    }
}
