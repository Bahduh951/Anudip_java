package com.java;

public class Leapyear {
	public static void main(String args[]) {
		int year = 2020;
		if((year % 400 == 0)||(year % 4 == 0) ) {
			System.out.println(year + " :This Year is a Leap Year");
		}
		else if(year % 100 != 0) {
			System.out.println(year + " :This Year is not Leap Year");
		}
		
		else {
			System.out.println(year + " :This Year is not Leap Year");
		}
}
}
