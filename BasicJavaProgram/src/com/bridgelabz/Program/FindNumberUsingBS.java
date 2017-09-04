package com.bridgelabz.Program;

import com.bridgelabz.Utility.Utility;

public class FindNumberUsingBS {

	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("Enter the Range");
		int inputNumber = u.inputInteger();
		int array[] = new int[inputNumber];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
			System.out.print(array[i] + " ");
		}
		System.out.println();
		u.findNumber(0, inputNumber);

	}
}
