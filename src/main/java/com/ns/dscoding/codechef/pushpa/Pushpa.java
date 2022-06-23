package com.ns.dscoding.codechef.pushpa;

import java.util.Arrays;
import java.util.Scanner;

public class Pushpa {
	
	public static int getMaxHeight(int[] arr) {
		Arrays.sort(arr);
		if (arr.length == 1) {
			return arr[0];
		} else {
			int count = 0;
			int max = 0;
			for (int i = arr.length - 1; i > 0; i--) {
				if (arr[i] == arr[i-1]) {
					count++;
				} else {
					if (max < arr[i] + count) {
						max = arr[i] + count;
					}
					count = 0;
				}
			}
			return max;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		while(N-- > 0) {
			int T = scanner.nextInt();
			int[] arr = new int[T];
			for(int i = 0; i < T; i++) {
				arr[i] = scanner.nextInt();
			}
			System.out.println(getMaxHeight(arr));
		}
		scanner.close();
	}

}
