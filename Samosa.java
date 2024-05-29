package com.springcore.lifecycle;
//this is bean class
public class Samosa {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		
		System.out.println("setting price");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	public void init() {
		System.out.println("inside inint method");
	}
	
	public void destroy() {
		
		System.out.println("inside destroy method");
	}

}
