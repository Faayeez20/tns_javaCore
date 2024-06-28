package com.faayeez.assignment.assignment7;

//Example of Constructor overloading
public class Rectangle {
	private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Constructor with one parameter
    public Rectangle(double side) {
        this.length = side;
        this.width = side;
    }

    // Constructor with two parameters
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return this.length * this.width;
    }

    public double perimeter() {
        return 2 * (this.length + this.width);
    }
	

}
