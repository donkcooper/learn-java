package com.sessions.conditions;

import com.sessions.model.Vehicle;

import java.util.Arrays;

/*
  Conditionsals
  if-else statement

  if() {
    // statement
  } else {
   // statement
  }

  Loops
  1) *exiting conditions, without exiting conditions - infinite loop, which will break memory
  2) loop incrementing logic
  3) initialization

  for() -> needs all these 3 conditions while initating
  foreach()

  // only needs exiting condition
  while loop - exit control loop
  do-while loop - entry control loop
 */

// to print odd number from 1 to 100
public class Condition {
    public static void main(String[] args) {
        for(int i = 1; i < 100; i++) {
            boolean remainder = i % 2 != 0;
            if(remainder) {
                System.out.print(i + ", ");
            }
        }
    }
}
