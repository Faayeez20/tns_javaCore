package com.faayeez.Exception_handling;

public class Age extends Exception{

	Age(String str)
	{
		super(str);
		System.out.println("You are under age.");
	}
}
