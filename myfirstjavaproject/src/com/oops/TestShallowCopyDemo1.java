package com.oops;
import java.util.Arrays;
public class TestShallowCopyDemo1 {



	
	    public static void main(String[] args) {
	        int[] arr = {2, -3, 5, -1, 4, -6, -2, 8};
	        
	        int[] result = new int[arr.length];
	        int index = 0;

	        // First add negatives
	        for (int num : arr) {
	            if (num < 0) {
	                result[index++] = num;
	            }
	        }
	        // Then add positives
	        for (int num : arr) {
	            if (num >= 0) {
	                result[index++] = num;
	            }
	        }
	        
	        System.out.println("Result: " + Arrays.toString(result));
	    
	    }
	}

	