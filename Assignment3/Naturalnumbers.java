package com.java;
import java.util.Scanner;
public class Naturalnumbers {
	public static void main(String args[]) {
		Scanner num=new Scanner(System.in);
		System.out.println("Input the number");
		int a=num.nextInt();
		int sum=0;
		System.out.println("Natural numbers=");
		for(int i=1;i<=a;i++) {
	    System.out.println(i+" ");
	    sum += i;
	 }
		System.out.println();
		System.out.println("The sum of natural numbers:" +sum);
	}
}
