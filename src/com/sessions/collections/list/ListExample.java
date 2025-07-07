package com.sessions.collections.list;

import com.sessions.model.Vehicle;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0) {
                list.add(i); // adding items
            }
        }
        System.out.println(list);
        System.out.println(list.set(2, 16)); // updating
        //System.out.println(list.remove(1));// removing items
        System.out.println(list);
        //System.out.println(Arrays.asList(list));

        List<String> list2 = new LinkedList<>();//        
               
    }
}
