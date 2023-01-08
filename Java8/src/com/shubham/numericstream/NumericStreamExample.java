package com.shubham.numericstream;

import java.util.stream.IntStream;

public class NumericStreamExample {

    private static int sumOfNNumbers(){
        return IntStream.rangeClosed(1,6).sum();
    }

    public static void main(String[] args) {
        System.out.println(sumOfNNumbers());
    }
}
