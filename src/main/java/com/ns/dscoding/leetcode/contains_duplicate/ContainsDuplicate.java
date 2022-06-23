package com.ns.dscoding.leetcode.contains_duplicate;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

	public static boolean containsDuplicate(int[] nums) {
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (countMap.containsKey(nums[i])) {
				return true;
			} else {
				countMap.put(nums[i], 1);
			}
		}
		return false;
	}

}
