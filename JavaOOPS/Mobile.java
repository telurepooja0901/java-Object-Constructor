package com.JavaOOPS;

public class Mobile
{
	 private String company;
	    private double price;
	    private int year;

	    public Mobile(String company, double price, int year) 
	    {
	        this.company = company;
	        this.price = price;
	        this.year = year;
	    }

	    public void displayInfo()
	    {
	        System.out.println("Company: " + company);
	        System.out.println("Price: " + price);
	        System.out.println("Year: " + year);
	    }

}
