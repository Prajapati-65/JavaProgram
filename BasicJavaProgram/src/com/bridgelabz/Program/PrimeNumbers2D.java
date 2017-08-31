package com.bridgelabz.Program;

import com.bridgelabz.Utility.Utility;

public class PrimeNumbers2D {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter a number :");
		int number = utility.inputInteger();
		String[][] str1 = new String[number][number];
		String[] str2 = utility.checkPrime(number);
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length; j++) {
				str1[i][j] = str2[j];
				System.out.print(str1[i][j] + " ");
			}
			System.out.println();
		}
	}
}