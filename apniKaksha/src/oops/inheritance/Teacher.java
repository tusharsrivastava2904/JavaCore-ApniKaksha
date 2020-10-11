package oops.inheritance;

public class Teacher extends Person {
//This is the subclass of the parent class Person.
	
	//defining constructor for Teacher
	public Teacher(String name) {
		//name passed as parameter for constructor (non-default constructor!)
		super(name);		//Parent's constructor is called
		System.out.println("inside Teacher() constructor");
	}
	
	public void teach() {
		System.out.println(name + " is teaching"); 
	}
	
	//overriding the methods of parent class Person.
	public void eat() {
		super.eat();				//super keyword refers to the immediate parent class Person (==Person_obj.eat())
		System.out.println("teacher " + name + " is eating");
	}
	
	//overriding the methods of parent class Person.
	public void walk() {
		System.out.println("teacher " + name + " is walking");
	}
	
}
