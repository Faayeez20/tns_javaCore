package com.faayeez.Exception_handling;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Throw_program.validate(5);
		}
		catch(ArithmeticException e){
			System.out.println("Exception handled : "+ e.getMessage());
			
		}

	}

}
