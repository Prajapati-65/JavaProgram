package com.bridgelabz.Program;

import java.util.Stack;

import com.bridgelabz.Utility.Utility;

public class PrimeAnagramStack {
	
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter a integer number");
		int inputNumber = utility.inputInteger();
		for (int i = 2; i <= inputNumber; i++) {
			if (utility.isPrime(i)) {
				
		
				
				//System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}
