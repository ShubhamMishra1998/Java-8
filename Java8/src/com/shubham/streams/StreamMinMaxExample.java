package com.shubham.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {
    public static Optional<Integer> getMax(){
        List<Integer> list= Arrays.asList(1,4,3,5,6,9,2,10,4);
       return list.stream()
                .reduce(Integer::max);
    }
    public static void main(String[] args) {
        System.out.println(getMax());
    }
}
