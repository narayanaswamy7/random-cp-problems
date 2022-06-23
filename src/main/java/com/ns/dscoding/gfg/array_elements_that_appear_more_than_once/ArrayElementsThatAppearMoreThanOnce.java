package com.ns.dscoding.gfg.array_elements_that_appear_more_than_once;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayElementsThatAppearMoreThanOnce {

	public static void findArrayElementsRepeating(int[] arr) {

		Map<Integer, Integer> countMap = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (countMap.containsKey(arr[i])) {
				countMap.put(arr[i], countMap.get(arr[i]) + 1);
			} else {
				countMap.put(arr[i], 1);
			}
		}

		for (Entry<Integer, Integer> e : countMap.entrySet()) {
			if (e.getValue() > 1) {
				System.out.print(e.getKey() + " ");
			}
		}

	}

}
