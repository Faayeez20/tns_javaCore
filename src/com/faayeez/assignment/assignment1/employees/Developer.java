package com.faayeez.assignment.assignment1.employees;

/**
  Represents a developer with additional attributes specific to developers.
 */
public class Developer extends Employee {
    private String proLang;

    public Developer(String name, String employeeId, double salary, String proLang) {
        super(name, employeeId, salary);
        this.proLang = proLang;
    }

   
    public String getProLang() {
        return proLang;
    }

    public void setProLang(String proLang) {
        this.proLang = proLang;
    }
}
