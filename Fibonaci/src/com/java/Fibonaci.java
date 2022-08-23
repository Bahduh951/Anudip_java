package com.java;

public class Fibonaci {
	public static void main(String args[]) {
		int a = 0;
	    int b = 1;

	    do
	 {
	        System.out.println(a);
	        b = a + b;
	        if (b < 100)
	        {
	            System.out.println(b);
	        }
	        a = a + b;
	    } while (a < 100);
  }

}

