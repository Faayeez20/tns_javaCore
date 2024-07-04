package com.faayeez.Thread_program;

public class MyThread extends Thread {
	
	public  void run() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread(); //new state
		t.start(); //runnable state
//		t.start(); 
		t.run();
		
	}
	
	

}
