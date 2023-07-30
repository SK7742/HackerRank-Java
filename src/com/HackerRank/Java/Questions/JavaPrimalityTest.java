package com.HackerRank.Java.Questions;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		BigInteger number = scan.nextBigInteger();
		if(number.isProbablePrime(1)) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	}
}
