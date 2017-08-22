package com.bridgeit.Basic;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("before swap 1st no. :");
		int x = scanner.nextInt();
		System.out.println("before swap 2st no. :");
		int y = scanner.nextInt();

		/*
		 * x = x + y; y = x - y; x = x - y;
		 * 
		 */

		/*
		 * x = x * y; y = x / y; x = x / y;
		 * 
		 */

		/*
		 * x = x ^ y; y = x ^ y; x = x ^ y;
		 * 
		 */

		x = (x + y) - (y = x);

		System.out.println("after swap 1st no. :" + x);
		System.out.println("after swap 1st no. :" + y);

	}

}
