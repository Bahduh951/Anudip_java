package com.java;
import java.util.Scanner;
public class Starpatern {
	public static void main(String args[]) {
				Scanner num= new Scanner (System.in);
				int rows,a,b;
				rows= num.nextInt();
				for(a=rows-1;a>=0;a--) {
					for(b=0;b<=a;b++) {
						System.out.print("*" + "--");
					}
					System.out.println();
				}
			}
	}
