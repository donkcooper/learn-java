package com.sessions.collections.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> naturalNumbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            naturalNumbers.add(i);
        }

        // traditional way to sum of natural numbers
        int sum = 0;
        for (int num: naturalNumbers) {
            sum += num;
        }
        System.out.println("Sum of number tradtional way: " + sum);

        // via streams
        System.out.println("Sum of number via streams: "
                + naturalNumbers.stream().mapToInt(Integer::intValue).sum());

        Map<String, List<Integer>> mapOfInteger = new HashMap<>();
        mapOfInteger.put("nat_num", naturalNumbers);

        // initate stream -> intermediate operations -> terminal operation -->> stop

        // initate stream -> intermediate operations -> collector to be returned --> loop

        // traditional way
        List<Integer> evenNaturalNumber = new ArrayList<>();
        for (int num: naturalNumbers) {
            if(num % 2 == 0) {
                evenNaturalNumber.add(num);
            }
        }
        System.out.println("Even numbers list: " + evenNaturalNumber.size());

        //streams way
        System.out.println("Even numbers list in streams way: " + naturalNumbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList())
                .size());

        System.out.println("Sum of even numbers list in streams way: " + naturalNumbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList())
                .stream().mapToInt(Integer::intValue)
                .sum());

    }
}
