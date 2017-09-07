package com.bridgelabz.Program;

import com.bridgelabz.Utility.Utility;

/**
 * @author OmPrajapati
 *
 */
public class SquareRoot {

	public static void main(String[] args) {
		Utility myutility = new Utility();
		System.out.println("Enter a number");
		double number = myutility.inputDouble();
		System.out.println(myutility.sqrt(number, number));
	}
}
