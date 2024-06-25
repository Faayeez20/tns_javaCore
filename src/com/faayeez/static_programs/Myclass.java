package com.faayeez.static_programs;

public class Myclass {
	
	private int section;// instance variable
	private static int srNo;// static variable
	
	static { //static block
		System.out.println("---Static Block---");
		srNo = 1000;
	}

	Myclass(){ //default constructor
		System.out.println("---Default Constructor---");
		srNo++;
		section++;
		
		
	}
	
	static void display() {
		System.out.println("---Static Method---");
		System.out.println("Serial No: " +srNo);
		
	}

	@Override
	public String toString() {
		return "Myclass [section=" + section + "]";
	}
	
	
	

}
