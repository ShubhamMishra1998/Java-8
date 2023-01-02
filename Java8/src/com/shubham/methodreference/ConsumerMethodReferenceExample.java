package com.shubham.methodreference;

import com.shubham.data.Student;
import com.shubham.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {
    static Consumer<Student> consumer=(System.out::println);
    static Consumer<Student> consumer1=Student::printListOfActivities;
    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(consumer);
        StudentDataBase.getAllStudents().forEach(consumer1);
    }
}
