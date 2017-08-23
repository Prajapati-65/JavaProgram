package com.bridgeit.Basic;

import java.util.Scanner;

public class Matrix {
	static int[][] readMat() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a elements : ");
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] mat = new int[n][m];
		System.out.println("Enter " + n * m + " elements ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = scanner.nextInt();
			}
		}
		return mat;
	}

	static void display(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void function(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == j || i + j == a.length - 1) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int a[][] = readMat();
		display(a);
	}
}
