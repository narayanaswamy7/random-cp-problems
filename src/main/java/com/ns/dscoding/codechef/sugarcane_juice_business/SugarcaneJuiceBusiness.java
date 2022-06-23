package com.ns.dscoding.codechef.sugarcane_juice_business;

import java.util.Scanner;

public class SugarcaneJuiceBusiness {
	
	public static int getProfit(int number_of_glasses) {
		return (int) (number_of_glasses * 0.3 * 50);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		while (N-- > 0) {
			int numberOfGlasses = scanner.nextInt();
			System.out.println(getProfit(numberOfGlasses));
		}
		scanner.close();
	}
	
}
