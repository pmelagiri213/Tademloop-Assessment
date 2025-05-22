package com.Jspider.simpleProjectApp;

import java.util.Scanner;

public class Calculator {
	public static void doCalculation(double num1, double num2, String ch) {
		switch(ch) {
		case "a": 
			System.out.println("The sum of "+num1+" and "+num2+" is: "+(num1+num2));
			break;
			
		case "b":
			if(num1>num2) {
				System.out.println("The difference of "+num1+" and "+num2+" is: "+(num1-num2));
			}
			else {
				System.out.println("The difference of "+num1+" and "+num2+" is: "+(num2-num1));
			}
			break;
			
		case "c":
			if(num1 == 0 || num2 == 0) {
				System.out.println("The product of "+num1+" and "+num2+" is: 0");
			}
			else {
				System.out.println("The product of "+num1+" and "+num2+" is: "+(num1*num2));
			}
			break;
			
		case "d":
			if(num2 == 0) {
				System.out.println(num1+" cannot be divisible by "+num2);
			}
			else {
				System.out.println("Division of "+num1+" and "+num2+" is: "+(num1/num2));
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter the second number: ");
		double num2 = sc.nextDouble();
		
		System.out.println("1) a -> Addition\n2) b -> Substraction\n3) c -> Multiplication\n4) d -> Division");
		System.out.println("Choose the option that needs to perform a task from the following options: ");
		
		String ch = sc.next();
		doCalculation(num1, num2, ch);
		
		sc.close();
	}
}
