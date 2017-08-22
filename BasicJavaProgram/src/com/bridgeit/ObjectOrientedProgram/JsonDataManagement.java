package com.bridgeit.ObjectOrientedProgram;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonDataManagement {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter No. of Product : ");
		int product=scanner.nextInt();
		int productArray[] = new int[product];
		System.out.println("Enter the "+product+" product name : ");
		for (int i = 0; i <= productArray.length; i++) {
			String str = scanner.nextLine();
			char strArray[] = str.toCharArray();
		}
		String[] strings ={"Rice","Pulses","Wheats"};
		JSONObject finalObject = new JSONObject();
		for (String number : strings) 
		{
			System.out.print("Enter number of types of "+number+" :");
			int count = scanner.nextInt();
			JSONArray array = new JSONArray();
			for (int i = 0; i < count; i++) 
			{
				JSONObject jsonObject = new JSONObject();
				System.out.print("Enter name , Wheats and price: ");
				jsonObject.put("Name", scanner.next());
				jsonObject.put("Wheats", scanner.nextInt());
				jsonObject.put("Price", scanner.nextInt());

				array.add(jsonObject);
			}
			finalObject.put(number, array);
		}
		try (FileWriter file = new FileWriter("/home/bridgeit/Public/file/JsonFile.json")) {

			file.write(finalObject.toJSONString());
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print(finalObject);
	}
}