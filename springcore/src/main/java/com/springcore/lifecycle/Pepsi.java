package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//implementing bean LifeCycle using Interfaces (InitializingBean, DisposableBean)
public class Pepsi implements InitializingBean, DisposableBean{
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
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// it works like init method
		
		System.out.println("Taking Pepsi : init");
		
	}

	public void destroy() throws Exception {
		// it works like destroy method
		System.out.println("Going to put bottle back to shop : destroy");
		
	}
	
	

	
}
