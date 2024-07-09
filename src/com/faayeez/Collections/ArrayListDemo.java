package com.faayeez.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList listone = new ArrayList();
		
		System.out.println("Check wheather list is empty or not : "+ listone.isEmpty());
		listone.add(2);
		listone.add('a');
		listone.add("Mumbai");
		listone.add(22.5);
		System.out.println(listone);
		System.out.println("The size of the list is  : "+ listone.size());
		System.out.println("The element at the particular location :  "+ listone.get(2));
		System.out.println("Check element is present or not : "+ listone.contains(2.5));
		
//		Collections.sort(listone); // not generic
		System.out.println("\n");
		
		ArrayList<String> ob = new ArrayList<String>(); // generic type
		ob.add("Mumbai");
		ob.add("Delhi");
		ob.add("Banglore");
		System.out.println(ob);
		Collections.sort(ob);
		
		Iterator<String> i = ob.iterator();
		while(i.hasNext()) {
			String nm = i.next();
			System.out.println(nm);
		}
		
		

	}

}
