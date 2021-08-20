package com.inheritance;

//inheriting teacher class
public class Principal extends Teacher{

	//method overriding(Polymorphism)
	public void display() {
		System.out.println("Teacher academy details");
	}
	
	//method overloading(Polymorphism)
	public void display(int count) {
		System.out.println("Total number of teacher available:"+count);
	}
}
