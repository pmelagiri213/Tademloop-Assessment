package com.Jspider.simpleProjectApp;

import java.util.HashMap;

public class MultipleOfElements {
    public static HashMap<Integer, Integer> findAllMultiples(int[] arr1) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i=0; i<arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] % arr[i] == 0) {
                    count++;
                }
            }
            hm.put(arr[i], count);
        }
        return hm;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        
        HashMap<Integer, Integer> multiplesOfNumbers = findAllMultiples(arr1);
        
        System.out.print("{");
        for(Integer num: multiplesOfNumbers.keySet()) {
        	Integer multipleCount = multiplesOfNumbers.get(num);
        	System.out.print("["+num+" : "+multipleCount+"]");
        }
        System.out.println("}");
    }
}