package com.ns.dscoding.leetcode.maximum_subarray_kadanes_algorithm;

public class MaximumSubarray {

	public static int maxSubArray(int[] nums) {
		
		int local_max = 0, global_max = Integer.MIN_VALUE;
		
		for (int i = 0; i < nums.length - 1; i++) {
			local_max = Math.max(nums[i], nums[i] + local_max);
			if (local_max > global_max) {
				global_max = local_max;
			}
		}
		return global_max;
	}

	public static void main(String[] args) {
		int[] nums = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(maxSubArray(nums));
	}

}
