package com.faayeez.Exception_handling;

public class WithoutException {
	public static void main(String args[]) {
		
		int d = 0;
		
		try {
			
			int a = 42/d; // exception occured
			String s ="manu";
			System.out.println("My name is "+s);
		}
		catch(ArithmeticException e) {
			System.out.println("exception caught "+ e.getMessage());	
			
		}
		catch(NullPointerException e) {
			System.out.println("exception caught "+ e.getMessage());	
			
		}
		catch(Exception e) {
			System.out.println("Will not be printed .");	
			
		}
		finally {
			System.out.println("I will execute ant ways");
		}
		
		
	}

}
