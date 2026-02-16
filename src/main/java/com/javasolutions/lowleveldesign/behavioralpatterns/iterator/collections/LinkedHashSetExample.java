package com.javasolutions.lowleveldesign.behavioralpatterns.iterator.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

// Java Collections Usage Example
public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<Integer> intSet = new LinkedHashSet<>();
        intSet.add(2);
        intSet.add(77);
        intSet.add(82);
        intSet.add(63);
        intSet.add(5);

        // Common to all Collection Classes
        Iterator<Integer> iterable = intSet.iterator();
        while (iterable.hasNext()) {
            int value = iterable.next();
            System.out.println(value);
        }
    }
}