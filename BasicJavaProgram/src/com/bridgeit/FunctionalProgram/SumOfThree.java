package com.bridgeit.FunctionalProgram;

import com.bridgeit.MyUtility.Utility;

public class SumOfThree {
	
	public static void main(String[] args) {
		Utility utility = new Utility();
		int array[] = utility.readArray();
		utility.display(array);
		System.out.println();
		int count = utility.sumofthree(array);
		System.out.println("No.of Tripltes : " + count);
	}
}
