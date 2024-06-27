package com.faayeez.interface_program;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Amazon.aboutUs();
		System.out.println("\n");
		
		Amazon obone = new PrimeAccount(); //through implementable class we can access the method
		obone.welcome();
		obone.thankyou();
		System.out.println("\n");
		
		Amazon obtwo = new NonPrimeAccount();
		obtwo.welcome();
		obtwo.serviceCharges();
		obtwo.thankyou();
		

	}

}
