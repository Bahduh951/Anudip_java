package com.java;

public class IncreDecre5 {
	public static void main(String[] args)
	{
		int i=11;
		
		
		//int j= --(i++); this is illegal
		int j= i++ + --i;
		System.out.println(+j);  
	}
}
