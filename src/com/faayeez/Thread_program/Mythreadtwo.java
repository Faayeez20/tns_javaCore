package com.faayeez.Thread_program;

public class Mythreadtwo implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mythreadtwo t = new Mythreadtwo();
		Thread tone = new Thread(t);
		tone.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("By using runnable interface I am creating a Thread ");
		
	}
	
}
