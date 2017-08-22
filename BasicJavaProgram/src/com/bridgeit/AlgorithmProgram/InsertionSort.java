package com.bridgeit.AlgorithmProgram;

import com.bridgeit.MyUtility.Utility;

public class InsertionSort {
	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("Enter the String : ");
		String inputString = u.inputString();
		System.out.println();
		String str[] = inputString.split(" ");
		String strArray[] = u.sortArrayString(str);

		System.out.println("Sorted words in the String array ");
		System.out.println();
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}
}
