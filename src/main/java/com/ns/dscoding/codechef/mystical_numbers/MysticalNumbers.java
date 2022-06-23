package com.ns.dscoding.codechef.mystical_numbers;

import java.util.Arrays;
import java.util.Scanner;

public class MysticalNumbers {
	
	public static int findMysticalNumbers(int[] arr, int X) {
		
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if ((arr[i] ^ X) > (arr[i] & X)) {
				count++;
			}
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while(T-- > 0) {
			int N = scanner.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = scanner.nextInt();
			}
			int Q = scanner.nextInt();
			while (Q-- > 0) {
				int L = scanner.nextInt();
				int R = scanner.nextInt();
				int X = scanner.nextInt();
				
				int[] arr1 = Arrays.copyOfRange(arr, L-1, R);

				for(int i = 0; i < arr1.length; i++) {
					System.out.print(arr1[i] + " ");
				}

				System.out.println(findMysticalNumbers(arr1, X));
			}
		}
		scanner.close();
		
	}

}
