package com.bridgeit.AlgorithmProgram;

import com.bridgeit.MyUtility.Utility;

public class MonthlyPayment {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the no. of year :");
		double year = utility.inputDouble();
		System.out.println("Enter the value of P :");
		double p = utility.inputDouble();
		System.out.println("Enter the value of R :");
		double r = utility.inputDouble();
		int monthlyPayment = utility.monthlyPayment(p, year, r);
		System.out.println("Monthly payment required: " + monthlyPayment);
	}
}
