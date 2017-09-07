package com.bridgelabz.Program;

import com.bridgelabz.Utility.Utility;

/**
 * @author OmPrajapati
 *
 */
public class PrimeNumbers2D {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter a number :");
		int number = utility.inputInteger();
		String[] string1 = utility.checkPrime(number);
		
		String[][] string2 = new String[number][number];	
		
		for (int i = 0; i < string2.length; i++) {
			for (int j = 0; j < string2[i].length; j++) {
				string2[i][j] = string1[(j*string2.length) + i];
				System.out.print(string2[i][j] + " ");
			}
			System.out.println();
		}
	}
}