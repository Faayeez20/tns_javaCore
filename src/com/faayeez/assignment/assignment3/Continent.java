package com.faayeez.assignment.assignment3;

//Continent.java
public class Continent {
	
	private String name;
	private double area;
	private long populationCount;
	private int numberOfCountries;
	
	 public Continent(String name, double area, long populationCount, int numberOfCountries) {
	        this.name = name;
	        this.area = area;
	        this.populationCount = populationCount;
	        this.numberOfCountries = numberOfCountries;
	        
	    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public long getPopulationCount() {
		return populationCount;
	}

	public void setPopulationCount(long populationCount) {
		this.populationCount = populationCount;
	}

	public int getNumberOfCountries() {
		return numberOfCountries;
	}

	public void setNumberOfCountries(int numberOfCountries) {
		this.numberOfCountries = numberOfCountries;
	}

	@Override
	public String toString() {
		 return "Continent: " + name + ", Area: " + area + " sq km, Population: " + populationCount+ "Number of Countries: " +numberOfCountries;
	}
	
	


}
