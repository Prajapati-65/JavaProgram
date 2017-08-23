package com.bridgeit.Basic;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	public static void main(String args[]) {
		List<Integer> names = new ArrayList<>();

		names.add(1);
		names.add(234);
		names.add(4);
		names.add(2354);
		names.add(56);

		names.forEach(System.out::println);

	}
}
