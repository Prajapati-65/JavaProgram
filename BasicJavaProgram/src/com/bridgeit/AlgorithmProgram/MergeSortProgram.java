package com.bridgeit.AlgorithmProgram;

import java.util.Scanner;

import com.bridgeit.MyUtility.Utility;

public class MergeSortProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of strings: ");
		int numberOfStrings = scanner.nextInt();
		String[] strings = new String[numberOfStrings];

		for (int i = 0; i < numberOfStrings; i++) {
			strings[i] = scanner.next();
		}
		scanner.close();

		Utility utility = new Utility();
		strings = utility.mergeSort(strings);

		System.out.println("Sorted list:");

		for (String string : strings) {
			System.out.println(string);
		}
	}
}
