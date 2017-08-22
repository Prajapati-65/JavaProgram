package com.bridgeit.AlgorithmProgram;

import com.bridgeit.MyUtility.Utility;

public class Anagram {

	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("Enter frist String : ");
		String fristStr = u.inputString();
		System.out.println("Enter second String : ");
		String secondStr = u.inputString();
		fristStr = u.removeSp(fristStr);
		secondStr = u.removeSp(secondStr);
		fristStr = u.toLower(fristStr);
		secondStr = u.toLower(secondStr);
		fristStr = u.sortString(fristStr);
		secondStr = u.sortString(secondStr);
		boolean check = u.chechStr(fristStr, secondStr);
		if (check) {
			System.out.println("Strings are Anagram ");
		} else {
			System.out.println("Strings are not Anagram");
		}

	}
}
