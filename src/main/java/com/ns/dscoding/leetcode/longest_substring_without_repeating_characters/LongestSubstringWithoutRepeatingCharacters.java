package com.ns.dscoding.leetcode.longest_substring_without_repeating_characters;

public class LongestSubstringWithoutRepeatingCharacters {

	public static int lengthOfLongestSubstring(String s) {
		int res = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				if (checkRepetition(s, i, j)) {
					res = Math.max(res, j - i + 1);
				}
			}
		}
		return res;
	}
	
	public static boolean checkRepetition(String s, int start, int end) {
		int[] chars = new int[128];
		
		for (int i = start; i <= end; i++) {
			char c = s.charAt(i);
			chars[c]++;
			if (chars[c] > 1) {
				return false;
			}
		}
		return true;
	}

}
