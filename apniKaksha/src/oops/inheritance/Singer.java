package oops.inheritance;

public class Singer extends Person {
//This is the subclass of the parent class Person.
	
	//defining constructor for Teacher
		public Singer(String name) {
			//name passed as parameter for constructor (non-default constructor!)
			super(name);		//Parent's constructor is called
			System.out.println("inside Singer() constructor");
		}
	
	//overriding the methods of parent class Person.
	public void sing() {
		System.out.println(name + " is singing");
	}
	
	//overriding the methods of parent class Person.
	public void eat() {
		System.out.println("singer " + name + " is eating");
	}
	
	public void walk() {
		System.out.println("singer " + name + " is walking");
	}
	
}
