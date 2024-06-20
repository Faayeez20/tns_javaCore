package com.faayeez.assignment.assignment2;

public class Main {
    public static void main(String[] args) {
        // Creating an object of Student to invoke the default constructor
        Student student = new Student();
        
        // Creating an object of Commission and using its methods
        Commission employeeCommission = new Commission();

        // Accepting details of the sales employee
        employeeCommission.acceptDetails();

        //Printing the Details and commission of the sales employee
        employeeCommission.showDetails();;
       
    }
}