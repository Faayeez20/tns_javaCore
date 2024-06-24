package com.faayeez.assignment.assignment3;

//Country.java
public class Country extends Continent {
    private String president;
    private String primaryLanguage;
    private String nationalCurrency;
   
    public Country(String name, double area, long populationCount, int numberOfCountries, String president, String primaryLanguage, String nationalCurrency)
    {
        super(name, area, populationCount, numberOfCountries);
        this.president = president;
        this.primaryLanguage = primaryLanguage;
        this.nationalCurrency = nationalCurrency;
    
    }

	public String getPresident() {
		return president;
	}

	public void setPresident(String president) {
		this.president = president;
	}

	public String getPrimaryLanguage() {
		return primaryLanguage;
	}

	public void setPrimaryLanguage(String primaryLanguage) {
		this.primaryLanguage = primaryLanguage;
	}

	public String getNationalCurrency() {
		return nationalCurrency;
	}

	public void setNationalCurrency(String nationalCurrency) {
		this.nationalCurrency = nationalCurrency;
	}

	@Override
	public String toString() {
		 return super.toString() + ", President: " + president + ", Primary Language: " + primaryLanguage + ", National Currency: " + nationalCurrency;
	}
    
    
}