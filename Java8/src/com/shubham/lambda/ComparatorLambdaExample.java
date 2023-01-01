package com.shubham.lambda;

import java.util.Comparator;

public class ComparatorLambdaExample{
    public static void main(String[] args) {
       Comparator<Integer> comparator=new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               return o1.compareTo(o2);
           }
       };

        System.out.println("using inner class "+comparator.compare(2,3));

//        Using lambda

        Comparator<Integer> comparator1=(Integer x,Integer y)->x.compareTo(y);
        System.out.println("using lambda "+comparator1.compare(2,3));

        Comparator<Integer> comparator2=(x,y)->x.compareTo(y);
        System.out.println("using lambda "+comparator2.compare(2,3));

        Comparator<Integer> comparator3=Integer::compare;

        System.out.println("using lambda "+comparator3.compare(2,3));

    }
}
