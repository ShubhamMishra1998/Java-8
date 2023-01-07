package com.shubham.streams;

import com.shubham.data.Student;
import com.shubham.data.StudentDataBase;

public class StreamMapReduceExample {
    private static int getNotebooksCount(){
       return StudentDataBase.getAllStudents().stream()
               .filter(s->s.getGradeLevel()>=3)
                .map(Student::getNotebooks)
                .reduce(0, Integer::sum);
    }
    public static void main(String[] args) {
        System.out.println(getNotebooksCount());
    }
}
