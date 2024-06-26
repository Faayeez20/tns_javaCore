package com.faayeez.abstract_program;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name for the person: ");
        String name = scanner.nextLine();

        System.out.print("Enter the salary for " + name + ": ");
        double salary = scanner.nextDouble();

        TaxPayer person = new Person(name, salary);
        person.calTax();

        System.out.println(person);
        person.displayTax();

        scanner.close();
    }

}
