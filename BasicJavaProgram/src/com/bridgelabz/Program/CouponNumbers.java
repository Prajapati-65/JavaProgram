package com.bridgelabz.Program;

import com.bridgelabz.Utility.Utility;

public class CouponNumbers {
	
	public static void main(String[] args) {
		Utility utility = new Utility();
		String string = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] ch = string.toCharArray();
		int max = 100000000;
		int random = (int) (Math.random() * max);
		StringBuffer sb = new StringBuffer();
		while (random > 0) {
			sb.append(ch[random % ch.length]);
			random = random / ch.length;
		}
		String couponCode = sb.toString();
		System.out.println("Coupon Code: " + couponCode);
	}
}
