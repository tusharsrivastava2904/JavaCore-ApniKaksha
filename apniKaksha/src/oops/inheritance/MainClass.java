package oops.inheritance;

public class MainClass {

	public static void main(String[] args) {
		
//		//Initial code for inheritance example and method overriding goes here.
//		
//		Teacher t = new Teacher();
//		
//		t.name = "Mr. Harry";
//		t.eat();				//methods override
//		t.walk();				
//		t.teach();
//		
//		Singer singer = new Singer();
//		
//		singer.name = "Oprah";
//		singer.eat();
//		singer.walk();
//		singer.sing();
		
//		//code for upcasting/implicit casting goes here.
//		//upcasting helps us to replace a Child obj for a Parent obj 
//		//this code runs automatically/implicitly as Child obj contains all properties of Parent
//		Teacher t = new Teacher();
//		
//		Person p = t; 			//this is fine because Teacher is a Person
		
		
//		//code for downcasting/explicit casting goes here.
//		//downcasting helps us to replace a Parent obj for a Child obj
//		//this needs to be explicitly defined as Parent obj does not contain properties of Child obj 
//		Teacher t1 = new Teacher();
//		Person p = t1;
//		
//		Teacher t = p;			//this cannot be done as you need to explicitly
//								// state that this object is belongs to Teacher
//		Teacher t = (Teacher) p;

		
//		//we use the keyword instanceof to check if an obj belongs to a class
//		boolean yt = p instanceof Person;
//		boolean yf = p instanceof Singer;
//		System.out.println(yt);
//		System.out.println(yf);
		
//		super keyword and constructor initializing using super keyword, sample goes here:
		Teacher t1 = new Teacher("Mr.Harry"); 		//initializing with name as it was required by the constructors of
													// both classes i.e: Person and Teacher.
//		t1.name = "Mr. Harry";			//we require to define name explicitly if we don't have a constructor
		t1.eat();		//this will call super.eat() first and the t1.eat()
		
	}

}
