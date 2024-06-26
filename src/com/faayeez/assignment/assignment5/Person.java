package com.faayeez.assignment.assignment5;

public class Person extends TaxPayer{
	
	private String name;

    public Person(String name, double salary) {
        super(salary);
        this.name = name;
    }

    @Override
    public void calTax() {
        if (salary <= 50000) {
            tax = salary * 0.1;
        } else if (salary <= 100000) {
            tax = salary * 0.2;
        } else {
            tax = salary * 0.4;
        }
    }

    @Override
    public String toString() {
        return "Person Name : " + name + ", Salary : " + salary + ", Tax : " + tax + " " ;
    }

}
