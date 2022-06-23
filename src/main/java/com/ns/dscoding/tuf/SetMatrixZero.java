package com.ns.dscoding.tuf;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZero {

	public static int[][] setMatrixZero1(int[][] arr) {

		int rows = arr.length, cols = arr[0].length;
		int[][] resArr = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (arr[i][j] == 0) {
					resArr[i][j] = 0;
				} else {
					resArr[i][j] = arr[i][j];
				}
			}
		}

		printMatrixElements(resArr);

		return null;
	}

	public static void printMatrixElements(int[][] arr) {
		int rows = arr.length, cols = arr[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

	public static int[][] setMatrixZero2(int[][] arr) {

		int nRows = arr.length, nCols = arr[0].length;

		Set<Integer> rows = new HashSet<Integer>();
		Set<Integer> cols = new HashSet<Integer>();

		for (int i = 0; i < nRows; i++) {
			for (int j = 0; j < nCols; j++) {
				if (arr[i][j] == 0) {
					rows.add(i);
					cols.add(j);
				}
			}
		}

		for (int i = 0; i < nRows; i++) {
			for (int j = 0; j < nCols; j++) {
				if (rows.contains(i) || cols.contains(j)) {
					arr[i][j] = 0;
				}
			}
		}

		printMatrixElements(arr);

		return null;
	}

	public static void main(String[] args) {

		int[][] arr = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		printMatrixElements(arr);
		setMatrixZero2(arr);

	}

}
