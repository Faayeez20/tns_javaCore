package com.faayeez.assignment.assignment8;

public class Nestedtrycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            // Outer try block
            System.out.println("Outer try block");
//            int[] arr1 = new int[5];
//            arr1[5] = 30 / 0; // This will throw ArithmeticException

            try {
                // Inner try block 1
                System.out.println("Inner try block 1");
                int[] arr = new int[5];
                arr[5] = 30 / 0; // This will throw ArithmeticException
            } 
            catch (ArithmeticException e) {
                // Inner catch block 1
                System.out.println("Exception caught in inner try block 1: " + e.getMessage());
            }

            
            try {
                // Inner try block 2
                System.out.println("Inner try block 2");
                int[] arr = new int[5];
                arr[10] = 10; // This will throw ArrayIndexOutOfBoundsException
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                // Inner catch block 2
                System.out.println("Exception caught in inner try block 2: " + e.getMessage());
            }
            
            
        } 
		catch (Exception e) {
            // Outer catch block
            System.out.println("Exception caught in outer try block: " + e.getMessage());
        }
        
        System.out.println("Program continues...");

	}

}
