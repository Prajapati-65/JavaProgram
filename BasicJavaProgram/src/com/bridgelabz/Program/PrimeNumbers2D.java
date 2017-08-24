package com.bridgelabz.Program;

import com.bridgelabz.Utility.Utility;

public class PrimeNumbers2D {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter the number of range");
		int range = utility.inputInteger();
		for (int i = 2; i < range; i++) {
			if (utility.isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	
	}

}
