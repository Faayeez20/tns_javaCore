package com.faayeez.interface_program;

public interface Amazon {
	void welcome(); //abstract method
	void thankyou(); //abstract method
	
	default void serviceCharges() {
		int amt = 100;
		System.out.println("The service Charge is " +amt);
		
	}
	
	static void aboutUs() { //static method
		System.out.println("Its an ecommerce website");
	}

}
