package com.bridgeit.Basic;

import java.util.Scanner;

public class BinaryTest {
	static String toBinary(int n) {
		if (n == 0) {
			return "0";
		}
		String binary = "";
		while (n > 0) {
			int rem = n % 2;
			binary = rem + binary;
			n = n / 2;
		}
		return binary;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a decimal number : ");
		int number = scanner.nextInt();
		System.out.println("Binary number is : " + toBinary(number));
	}
}
