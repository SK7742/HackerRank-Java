package com.HackerRank.Java.Questions;

import java.util.Scanner;
import java.util.Stack;

public class BalanceString {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int count = 1;
		while(count -- > 0) {
			String input = scan.next();
			char[] inputCharArray = input.toCharArray();
			System.out.println(balanceString(inputCharArray));
		}
	}
	private static boolean balanceString(char[] inputCharArray) {
		boolean ans = true;
		Stack<Character> data = new Stack<>();
		for(char x : inputCharArray) {
			if(x == '(' || x == '{' || x == '[') {
				data.push(x);
				continue;
			}
			if(data.isEmpty()) {
				return false;
			}
			if(x == ')'){
                if(data.peek() == '('){
                    data.pop();
                }else{
                    ans = false;
                    break;
                }
            }
			if(x == '}'){
                if(data.peek() == '{'){
                    data.pop();
                }else{
                    ans = false;
                    break;
                }
            }
			if(x == ']'){
                if(data.peek() == '['){
                    data.pop();
                }else{
                    ans = false;
                    break;
                }
            }
			
		}
		if(!data.isEmpty()){
            ans = false;
        }
        if(ans)
        return true;
        else
        return false;
	}
}
