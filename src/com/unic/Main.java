//  Java program to find unic element
package com.unic;

import java.util.HashMap;
import java.util.Map;

// Main class
public class Main {

    // Method findUnicNumber to find number that is unic
    public static int findUnicNumber(int[] arr) {

        // Using HashMap to store single elements
        Map<Integer, Integer> map = new HashMap<>();

        // First sum of all single elements
        int sum = 0;
        // Second sum of all elements
        int sum1 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                // Adding elements only 1 time without duplicates
                sum += arr[i];
                map.put(arr[i], 1);
            }
            // Adding all elements of array
             sum1 += arr[i];
        }

        // Multiplying to 2 sum of single elements and subtract sum of all elements
        int unicNumber = 2 * sum - sum1;
        return unicNumber;
    }

    // Method main to run java program
    public static void main (String [] args){

        int [] array = {3, 5, 4, 5, 6, 6, 8, 3, 4};
        System.out.println(findUnicNumber(array));
    }
}