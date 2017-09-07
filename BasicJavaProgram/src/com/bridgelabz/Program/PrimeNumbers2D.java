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
<<<<<<< HEAD
		String[] string1 = utility.checkPrime(number);
		
		String[][] string2 = new String[number][number];	
		
		for (int i = 0; i < string2.length; i++) {
			for (int j = 0; j < string2[i].length; j++) {
				string2[i][j] = string1[(j*string2.length) + i];
				System.out.print(string2[i][j] + " ");
=======
		String[][] str1 = new String[number][number];
		String[] str2 = utility.checkPrime(number);
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length; j++) {
				str1[i][j] = str2[j];
				System.out.print(str1[i][j] + " ");
>>>>>>> 9663d15798b30a845e99e0f8b435ec678ca3a968
			}
			System.out.println();
		}
	}
}