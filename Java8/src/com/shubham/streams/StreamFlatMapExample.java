package com.shubham.streams;

import com.shubham.data.Student;
import com.shubham.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

public class StreamFlatMapExample {
    public static List<String> getActivities(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();
    }
    public static long getActivitiesCount(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
    }
    public static void main(String[] args) {
        System.out.println(getActivities());
        System.out.println(getActivitiesCount());
    }
}
