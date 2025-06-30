package com.sessions.exception;

import java.util.Arrays;

public class ExceptionHandling {

    public static void main(String[] args) {

        int number[] = new int[5];
        for (int i = 0; i < number.length; i++) {
            try {
                if(i == 0) {
                    throw new Exception("Multiple by zero not allowed");
                }
                number[i] = 5 * i;
            } catch (Exception ex) {
                System.out.println("Exception at iteration " + i + " because of " + ex.getMessage());
                number[i] = -1;
            }
        }
        System.out.println(Arrays.toString(number));
    }// main method scope
}// class scope
