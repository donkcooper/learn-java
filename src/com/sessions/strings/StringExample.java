package com.sessions.strings;

import java.util.Arrays;

public class StringExample {

    //Native datatype
    // int
    // double
    // boolean
    // float
    // string

    public static void main(String[] args) {
        String s1 = "Hello"; // string defination of literal way - it is created java string pool memory
        String s2 = new String("hellO");

        System.out.println(s2.length());// length
        System.out.println(s2.toLowerCase()); // in lowercase
        System.out.println(s2.trim());// trims the space in both ends
        System.out.println(s2.replaceAll("l","i"));// all occurences
        System.out.println(s2.replace("l", "u"));//only first occurence
        System.out.println(s2 + "World");// concatenation two string - Hello World
        System.out.println(s2.concat("World"));// concatenation two string - Hello World
        System.out.println(s2.charAt(1));// print the charater at that index
        System.out.println(s2.indexOf("o"));// print the index value of that character

        // String comporison
        System.out.println("s1 == s2" + s1 == s2);
        System.out.println("s1.equals(s2) " + s1.equals(s2));
        System.out.println("s1.equalsIgnoreCase(s2) " + s1.equalsIgnoreCase(s2));

        String s3 = new String("good morning! How are you doing today.");
        //Expression
        System.out.println(s3.split(" "));

        StringBuilder sb = new StringBuilder("Good");
        sb.append("Mrg");
        System.out.println(sb);

    }
}
