package com.ns.dscoding.leetcode.minimum_size_subarray_sum;

public class MinimumSizeSubarraySum {

	public static int minSubArrayLen1(int target, int[] nums) {
		
		int ans = Integer.MAX_VALUE, n = nums.length;
		
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += nums[k];
				} // k loop
				if (sum >= target) {
					ans = Math.min(ans, j - i + 1);
					break;
				}
			} //j loop
		} // i loop
		return (ans != Integer.MAX_VALUE) ? ans : 0;
	}

	public static void main(String[] args) {
		
		int[] nums = new int[] {2, 3, 1, 2, 4, 3};
		int target = 5;
		
		System.out.println(minSubArrayLen1(target, nums));
		
	}

}
