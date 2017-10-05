/**
 * Car.java  ---program to create a car class.
 * @author    	Ratna Lama
 * @version   	1.0
 * @since     	10/03/2017
*/

public class Car {

	// Declares class Car fields
	private int yearModel;
	private String make;
	private int speed;

	// Creates First constructor for Car Class Object
	// that initializes 0 to all the fields in the Car Class Object
	public Car() {
		yearModel = 0;
		make = "0";
		speed = 0;
	} // end Constructor

	// Creates Second constructor for Car Class Object
	// that takes 3 arguments and updates the fields for the Car Class Object
	public Car(int carYearModel, String carMake, int carSpeed) {
		yearModel = carYearModel;
		make = carMake;
		speed = carSpeed;
	}



	// Accelerates a car object of Car class
	public void accelerate() {
		speed += 5;
		System.out.println("Speed after acceleration is: " + this.speed + " mph");	
	}

	// Brakes a car object of Car Class
	public void brake() {
		speed -= 5;
		System.out.println("Speed after braking is " + this.speed + " mph");
	}

	// Gets yearModel
	public int getYearModel(){
		return yearModel;
	} // end method getYearModel

	// Gets make
	public String getMake(){
		return make;
	}

	// Gets speed
	public int getSpeed(){
		return speed;
	}

	// Returns a one-line description of Car Class as a string
      public String toString(){      	
      	return yearModel + "\t" + make + "\t" + speed;
      }


	/**
	* // Sets yearModel 
	* public void setYearModel(int yearModel){
	* 	this.yearModel = yearModel;
	* } // end method setYearModel
	* // Sets make
	* public void setMake(String make){
	* 	this.make = make;
	* } // end method make
	* // Sets speed
	* public void setSpeed(int speed){
	*	this.speed = speed;
	*}
	*/

	
  
} // end classs Car


































