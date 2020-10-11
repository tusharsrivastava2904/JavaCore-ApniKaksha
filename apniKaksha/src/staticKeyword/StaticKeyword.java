package staticKeyword;

import staticKeyword.A.B;
import staticKeyword.A.C;

public class StaticKeyword {

	public static void main(String[] args) {
		
		//A and B are tightly coupled. (non static nested class B)
		A objA = new A();
		A.B objB = objA.new B();	//We'd to make an obj of A before making an obj of B
		//instead of using A.B objB we could've import staticKeyword.A.B
		
		//A and C are loosely coupled. (static nested class C) 
		C objC = new A.C();			//We directly can make objC without making an obj of A
	}
	
}
