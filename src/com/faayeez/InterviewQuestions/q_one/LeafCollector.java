package com.faayeez.InterviewQuestions.q_one;

import java.util.Scanner;

public class LeafCollector {
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner ob = new Scanner(System.in);
	        int totalSamples = 0;
	        int rounds = 0;

	        while (totalSamples < 30) {
	            System.out.print("Enter the number of leaf samples collected in round " + (rounds + 1) + ": ");
	            int samples = ob.nextInt();
	            totalSamples += samples;
	            rounds++;
	        }

	        System.out.println("Total samples collected: " + totalSamples);
	        System.out.println("Total rounds taken: " + rounds);
	        
	        ob.close();
	    }

}
