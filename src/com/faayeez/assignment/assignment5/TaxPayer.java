package com.faayeez.assignment.assignment5;

public abstract class TaxPayer {
	protected double salary;
    protected double tax;

    public TaxPayer(double salary) {
        this.salary = salary;
    }

    public abstract void calTax();

    public void displayTax() {
        System.out.println("The tax to be paid is: " + tax);
    }

}
