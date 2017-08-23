package com.bridgeit.DataStructureProgram;

import java.text.DateFormatSymbols;
import com.bridgeit.MyUtility.Utility;

public class Calendar {

	public static void main(String[] args) {
		Utility  utility = new Utility();
		System.out.print("Enter month and year: ");
		int month = utility.inputInteger();
		int year = utility.inputInteger();
		System.out.println("\n" + (new DateFormatSymbols().getMonths()[month - 1])
				+ " " + year + "\n");
		System.out.println("Su\tM\tT\tW\tTh\tF\tSa");
		utility.fillArray(month, year);
		utility.print();
	}
}
