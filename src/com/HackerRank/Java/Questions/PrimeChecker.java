package com.HackerRank.Java.Questions;

import java.util.Scanner;

public class PrimeChecker {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] input = new int[5];
		for(int i = 0; i < 5; i++) {
			input[i] = sc.nextInt();
		}
		checkPrime(input[0]);
		checkPrime(input[0],input[1]);
		checkPrime(input[0],input[1],input[2]);
		checkPrime(input[0],input[1],input[2],input[3],input[4]);	
	}
	private static void checkPrime(int ...data) {
		
		for(int x : data) {
			if(checkPrimeForX(x)) {
				System.out.print(x + " ");
			}
		}
		System.out.println();
	}
	private static boolean checkPrimeForX(int x) {
		if(x > 3) {
			for(int i = 2; i <= x/2; i++) {
				if(x % i == 0) {
					return false;
				}
			}
			
		} else if(x == 2 || x == 3) {
			return true;
		} else if(x == 1) {
			return false;
		}
		return true;
	}
}
