package com.sessions.arrays;

import com.sessions.model.Vehicle;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        String s1 = new String();
        String s2 = "string1";

        int number = 1;
        float number2 = 1.45f;
        double number3 = 1.78;

        // Array intializations
        String []sArray = new String[100];
        int []numArray = new int[5];
        float []flatArray = new float[12];
        double []doubleArray = new double[10];
        Vehicle []vehicles = new Vehicle[100];

        // writiing values to an array in bulk
        for (int i = 0; i < sArray.length; i++) {
           sArray[i] = "Assigned - " + i;
        }
        sArray[9] = "10th element"; // writing of an array element
        System.out.println("10th element of array " + sArray[9]); // reading of an array element

        // manual assignment
        numArray[0] = 1; // 1st element
        numArray[1] = 2; // 2nd element
        numArray[2] = 3;// 3rd element
        numArray[3] = 4;// 4th element
        numArray[4] = 5;// 5th element
        // numArray[5] = 5;// 6th element

        System.out.println(Arrays.toString(sArray));
        System.out.println(Arrays.toString(numArray));
    }
}
