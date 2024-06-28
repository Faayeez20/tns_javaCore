package com.faayeez.Polymorphism_program;

//sub class
public class SBI extends RBI {
	
	@Override
	public float getRateofInterest() {
		return 7.0f;
	}
	
	public SBI getObject() {
		return this;
	}

}
