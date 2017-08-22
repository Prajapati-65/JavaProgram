package com.bridgeit.DataStructureProgram;

import com.bridgeit.MyUtility.Utility;

public class WeekDay {

	public static void main(String[] args) {
		Utility utility= new Utility();
		System.out.println("Enter the number of month");
		double month  = utility.inputDouble();
		System.out.println("Enter the number of day");
		double day = utility.inputDouble();
		System.out.println("Enter the number of year");
		double year = utility.inputDouble();
		
		
		System.out.println(new Utility().dayOfWeek(month, day, year));
	}
}
