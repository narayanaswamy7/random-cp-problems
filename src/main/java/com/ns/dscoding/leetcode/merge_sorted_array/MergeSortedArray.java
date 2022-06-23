package com.ns.dscoding.leetcode.merge_sorted_array;

import java.util.Arrays;

public class MergeSortedArray {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] res = new int[m+n];
		
		for (int i = 0; i < m; i++) {
			res[i] = nums1[i];
		}
		
		for (int j = 0; j < n; j++) {
			res[m+j] = nums2[j];
		}
		
		Arrays.sort(res);
		
		for(int i = 0; i < m+n; i++) {
			System.out.print(res[i] + " ");
		}
		
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		int[] nums1 = new int[] {1,2,3};
		int[] nums2 = new int[] {2,5,6};
		
		merge(nums1, 3, nums2, 3);
		
	}

}
