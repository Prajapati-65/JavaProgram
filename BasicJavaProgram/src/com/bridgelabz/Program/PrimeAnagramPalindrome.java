package com.bridgelabz.Program;

import com.bridgelabz.Utility.Utility;

public class PrimeAnagramPalindrome {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the range : ");
		int inputNumber = utility.inputInteger();
		String [] strArray =utility.prime(inputNumber);
		System.out.println("Anagram in given range of prime numbers are:");
		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if (utility.checkAnagram(strArray[i], strArray[j])) {
					System.out.println(strArray[i] + "  " + strArray[j]);
				}
			}
		}
		System.out.println("Palindrome in given range of prime numbers are:");
		for (int i = 0; i < strArray.length; i++) {
			if (utility.palindrome(strArray[i])) {
				System.out.println(strArray[i]);
			}
		}
	}
}
