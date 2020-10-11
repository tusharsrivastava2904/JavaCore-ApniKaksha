package oops.inheritance;

public class Person {
//This is the parent class
	
	public Person(String name) {
		this.name = name;  //constructor to be accessed from super(); of Teacher() constructor to get the name
		System.out.println("inside Person() constructor");
	}
	
	protected String name;
	//name being classified as protected is only accessible by the subclasses
	
	public void walk() {
		System.out.println("person " + name + " is walking");
	}
	
	public void eat() {
		System.out.println("person " + name + " is eating");
	}
	
}
