package com.HackerRank.Java.Questions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Java1DArray {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int query = scan.nextInt();
		while(query -- > 0) {
			int arrSize = scan.nextInt();
			int leaf = scan.nextInt();
			int[] element = new int[arrSize];
			for(int i = 0; i < arrSize; i++) {
				element[i] = scan.nextInt();
			}
			if(canWin(element, leaf)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
	/*private static boolean playGame (int[] element, int leaf) {
		//boolean continuity = true;
		for(int i = 0; i < element.length - leaf; i++) {
			if(element[i] == 0) {
				if(i + 1 + leaf >= element.length) {
					return true;
				}
			}else {
				int consucetiveOnes = getConsucetiveOnes(element, i);
				if(consucetiveOnes >= leaf) {
					return false;
				}
			}
			//System.out.print(element[i] + " ");
		}
		return false;
	}
	private static int getConsucetiveOnes(int[] element, int i) {
		int count = 0;
		while(element[i] != 0) {
			count++;
			i++;
		}
		return count;
	}*/
	static boolean canWin(int[] cells, int m) {
		boolean[] visited = new boolean[cells.length];
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(0);
		while (!queue.isEmpty()) {
			int head = queue.poll();
			if (head >= cells.length) {
				return true;
			}
			if (head >= 0 && !visited[head] && cells[head] == 0) {
				visited[head] = true;
				queue.offer(head - 1);
				queue.offer(head + 1);
				queue.offer(head + m);
			}
		}
		return false;
	}
	
	
}
