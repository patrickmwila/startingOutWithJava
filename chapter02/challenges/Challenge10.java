package chapter2.challenges;
import java.util.Scanner;
/**
 * @author patrick
 * source code solution for programming challenge - 10 
 * chapter 2 | StartingOutWithJava 7/e (Tony Gaddis).
 *
 */

public class Challenge10 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in); // revise reference variable and behaviour of scanner methods

		double testOne,
		       testTwo,
		       testThree,
		       testAverage;
		
		// Prompt the user to enter test scores
		System.out.print("Enter test one score: ");
		testOne = keyboard.nextDouble();
		
		System.out.print("Enter test two score: ");
		testTwo = keyboard.nextDouble();
		
		System.out.print("Enter test three score: ");
		testThree = keyboard.nextDouble();
		
		// Calculate the average of the three tests
		testAverage = (testOne + testTwo + testThree) / 3;
		
		// Print the results to the console
		System.out.println("\nTest one score: " + testOne + " %");
		System.out.println("Test two score: " + testTwo + " %");
		System.out.println("Test three score: " + testThree + " %");
		System.out.print("Average score: " + testAverage + " %");

		keyboard.close();
	}

}
