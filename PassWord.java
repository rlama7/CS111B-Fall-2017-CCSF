/**
 * TemplateProgram --- template program to print "Hello World".
 * @author    	Ratna Lama
 * @version   	1.0
 * @since     	09/14/2017
*/

import java.util.Random;
import java.util.Scanner;
public class PassWord {
	
   /**
   * Prints out "Hello World" 
   * and the command line arguments.
   * @param arg A string array containing 
   * the command line arguments.
   * @exception Any exception
   * @return No return value.
   */
      public static void main (String[] arg){

         String name;
         String sixDigitStr;
         int sixDigitDate;
         int randomNum;
         final int max = 99; // max is constant

         // Generate a random number between  1 and 100 exclusive of 100
         randomNum = 1 + (int)(Math.random() * max);

         System.out.println();   		
         System.out.println("Lama's Password Generator");
         System.out.println();

   		 Scanner scan = new Scanner (System.in);
         System.out.print("Enter Your First Name: ");
         name = scan.nextLine();

         System.out.print("Enter 6-Digit Date: ");
         sixDigitDate = scan.nextInt();
         sixDigitStr = Integer.toString(sixDigitDate); // converts Integer to String
         String junk = scan.nextLine();


         // Prints out Name and the first two letters of name
         //System.out.println();
         //System.out.println("Name you entered is: " + name);

         // String substring(int startIndex, int endIndex)
         System.out.println();
         System.out.println("----------------------------------");
         System.out.println("1. First two letters of " + name + " is: "+ name.substring(0,2));
         System.out.println("----------------------------------");

         // Prints . (period)
         System.out.println("2. Prints period: (.)");
         System.out.println("-----------------------------");

         // Prints random number between 1 to 100 exclusive of 100
         System.out.println("3. Random number between 1-99 is: " + randomNum);
         System.out.println("----------------------------");

         // Prints last four digits from 6-digit Date
         //System.out.println("6-Digit date you entered is: " + sixDigitDate);
         //System.out.println("-------------------");

         // String substring(int startIndex, int endIndex)
         //System.out.println("Substring of " + sixDigitDate + 
         //   " that contains last four letters ONly: " + sixDigitStr.substring(2,5));
         //System.out.println("-------------------");

         // Converts sixDigitDate integer data type to String data type
         //sixDigitStr = Integer.toString(sixDigitDate);
         System.out.println("4. Last four digits of 6 digit-date is: " + Math.abs(sixDigitDate % 10000));
         System.out.println("-------------------------");



         // Generates password that combines
         // first two letters of name followed by . (period)
         // next followed by 1-2 random numbers between 1 to 100
         // next followed by last four digits from user entered 6-digit date  
         System.out.println();
         System.out.println("***************************************");
         System.out.println("*                                     *");
         System.out.println("*     Your Password is: " + name.substring(0,2) +"."
            + randomNum + Math.abs(sixDigitDate % 10000) + ("     *"));
         System.out.println("*                                     *");
         System.out.println("***************************************");
         

  } // end main
  
} // end classs


































