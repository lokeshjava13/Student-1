package com.array;

public class TestArrDemo1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 3 };
		int target = 6;

		System.out.println("Pairs with sum " + target + ":");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.print("(" + arr[i] + "," + arr[j] + ") ");
				}
			}
		}
	}
}