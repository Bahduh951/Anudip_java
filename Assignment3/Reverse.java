package com.java;
import java.util.Scanner;
public class Reverse {
	public static void main(String args[]) {
		Scanner nos=new Scanner(System.in);
		System.out.println("Enter the number:");
		int x,rem,rev=0;
		x=nos.nextInt();
		while(x!=0) {
			rem=x%10;
			rev= rev *10+rem;
			x=x/10;
			
		}
		System.out.println("The number which is reverse is:" +rev );
		
		/*int x=1234;
		int rem,rev=0;
		rem = x%10;
		rev = rev*10 +rem;
		x =x/10;*/
		switch(rev) {
		case 1:{
			System.out.println(rev);
			
		}
		case 2:{
			System.out.println(rev);
		}
		}
	}
}

