package com.bridgelabz.Program;

import com.bridgelabz.Utility.Utility;

/**
 * @author OmPrajapati
 *
 */
public class PrimeNumberRange {
	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("Enter the number : ");
		int inputNumber = u.inputInteger();
		int count = 0;
		for (int i = 2; i <= inputNumber; i++) {
			if (u.isPrime(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Count : " + count);
	}
}
