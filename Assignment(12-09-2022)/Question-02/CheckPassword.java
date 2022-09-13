package com.java;
/*Write a program to accept a password from the user and throw 'Authentication
Failure' exception if the password is incorrect.*/
import java.util.*; 

import java.util.Scanner;
public class CheckPassword {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	try
	{
	System.out.println("Enter Password : ");
	if(sc.nextLine().equals("365465"))
	{
	System.out.println("Authenticated -");
	}
	else
	{
	throw new Password("Authentication failure-");
	}
	}
	catch(Password e)
	{
	System.out.println(e.getMessage());
	}
	
		} 
}
