package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pespsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception//init kaa kaa krega
	{
		// init
		System.out.println("taking pepsi init");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("going to put bottle back to shop : distroy");
		
	}
	
	
}
