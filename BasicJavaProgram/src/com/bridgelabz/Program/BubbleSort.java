package com.bridgelabz.Program;

import com.bridgelabz.Utility.Utility;

public class BubbleSort {

	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("Enter size : ");
		int enterSize = u.inputInteger();
		int array[] = u.input1DArray(enterSize);
		u.print1DArray(array);
		int bubbleArray[] = u.bubbleSort(array);
		System.out.println();
		System.out.println("Sorted order is: ");
		for (int i = 0; i < bubbleArray.length; i++) {
			System.out.println(bubbleArray[i]);
		}
	}
}
