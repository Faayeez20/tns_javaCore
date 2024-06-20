package com.faayeez.assignment.employees;
/*
  Represents a manager with additional attributes specific to managers. In this Case we uses teamSize as an attribute
*/

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, String employeeId, double salary, int teamSize) {
        super(name, employeeId, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}
