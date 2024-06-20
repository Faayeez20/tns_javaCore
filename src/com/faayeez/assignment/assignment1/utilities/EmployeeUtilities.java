package com.faayeez.assignment.assignment1.utilities;

import com.faayeez.assignment.assignment1.employees.Developer;
import com.faayeez.assignment.assignment1.employees.Employee;
import com.faayeez.assignment.assignment1.employees.Manager;

/**
 * Utility class for operations on employees.
 */
public class EmployeeUtilities {

    /**
     * It will print the details of an employee.
    
     */
    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());

        if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Team Size: " + manager.getTeamSize());
            
        } else if (employee instanceof Developer) {
            Developer developer = (Developer) employee;
            System.out.println("Programming Language: " + developer.getProLang());
        }
    }
}
