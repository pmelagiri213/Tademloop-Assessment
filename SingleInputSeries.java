package com.Jspider.simpleProjectApp;

import java.util.Scanner;

public class SingleInputSeries {
	public static void getNum(int num) {
		
		if(num <= 0) {
			System.out.println("Please enter the positive integer! ");
			
		}
		
		for(int i=0; i<2*num-1; i++) {
			if(i%2 != 0) {
				System.out.print(i);
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		getNum(num);
		
		sc.close();
	}
}
