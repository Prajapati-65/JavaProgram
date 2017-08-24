package com.bridgelabz.Program;

import com.bridgelabz.Utility.Utility;

public class QuadratiEquation {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter a, b, c of the Quadratic equation ");
		int a = utility.inputInteger();
		int b = utility.inputInteger();
		int c = utility.inputInteger();
		utility.findRoot(a, b, c);
	}
}
