package com.bridgelabz.Program;

import com.bridgelabz.Utility.Utility;

/**
 * @author OmPrajapati
 *
 */
public class SearchSorting {

	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("1 BinarySearch  for Integer");
		System.out.println("2 BinarySearch  for String");
		System.out.println("3 InsertionSort  for Integer");
		System.out.println("4 InsertionSort  for String");
		System.out.println("5 BubbleSort for Integer");
		System.out.println("6 BubbleSort for String");
		System.out.println();
		System.out.println("Enter Your Choice : ");
		int number = u.inputInteger();
		do {
			switch (number) {
			case 1:
				System.out.println("BinarySearch  For Integer");
				System.out.println("Enter size: ");
				int arraySize = u.inputInteger();
				int a[] = u.input1DArray(arraySize);
				u.print1DArray(a);
				System.out.println("Enter Key: ");
				int position = u.binarySearch(a, u.inputInteger());
				System.out.println("Found at " + position + " position");
				System.out.println(" ");
				break;
			case 2:
				System.out.println("BinarySearch  For String");
				System.out.println("Enter number of words to be sorted: ");
				int arraySize1 = u.inputInteger();
				String b[] = u.input1DStringArray(arraySize1);
				u.print1DStringArray(b);
				System.out.println("Enter Key: ");
				int position1 = u.binarySearchString(b, u.inputString());
				System.out.println("Found at " + position1 + " position");
				System.out.println(" ");
				break;
			case 3:
				System.out.println("InsertionSort  For Integer");
				System.out.println("Enter size: ");
				int arraySize5 = u.inputInteger();
				int c[] = u.input1DArray(arraySize5);
				u.print1DArray(c);
				System.out.println("Enter Key: ");
				int k = u.inputInteger();
				System.out.println("Sorted Array is: ");
				for (int i = 0; i < c.length; i++) {
					System.out.println(c[i]);
				}
				break;
			case 4:
				System.out.println("InsertionSort  For String");
				System.out.println();
				System.out.println("Enter size: ");
				int arraySize4 = u.inputInteger();
				String d[] = u.input1DStringArray(arraySize4);
				u.print1DStringArray(d);
				String k1[] = u.insertionSortString(d);
				System.out.println();
				System.out.println("Sorted Array is: ");
				System.out.println();
				for (int i = 0; i < k1.length; i++) {
					System.out.println(k1[i]);
				}
				break;
			case 5:
				System.out.println("BubbleSort  For Integer: ");
				System.out.println("Enter size: ");
				int arraySize2 = u.inputInteger();
				int e[] = u.input1DArray(arraySize2);
				u.print1DArray(e);
				System.out.println("Enter Key: ");
				int k2[] = u.bubbleSort(e);
				System.out.println("Sorted Array is: ");
				for (int i = 0; i < k2.length; i++) {
					System.out.println(k2[i]);
				}
				break;
			case 6:
				System.out.println("BubbleSort  For String");
				System.out.println("Enter number of words to be sorted: ");
				int arraySize3 = u.inputInteger();
				String f[] = u.input1DStringArray(arraySize3);
				u.print1DStringArray(f);
				System.out.println("Enter Key: ");
				String k3[] = u.bubbleSortString(f);
				System.out.println("Sorted Array is: ");
				for (int i = 0; i < k3.length; i++) {
					System.out.println(k3[i]);
				}
				break;
			case 7:
				System.exit(0);
			default:
				System.out.println("Wrong Input");
				break;
			}
		} while (number != 0);
	}
}
