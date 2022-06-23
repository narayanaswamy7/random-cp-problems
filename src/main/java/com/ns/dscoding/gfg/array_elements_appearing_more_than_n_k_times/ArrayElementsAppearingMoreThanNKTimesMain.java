package com.ns.dscoding.gfg.array_elements_appearing_more_than_n_k_times;

public class ArrayElementsAppearingMoreThanNKTimesMain {
	
	public static void main(String[] args) {
	
		int[] arr = { 3, 4, 4, 5, 5, 5, 5 };
		int n = arr.length;
		int k = 4;
		
		ArrayElementsAppearingMoreThanNKTimes.printElementsNKPlusTimes(arr, n, k);
		System.out.println();
		ArrayElementsAppearingMoreThanNKTimes.printElementsNKPlusTimes1(arr, n, k);
		
	}

}
