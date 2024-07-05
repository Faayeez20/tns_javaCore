package com.faayeez.Thread_program;

public class ChildThread extends Thread{
	
	int n ;
	String name;
	
	public ChildThread(int n, String name) {
		super();
		this.n = n;
		this.name = name;
	}
	
	public void run() {
		

		for (int i=1 ; i<=n ; i++) {
			
//			System.out.println("The value is "+n+" "+name);

			
			try {
				Thread.sleep(300);
			}
			catch(InterruptedException e){
				System.out.println(e.getMessage());	
			}
		System.out.println("The value is "+n+" "+name);
			
		}
	}
	
	
	

}
