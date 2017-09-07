package com.bridgelabz.Program;

import com.bridgelabz.Utility.Utility;

/**
 * @author OmPrajapati
 *
 */
public class VendineMachin {

	public static void main(String[] args) {

		Utility u = new Utility();
		System.out.print("Enter the Amount:");
		int money = u.inputInteger();
		int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };
		u.calculate(money, notes);
	}
}
