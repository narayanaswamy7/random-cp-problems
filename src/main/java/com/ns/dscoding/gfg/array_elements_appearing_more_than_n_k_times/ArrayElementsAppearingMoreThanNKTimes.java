package com.ns.dscoding.gfg.array_elements_appearing_more_than_n_k_times;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayElementsAppearingMoreThanNKTimes {
	
	public static void printElementsNKPlusTimes(int[] arr, int n, int k) {
		
		Map<Integer, Integer> countMap = new LinkedHashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if (countMap.containsKey(arr[i])) {
				countMap.put(arr[i], countMap.get(arr[i]) + 1);
			} else {
				countMap.put(arr[i], 1);
			}
		}
		
		for (Entry<Integer, Integer> e : countMap.entrySet()) {
			if (e.getValue() > (n/k)) {
				System.out.print(e.getKey() + " ");
			}
		}
		
	}
	
	public static void printElementsNKPlusTimes1(int[] arr, int n, int k) {
		
		for (int i = 0; i < n; i++) {
			
			Arrays.sort(arr);
			
			int count = 1;
			
			while ((i + 1) < n && arr[i]==arr[i+1]) {
				count++;
				i++;
			}
			
			if (count > n/k) {
				System.out.print(arr[i] + " ");
			}
			
		}
		
	}

}
