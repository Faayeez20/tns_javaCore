package com.faayeez.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Laptop> lap= new ArrayList<Laptop>();
		lap.add(new Laptop("Dell", 15, 60000));
		lap.add(new Laptop("Asus", 12, 45000));
		lap.add(new Laptop("Apple", 32, 90000));
		
		Collections.sort(lap);
		for(Laptop l:lap) {
			System.out.println(l);
		}

	}

}
