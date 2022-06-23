package com.ns.dscoding.leetcode.rotate_array;

public class RotateArray {

	public static void rotate(int[] nums, int k) {
		
		int temp, previous;
		for (int i = 0; i < k; i++) {
			previous = nums[nums.length - 1];
			for (int j = 0;  j < nums.length; j++) {
				temp = nums[j];
				nums[j] = previous;
				previous = temp;
			}
			printArray(nums);
		}
		
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7};
		
		rotate(arr, 3);
	}

}
