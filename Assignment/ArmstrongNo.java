package com.java;
/*Write a Java Program to show that the number is an Armstrong number*/
import java.util.Scanner;
public class ArmstrongNo {
	public static void main(String args[]) {
		Scanner nos=new Scanner(System.in);
		System.out.print("Enter a number=");
		int a=nos.nextInt();
		int rem,sum=0,tmp=a;
		while(a!=0) {
			rem=a%10;
			sum=sum+(rem*rem*rem);
			a=a/10;
		}
		if(tmp==sum)
			System.out.println(sum+ ":Is a armstrong number");
		else
			System.out.println(sum+ ":Is not a armstrong number");
	}

	}

