package com.shubham.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {
    private static Optional<Integer> limit(){
        List<Integer> list= Arrays.asList(1,2,3,4,6);
        return list.stream()
                .limit(5)
                .skip(2)
                .reduce(Integer::sum);
    }
    public static void main(String[] args) {
        System.out.println(limit().get());
    }
}
