package com.java;

public class Second {
	public static void main(String[] args) 
    {
        int a=22, b=33, c;
        
        c = a + b + a++ + b++ + ++a + ++b;
         
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
}
