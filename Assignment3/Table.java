package com.java;

public class Table {
	public static void main(String args[]) {
		System.out.println("The Table of the  Number 1-10 :");
		for(int a=1; a<=10;a++) {
			for (int b=0;b<=10;b++) {
				System.out.println(a+" X " +b+ " = " +(a*b));
			}
			System.out.println();
		}
	}
}

