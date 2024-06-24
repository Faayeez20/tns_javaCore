package com.faayeez.assignment.assignment3;

public class MultilevelInheri {
	public static void main(String[] args) {
        // Creating Continent objects
        Continent asia = new Continent("Asia", 44579000, 4641054775L, 48);

        // Creating Country objects
        Country india = new Country("India", 3287263, 1393409038L, 1, "Droupadi Murmu", "Hindi", "Indian Rupee");

        // Creating State objects
        State maharashtra = new State("Maharashtra", 307713, 123144223L, 1, "Narendra Modi", "Marathi", "INR", "Eknath Shinde", "Mumbai", 520.5);

        // Printing Continent objects
        System.out.println(asia);

        // Printing Country objects
        System.out.println(india);

        // Printing State objects
        System.out.println(maharashtra);
    }

}
