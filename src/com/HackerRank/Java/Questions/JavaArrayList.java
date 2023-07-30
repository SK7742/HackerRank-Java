package com.HackerRank.Java.Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class JavaArrayList {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int size = scan.nextInt();
		List<List<Integer>> list = new ArrayList<>(size);
		int counter = 0;
		while(counter < size) {
			int noOfItems = scan.nextInt();
			List<Integer> tempList = new ArrayList<>();
			for(int i = 0; i < noOfItems; i++) {
				tempList.add(scan.nextInt());
			}
			list.add(tempList);
			counter++;
		}
		System.out.println("...Querying...");
		int noOfQuery = scan.nextInt();
		while(noOfQuery -- > 0) {
			int arrayIndex = scan.nextInt() - 1;
			int position = scan.nextInt() - 1;
			var finalResult = checkForPosition(list.get(arrayIndex), position);
			System.out.println(finalResult); 
			  
			 
		}
	}
	private static Object checkForPosition(List<Integer> list, int position) {
		if(list.size() > position) {
			return list.get(position);
		}
		return "ERROR!";
	}
}
