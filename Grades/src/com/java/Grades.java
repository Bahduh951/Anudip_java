package com.java;

public class Grades {
	public static void main(String args[]) {
		int nos=70;
		if(nos<=100 && nos>=90) {
			System.out.println("Grade of the Student is: A+" );
		}
		else if(nos<=90 && nos>=80) {	
			System.out.println("Grade of the Student is: A" );
		}
		else if(nos<=80 && nos >=70) {
			System.out.println("Grade of the Student is: B+" );
		}
		else if(nos<=70 && nos >=60) {
			System.out.println("Grade of the Student is: B" );
		}
		else if(nos<=60 && nos>=50) {
			System.out.println("Grade of the Student is: C" );
		}
		else if(nos<=50 && nos>=40) {
			System.out.println("Grade of the Student is: D" );
		}
		else if(nos<=40 && nos>=30) {
			System.out.println("Grade of the Student is: E" );
		}
		else{
			System.out.println("Grade of the Student is: F" );
		}
	}
}
