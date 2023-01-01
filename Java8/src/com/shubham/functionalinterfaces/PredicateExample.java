package com.shubham.functionalinterfaces;
import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> p1=(x)->x%2==0;
    static Predicate<Integer> p2=x->x%5==0;

    public static void predicateAnd(){
        System.out.println("Predicate And "+p1.and(p2).test(10));
        System.out.println("Predicate And "+p1.and(p2).test(5));
    }

    public static void predicateOr(){
        System.out.println("Predicate Or "+p1.or(p2).test(10));
        System.out.println("Predicate Or "+p1.or(p2).test(5));
    }

    public static void predicateNegate(){
        System.out.println("Predicate Negate "+p1.or(p2).test(10));
        System.out.println("Predicate Negate "+p1.or(p2).negate().test(5));
    }

    public static void main(String[] args) {
        System.out.println(p1.test(4));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
