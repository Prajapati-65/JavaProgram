package com.bridgeit.FunctionalProgram;

import com.bridgeit.MyUtility.Utility;

public class AllPermutation {
	
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter a String : ");
		String string = utility.inputString();
		int lengthOfString = string.length();
		utility.permute(string, 0, lengthOfString - 1);
	}
}
