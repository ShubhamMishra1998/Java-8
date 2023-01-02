package com.shubham.methodreference;

import com.shubham.data.Student;
import com.shubham.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {
    static Predicate<Student> p1= RefactorMethodReferenceExample::greaterOrEqual;

    public static boolean greaterOrEqual(Student student){
        return student.getGradeLevel()>=3;
    }

    public static void main(String[] args) {
        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
    }
}
