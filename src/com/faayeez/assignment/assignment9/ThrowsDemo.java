package com.faayeez.assignment.assignment9;

import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Throws ob = new Throws();
		
		try {
            ob.display();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }

	}

}
