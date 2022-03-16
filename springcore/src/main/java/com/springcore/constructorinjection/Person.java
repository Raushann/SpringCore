package com.springcore.constructorinjection;

public class Person {
	
	private String name;
	private int personId;
	private Certi certificate;
	
	public Person(String name, int personId, Certi certificate) {
		this.name = name;
		this.personId = personId;
		this.certificate=certificate;
	}
	
	
	
	@Override
	public String toString() {
		return  this.name + " : " + this.personId+ "{ "+this.certificate.name+" }" ;
	}
	
	
	
	
	
	
	
	

}
