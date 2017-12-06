package com.dhruval.arrays;

/*
 * @Author : Dhruval Variya Email : dhruvalv@gmail.com
 * Given a square matrix of size N x N, 
 * calculate the absolute difference between the sums of its diagonals.
 * 
 */
public class AbsDiffOfSumOfDiagnals {
	static int arr[][] = { { 11, 2, 4 }, { 4, 5, 6 }, { 10, 8, -12 } };

	public static void main(String[] args) {
		System.out.println("Abs Difference of Sum of Diagnals : " + sumOfDiag(arr));
	}

	private static int sumOfDiag(int[][] arr2) {
		int N = arr2.length;
		int sumDiag1 = 0, sumDiag2 = 0;

		int j = 0;
		for (int i = 0; i < N; i++) {
			sumDiag1 = sumDiag1 + arr2[i][j];
			j++;
		}

		j = N - 1;
		for (int i = 0; i < N; i++) {
			sumDiag2 = sumDiag2 + arr2[i][j];
			j--;
		}
		return Math.abs(sumDiag1 - sumDiag2);
	}
}
