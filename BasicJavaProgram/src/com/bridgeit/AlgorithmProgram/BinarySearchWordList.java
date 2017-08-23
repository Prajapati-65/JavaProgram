package com.bridgeit.AlgorithmProgram;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.bridgeit.MyUtility.Utility;

public class BinarySearchWordList {
	
	public static void main(String[] args) {
		Utility u = new Utility();
		String string = "";
		try{
			File file = new File("/home/bridgeit/abc.txt");
			FileReader fileReader = new FileReader(file);
			char ch[] = new char[(int) file.length()];
			fileReader.read(ch);
			System.out.println("The content of your file is:");
			System.out.println(ch);
			for (int i = 0; i < ch.length; i++) {
				string = string + ch[i];
			}

			String str[] = string.split(" ");
			str = u.sortArrayString(str);
			System.out.println("enter your searching String from the file");
			String search = u.inputString();
			if (u.binarySearchString(str, search) != 1) {
				System.out.println("yes , your element is present in the file");
			} else {
				System.out.println("sorry!!!   we did not find your element in the file");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
