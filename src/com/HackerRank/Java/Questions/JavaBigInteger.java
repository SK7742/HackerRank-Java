package com.HackerRank.Java.Questions;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		BigInteger first = scan.nextBigInteger();
		BigInteger second = scan.nextBigInteger();
		
		System.out.println(first.add(second));
		System.out.println(first.multiply(second));
	}
}
