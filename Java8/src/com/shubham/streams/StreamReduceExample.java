package com.shubham.streams;
import com.shubham.data.Student;
import com.shubham.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static int getMultiplication(List<Integer> list){
       return list.stream()
                .reduce(1,(a,b)->a*b);
    }

    public static Optional<Student> getHighestGpa(){

       return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2)->{
                    if(s1.getGpa()>s2.getGpa()){
                        return s1;
                    }else{
                        return s2;
                    }
                });
    }

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,3,2,4);
        System.out.println(getMultiplication(list));
        System.out.println(getHighestGpa());
    }
}
