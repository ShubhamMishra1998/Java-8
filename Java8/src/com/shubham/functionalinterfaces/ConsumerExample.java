package com.shubham.functionalinterfaces;

import com.shubham.data.Student;
import com.shubham.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> c= System.out::println;
    static Consumer<Student> c1=student-> System.out.print(student.getName());
    static Consumer<Student> c2=student-> System.out.println(student.getActivities());
    public static void printStudents(){
        System.out.println("_____printStudents________");
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach(c);
    }

    public static void printNameAndActivities(){
        System.out.println("_____printNameAndActivities________");
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach(c1.andThen(c2));
    }

    public static void printNameAndActivitiesUsingCondition(){
        System.out.println("_____printNameAndActivitiesUsingCondition________");
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach((student)->{
            if(student.getGradeLevel()>=3){
                c1.andThen(c2).accept(student);
            }
        });
    }

    public static void main(String[] args) {
        Consumer<String> consumer=(s)-> System.out.println(s.toUpperCase());
        consumer.accept("java8");
        printStudents();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
