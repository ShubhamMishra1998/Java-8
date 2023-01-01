package com.shubham.imperativevsdeclaratiove;

import java.util.stream.IntStream;

public class Example1 {
    public static void main(String[] args) {
//        Sum till 10 using imperative
        int sum=0;
        for(int i=0;i<=100;i++){
            sum+=i;
        }
        System.out.println("Sum till 100 is using imperative is :"+sum);
        //    Sum till 100 using declarative

        int sum1= IntStream.rangeClosed(0,100)
                .sum();

        System.out.println("Sum till 100 is using declarative is :"+sum1);



    }

}
