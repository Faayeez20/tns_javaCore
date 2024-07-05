package com.faayeez.Thread_program;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildThread tone = new ChildThread(5, "First");
		ChildThread ttwo = new ChildThread(10, "Second");
		
		tone.start();
		ttwo.start();
		
		System.out.println("End of main Thread");

	}

}
