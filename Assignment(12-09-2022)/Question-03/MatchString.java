package com.java;
/*Write a program to throw a user-defined exception "String Mismatch Exception", 
 * if two strings are not equal (ignore the case).*/
import java.util.Scanner;
public class MatchString {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string :: ");
		String input = scan.nextLine();
		
		try {
			if(input.equalsIgnoreCase("Hello world"))
				System.out.println("String matched !!!");
			else
				throw new String("String not matched ???");
		}
		catch (String s) {
			System.out.println(s);
		}
	}
}
