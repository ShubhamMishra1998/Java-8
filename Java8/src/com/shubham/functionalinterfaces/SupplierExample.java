package com.shubham.functionalinterfaces;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> supplier=()->"abc".toUpperCase();

        System.out.println(supplier.get());
    }
}
