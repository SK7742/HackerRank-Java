package com.HackerRank.Java.Questions;

import java.util.Scanner;

public class VarArgs {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int[] data = new int[6];
		for(int i = 0; i < 6; i++) {
			data[i] = scan.nextInt();
		}
		printAddFunction(data[0], data[1]);
		printAddFunction(data[0], data[1], data[2]);
		printAddFunction(data[0], data[1], data[2], data[3]);
		printAddFunction(data[0], data[1], data[2], data[3], data[4]);
		printAddFunction(data[0], data[1], data[2], data[3], data[4], data[5]);
		
	}
	private static void printAddFunction(int ...inputs) {
		String data = "";
		int sum = 0;
		for(int i = 0; i < inputs.length-1; i++) {
			data += inputs[i] + "+";
			sum += inputs[i];
		}
		data += inputs[inputs.length-1] + "=";
		sum += inputs[inputs.length-1];
	
		System.out.println(data + sum);
	}
}
