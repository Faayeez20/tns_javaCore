package com.faayeez.assignment.assignment3;

//State.java
public class State extends Country {
    private String governor;
    private String largestCity;
    private double stateGdp; 
  
    public State(String name, double area, long populationCount, int numberOfCountries, String president, String primaryLanguage, String nationalCurrency, String governor, String largestCity, double stateGdp)
    {
        super(name, area, populationCount, numberOfCountries, president, primaryLanguage, nationalCurrency);
        this.governor = governor;
        this.largestCity = largestCity;
        this.stateGdp = stateGdp;

    }

	public String getGovernor() {
		return governor;
	}

	public void setGovernor(String governor) {
		this.governor = governor;
	}

	public String getLargestCity() {
		return largestCity;
	}

	public void setLargestCity(String largestCity) {
		this.largestCity = largestCity;
	}

	public double getStateGdp() {
		return stateGdp;
	}

	public void setStateGdp(double stateGdp) {
		this.stateGdp = stateGdp;
	}

	@Override
	public String toString() {
	    return super.toString() + ", Governor: " + governor + ", Largest City: " + largestCity + ", State GDP: " + stateGdp;
	}
    
}