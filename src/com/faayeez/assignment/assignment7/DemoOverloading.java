package com.faayeez.assignment.assignment7;

public class DemoOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create Rectangle objects using different constructors
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5.0);
        Rectangle rect3 = new Rectangle(4.0, 6.0);

        // Print area and perimeter of each Rectangle
        System.out.println("Rectangle 1 - Area: " + rect1.area() + ", Perimeter: " + rect1.perimeter());
        System.out.println("Rectangle 2 - Area: " + rect2.area() + ", Perimeter: " + rect2.perimeter());
        System.out.println("Rectangle 3 - Area: " + rect3.area() + ", Perimeter: " + rect3.perimeter());
	}

}
