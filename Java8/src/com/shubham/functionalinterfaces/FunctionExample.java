package com.shubham.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {
    static Function<String,String> f1=(a)->a.toUpperCase();
    static Function<String,String> f2=(a)->a.toUpperCase().concat("default");
    public static void main(String[] args) {
        System.out.println(f1.apply("java8"));
        System.out.println(f1.andThen(f2).apply("Java8"));
        System.out.println(f1.compose(f2).apply("Java8"));
    }
}
