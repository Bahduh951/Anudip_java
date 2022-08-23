package com.java;
	import java.util.Scanner;
	public class Average {
		public static void main(String args[]) {
			Scanner num=new Scanner(System.in);
			int m,n,o,p,q,sum=0,average=0;
			System.out.println("Enter 5 Numbers: ");
			m=num.nextInt();
			n=num.nextInt();
		    o=num.nextInt();
			p=num.nextInt();
			q=num.nextInt();
			sum=m+n+o+p+q;
			System.out.println("The sum of Five numbers : " +sum);
			average=sum/5;
			System.out.println("The average of the Five numbers :" +average);
		}
	
	}


	
