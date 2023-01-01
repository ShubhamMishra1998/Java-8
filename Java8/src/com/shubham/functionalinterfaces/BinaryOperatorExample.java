package com.shubham.functionalinterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator=(a,b)->a.concat(b);
        System.out.println(binaryOperator.apply("abc","def"));
    }
}
