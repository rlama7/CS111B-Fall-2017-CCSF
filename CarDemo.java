/**
 * CarDemo.java --Driver program to Car class that instantiates a car object
 * and calls the accelerates and brake methods 3 times each. Each time
 * the method accelerate and brake is called, displays the speed of the car object.
 * @author    	   Ratna Lama
 * @version   	   1.0
 * @since     	   10/03/2017
*/

public class CarDemo {
	
   /**
   * Instantiates a car object, 
   * then calls the accelerate method 3 times. After each call to 
   * the accelerate method, gets the current speed of the car and 
   * displays it. 
   * Next calls the brake method 3 times. After each call to the brake
   * method get the current speed of the car and display it.
   * and the command line arguments.
   * @param arg A string array containing 
   * the command line arguments.
   * @exception Any exception
   * @return No return value.
   */

   public static void main (String[] arg){

      // Instantiates a Car object of Car class      
      // Object mustang of Car Class calls
      // the First Constructor that takes no arguments
      Car fordMustang = new Car();

      // Object of Car Class calls
      // the Second Constructor that takes 3 arguments
      Car corvetteStingray = new Car(2018, "Chevrolet", 100);
      Car shelbyCobra = new Car(1962, "Shelby American", 150);
      Car hudsonHornet = new Car(1955, "American Motors", 125);  

      // Displays yearModel, make and speed of each Car Class Object
      // then races each car.
      System.out.println();
      System.out.println("Displays Car Object's Profile using toString Concatenation: ");
      System.out.println(fordMustang);
      System.out.println();
      System.out.println("Displays Car Object's Profile using get accessor: ");
      System.out.println("Ford Mustang Profile: " 
         + fordMustang.getYearModel() + " " 
         + fordMustang.getMake()+ " " + fordMustang.getSpeed());
      System.out.println();
      System.out.println(">>> Accelerating Ford Mustang --->>>");
      System.out.println("Initial speed is: " + fordMustang.getSpeed() + " mph");
      fordMustang.accelerate();
      fordMustang.accelerate();
      fordMustang.accelerate();      
      System.out.println();
      System.out.println("<<<--- Braking Fod Mustang<<<");
      fordMustang.brake();
      fordMustang.brake();
      fordMustang.brake();
      System.out.println();

      // Displays yearModel, Make and topSpeed of an Object of Car Class
      System.out.println("Displays Car Object's Profile using toString Concatenation: ");
      System.out.println("Year" + "\t" + "Manufacturer" + "\t"+  "MaxSpeed");
      System.out.println(corvetteStingray);
      System.out.println(shelbyCobra);
      System.out.println(hudsonHornet);
      System.out.println();

      // Races Corvette Stingray
      System.out.println("Displays Car Object's Profile using get accessor: "); 
      System.out.println("Corvette Stingray Profile: " 
         + corvetteStingray.getYearModel() + " " 
         + corvetteStingray.getMake() + " " + corvetteStingray.getSpeed());
      System.out.println();
      System.out.println(">>> Accelerating Corvette Stingray --->>>");
      System.out.println("Initial speed is: " + corvetteStingray.getSpeed() + " mph");
      corvetteStingray.accelerate();
      corvetteStingray.accelerate();
      corvetteStingray.accelerate();
      
      System.out.println();
      System.out.println("<<<--- Braking Corvette Stingray<<<");
      corvetteStingray.brake();
      corvetteStingray.brake();
      corvetteStingray.brake();

   } // end main
  
} // end classs


































