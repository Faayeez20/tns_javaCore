package com.faayeez.Exception_handling;

public class Throw_program {
	public static void validate (int age) {
		
		if(age<18) {
			throw new ArithmeticException("invalid age");
		}
		else
		{
			System.out.println("You can vote");
		}
		
	}

}
