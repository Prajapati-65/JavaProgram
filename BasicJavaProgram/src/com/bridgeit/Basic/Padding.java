package com.bridgeit.Basic;

public class Padding
{
	public static String padRight(String s, int n) {
	     return String.format("%1$-" + n + "s", s);  
	}

	public static String padLeft(String s, int n) {
	    return String.format("%1$" + n + "s", s);  
	}

	public static void main(String args[]) throws Exception 
	{
	 System.out.println(padRight("Howto", 15)+"aaa");
	 System.out.println(padLeft("Howto", 15)+"bbb");
	}

}
