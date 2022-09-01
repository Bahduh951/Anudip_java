package com.java;
import java.util.Scanner;
public class Operator {
	public static void main(String args[]) {
		Scanner num=new Scanner(System.in);
		int a,b,output=0;
		System.out.println("Enter the two number:");
		a=num.nextInt();
		b=num.nextInt();
		System.out.println("Enter the operator:");
		char sign;
		sign=num.next().charAt(0);
		switch(sign) {
		case '+':
			output = a + b;
			break;
		case '-':
			output = a - b;
			break;
		case '*':
			output = a * b;
			break;
		case '/':
			output = a / b;
			break;
		default:
			System.out.println("Incorrect Operator");
		return;
		}
		
	System.out.println("The output of two numbers is :" +output);
	}

}

