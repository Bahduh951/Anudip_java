package com.java;
import java.util.Scanner;
public class Cube {
	public static void main(String args[]) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=num.nextInt();
		
		for (int i=1; i<=a;i++) {
			System.out.println("The no of the Cube" +i+ "is" +(i*i*i));	
		}
	}
}
