package com.sessions.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// set will be unique, a collections of set
// it is not key value based

public class SetExample {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("stringset1");
        stringSet.add("stringset2");
        stringSet.add("stringset1");

        stringSet.remove("");

        System.out.println(stringSet);
    }
}
