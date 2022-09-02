package com.java;
/*Write a Program To display
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
 */
import java.util.Scanner;
public class TriangleNo {
	public static void main(String args[]) {
		int a,b,rows,num=1;
		Scanner row=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		rows=row.nextInt();
		for(a=1;a<=rows; a++) {
		
			for(b=1;b<a+1;b++) {
				System.out.print(num++ +" ");
				
			}
			System.out.println();
		}
	}
}

