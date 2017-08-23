package com.bridgeit.AlgorithmProgram;

import com.bridgeit.MyUtility.Utility;

public class ToBinary {

	public static void main(String[] args) {

		Utility utility = new Utility();
		System.out.println("Enter a number :");
		int inputNumber = utility.inputInteger();
		String binary = utility.toBinary(inputNumber);
		System.out.println("Binary representation : ");
		System.out.println(binary);
		binary = utility.reverseString(binary);
		System.out.println("---------------------");
		char ch[] = binary.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i] + "  2^" + i + " = " + utility.poworOfTwo(i));
		}

	}
}