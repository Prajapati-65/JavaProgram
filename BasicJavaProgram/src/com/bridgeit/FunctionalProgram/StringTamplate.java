package com.bridgeit.FunctionalProgram;

import com.bridgeit.MyUtility.Utility;

public class StringTamplate {
	
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the Username : ");
		String userName = utility.inputString();
		String stringTemplate = "Hello <<username>> , How are you ?";
		if (userName.length() >= 3) {
			System.out.println(stringTemplate.replaceAll("<<username>>", userName));
		} else {
			System.out.println("Size does not exit");
		}
	}
}
