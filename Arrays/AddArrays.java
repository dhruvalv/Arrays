package com.dhruval.arrays;

/*
 * @Author : Dhruval Variya Email : dhruvalv@gmail.com
 * 
 * Add Two Binary Arrays
 * 		101010
 * 	+	010101
 * ---------------
 * 	   0111111
 *  
 * Add Two Decimal Arrays 
 * 		143765
 *	+	780648
 * --------------- 
 *     0924413      
 */

public class AddArrays {
	public static void main(String[] args) {
		int a1[] = { 1, 0, 1, 0, 1, 0 };
		int b1[] = { 0, 1, 0, 1, 0, 1 };
		int c1[] = addBinary(a1, b1);

		System.out.println("Sum of two binary int arrays : ");
		for (int cc : c1) {
			System.out.print(cc + " ");
		}

		int a2[] = { 1, 4, 3, 7, 6, 5 };
		int b2[] = { 7, 8, 0, 6, 4, 8 };
		int c2[] = addDecimal(a2, b2);

		System.out.println("\nSum of two decimal int arrays : ");
		for (int cc : c2) {
			System.out.print(cc + " ");
		}

	}

	public static int[] addBinary(int a[], int b[]) {
		int len = a.length;
		int c[] = new int[len + 1];
		int carry = 0;
		for (int i = len - 1; i >= 0; i--) {
			c[i + 1] = (a[i] + b[i] + carry) % 2;
			carry = (a[i] + b[i] + carry) / 2;
		}
		return c;
	}

	public static int[] addDecimal(int a[], int b[]) {
		int len = a.length;
		int c[] = new int[len + 1];
		int carry = 0;
		for (int i = len - 1; i >= 0; i--) {
			c[i + 1] = (a[i] + b[i] + carry) % 10;
			carry = (a[i] + b[i] + carry) / 10;
		}
		return c;
	}
}
