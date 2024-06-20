package com.faayeez.assignment;

import com.faayeez.assignment.employees.Manager;
import com.faayeez.assignment.employees.Developer;
import com.faayeez.assignment.utilities.EmployeeUtilities;

/**
 * Main class for running the assignment application.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Faayeez", "M123", 95000, 10);
        Developer developer = new Developer("SalmanKhan", "D456", 85000, "Java");

        System.out.println("Manager Details:");
        EmployeeUtilities.printEmployeeDetails(manager);

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}

