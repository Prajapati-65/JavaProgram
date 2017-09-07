package com.bridgelabz.Program;

import com.bridgelabz.Utility.Utility;

/**
 * @author OmPrajapati
 *
 */
public class Factors {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter a integer number");
		int inputNumber = utility.inputInteger();
		System.out.print("Prime factors is : ");
		for (int i = 2; i <= inputNumber; i++) {
			if (utility.isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
