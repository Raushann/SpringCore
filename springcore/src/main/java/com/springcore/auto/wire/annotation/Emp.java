package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired    // it is calling internally byType if more than one bean then use qualifier annotation
	@Qualifier("temp1")  // to call specific bean
	private Address address;

	public Address getAddress() {
		return address;
	}
   //@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	//@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	
	

}