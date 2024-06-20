package com.faayeez.assignment.assignment2;

import java.util.Scanner;

public class Commission {
    private String name;
    private String address;
    private int phone;
    private double salesAmount;

    // Method to accept details of the sales employee
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        name = scanner.nextLine();

        System.out.println("Enter address: ");
        address = scanner.nextLine();

        System.out.println("Enter phone: ");
        phone = scanner.nextInt();

        System.out.println("Enter sales amount: ");
        salesAmount = scanner.nextDouble();

        scanner.close();
    }

    // Method to calculate the commission
    public void calCommission() {
        double commission = 0.0;
        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        } else {
        	commission = 0;
        }
        
        System.out.println("The commission is: " + commission);
         
    }
    
    // Method to display employee details and commission
    public void showDetails() {
        System.out.println("Sales Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: " + salesAmount);
        calCommission();
    }
}