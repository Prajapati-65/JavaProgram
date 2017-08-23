package com.bridgeit.Basic;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonSimpleWriteExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		JSONObject obj = new JSONObject();

		System.out.println("Enter the name , age");
		obj.put("Name-", scanner.next());
		obj.put("Age-", scanner.nextInt());
		JSONArray list = new JSONArray();
		list.add("BridgeLabz");

		obj.put("Company", list);

		try (FileWriter file = new FileWriter("/home/bridgeit/Public/file/bbb.json")) {
			file.write(obj.toJSONString());
			file.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.print(obj);
	}
}
