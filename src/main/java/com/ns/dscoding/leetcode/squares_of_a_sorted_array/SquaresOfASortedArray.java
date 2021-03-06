package com.ns.dscoding.leetcode.squares_of_a_sorted_array;

import java.util.Arrays;

public class SquaresOfASortedArray {

	public static int[] sortedSquares(int[] nums) {
		int[] res = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			res[i] = nums[i] * nums[i];
		}
		Arrays.sort(res);
		
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[] {-4,-1,0,3,10};
		System.out.println(sortedSquares(nums));
	}

}
