package com.java;
import java.util.Scanner;
public class PrimenoOrnot {
	public static void main(String args[]) {
		Scanner prime=new Scanner(System.in);
		System.out.println("Enter a number");
		int nos=prime.nextInt();
		boolean flag=false;
		if(nos==1)
		{
			System.out.println("Not a prime number");
		}else {
		for(int i=2;i<nos;i++)
		{
			if(nos%i==0)
			{
				System.out.println("Not a prime number");
				flag=true;
			break;
			}
			
		}
		if(flag==false) {
			System.out.println("Prime number");
		}
		}
	}
}

