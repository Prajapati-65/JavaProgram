package com.bridgelabz.Program;

import com.bridgelabz.Utility.Utility;

public class TemperaturConversion {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter temperature unit 'f' for Fahrenheit and 'c' for Celcius: ");
		String unit = utility.inputString();

		if (unit.equals("f")) {
			System.out.print("Enter temperature in fahrenheit: ");
			double fahrenheitTemp = utility.inputDouble();
			System.out.format("Temperature in celcius is: %.2f", utility.tempConvert(fahrenheitTemp, unit));
		} else if (unit.equals("c")) {
			System.out.print("Enter temperature in celcius: ");
			double celciusTemp = utility.inputDouble();
			System.out.format("Temperature in fahrenheit is: %.2f", utility.tempConvert(celciusTemp, unit));
		} else {
			System.out.println("Enter proper character...");
		}
	}
}
