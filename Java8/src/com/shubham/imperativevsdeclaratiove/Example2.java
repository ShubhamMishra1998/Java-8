package com.shubham.imperativevsdeclaratiove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
//        Remove duplicates from list using imperative
        List<Integer> list1= Arrays.asList(1,2,3,3,4,5,5,6,7,8,9,9,10);
        List<Integer> ans1=new ArrayList<>();
        for(int x:list1){
            if(!ans1.contains(x)){
                ans1.add(x);
            }
        }
        System.out.println("Removing duplicates from list using imperative" + ans1);

        // Remove duplicates from list using declarative

        List<Integer> ans2=list1
                .stream()
                .distinct()
                .toList();
        System.out.println("Removing duplicates from list using declarative" + ans2);


    }
}
