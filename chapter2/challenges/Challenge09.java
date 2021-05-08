package chapter2.challenges;
import java.util.Scanner;
/**
 * @author patrick
 * source code solution for programming challenge - 9 
 * chapter 2 | StartingOutWithJava 7/e (Tony Gaddis).
 */

public class Challenge09 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double mpg,              // variable to store miles per gallon result
		       milesDriven,      // variable to hold double literal of milesDriven
		       gallonsOfGasUsed; // variable to hold double literal of gallons of gas used
		
		// Ask the user to enter number of miles driven
		System.out.print("Enter the number of miles driven: ");
		milesDriven = keyboard.nextDouble();

		// Ask the user to enter amount of gas used
		System.out.print("Enter the amount of gallons of gas used: ");
		gallonsOfGasUsed = keyboard.nextDouble();
		
		// calculate the miles per gallon
		mpg = milesDriven / gallonsOfGasUsed;

		// Print the result to the console
		System.out.println("The car's miles per gallon is: " + mpg + "mpg .");
		keyboard.close();
	}
	
}
