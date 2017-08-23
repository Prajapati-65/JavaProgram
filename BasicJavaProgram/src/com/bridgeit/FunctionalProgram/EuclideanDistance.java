package com.bridgeit.FunctionalProgram;

import com.bridgeit.MyUtility.Utility;

public class EuclideanDistance {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter x number :");
		int valueOfx = utility.inputInteger();
		System.out.println("Enter y number :");
		int valueOfy = utility.inputInteger();
		int powerofx = utility.powerFunction(valueOfx, 2);
		System.out.println("Power of number x is :" + powerofx);
		int powerofy = utility.powerFunction(valueOfy, 2);
		System.out.println("Power of number y is :" + powerofy);
		int distance = (powerofx + powerofy);
		System.out.println("Distance between two origin is  : " + Math.sqrt(distance));
	}
}
