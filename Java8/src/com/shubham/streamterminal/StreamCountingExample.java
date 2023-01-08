package com.shubham.streamterminal;

import com.shubham.data.StudentDataBase;

import static java.util.stream.Collectors.counting;

public class StreamCountingExample {
    private static long count(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(s->s.getGpa()>=3.9)
                .collect(counting());
    }
    public static void main(String[] args) {
        System.out.println(count());
    }
}
