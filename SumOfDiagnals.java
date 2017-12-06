package com.dhruval.arrays;
/*
 * @Author : Dhruval Variya Email : dhruvalv@gmail.com
 * Given a square matrix of size N x N, 
 * Calculate the sum of its diagonals.
 * 
 */
public class SumOfDiagnals {
	static int arr[][] = { { 1, 2 }, { 3, 4 } };
	// static int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	// static int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 2, 3, 4 }, {
	// 5, 6, 7, 8 } };

	public static void main(String[] args) {
		System.out.println("Sum of Diagnals : " + sumOfDiag(arr));
	}

	private static int sumOfDiag(int[][] arr2) {
		int N = arr2.length;
		int diag1 = 0, diag2 = 0;

		int j = 0;
		for (int i = 0; i < N; i++) {
			diag1 = diag1 + arr2[i][j];
			j++;
		}
		
		j = N - 1;
		for (int i = 0; i < N; i++) {
			diag2 = diag2 + arr2[i][j];
			j--;
		}
		return diag1 + diag2;
	}
}
