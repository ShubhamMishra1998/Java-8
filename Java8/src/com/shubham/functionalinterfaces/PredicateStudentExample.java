package com.shubham.functionalinterfaces;

import com.shubham.data.Student;
import com.shubham.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample{
   static Predicate<Student> p1=student->student.getGradeLevel()>=3;
   static Predicate<Student> p2=student->student.getGpa()>=3.2;
   public static void filterStudentByGrade(){
       List<Student> studentList= StudentDataBase.getAllStudents();
       studentList.forEach((student)->{
           if(p1.test(student)){
               System.out.println(student);
           }
       });
   }

    public static void filterStudent(){
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach((student)->{
            if(p1.and(p2).test(student)){
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentByGrade();
        filterStudent();
    }
}
