package com.ns.dscoding.leetcode.two_sum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
	
	public static int[] twoSum1(int[] nums, int target) {
		Map<Integer, Integer> res = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (res.containsKey(target - nums[i])) {
            	return new int[] {res.get(target - nums[i]), i};
            }
            res.put(nums[i], i);
        }
        return null;
    }

}
