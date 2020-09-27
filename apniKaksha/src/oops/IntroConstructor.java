package oops;

class Vehicle{
	int wheels;						//default value of int is 0
	int headlights;
	String color;					//case of Constructor Overloading
	
	Vehicle(int wheels){					//parameter is passed of those states only which may change over objects
											//we can use a third variable as parameter name also
		
		this.wheels = wheels;				//state names can be used as parameters using 'this' keyword that carries reference to the object
		
		headlights = 2;						//setting default value of head lights because it is constant in any vehicle
	}
	
	Vehicle(int wheels, String color){
		this.wheels = wheels;
		this.color = color;
		headlights = 2;
	}
}

public class IntroConstructor {

	IntroConstructor(){						//no argument constructor
		
		System.out.println("The object is created");
	}
	
	public static void main(String[] args) {

		Vehicle car = new Vehicle(4);
		Vehicle scooterVehicle = new Vehicle(2);				//object will be defined only when you pass the numWheels while creating them
		Vehicle eRikshaw = new Vehicle(3,"Yellow");
	
		System.out.println(car.wheels + "wheels");
		System.out.println(scooterVehicle.wheels + "wheels");
		System.out.println("Wheels: " +eRikshaw.wheels + " Color: " +eRikshaw.color);
		
	}

}
