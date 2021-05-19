package chapter2.challenges;
import java.util.Scanner;
/**
 * @author patrick
 * 
 * source code solution for programming challenge - 13 
 * chapter 2 | StartingOutWithJava 7/e (Tony Gaddis).
 *
 * Algorithm
 * Enter the charge for the meal (variable needed)
 * compute 6.75 % taxAmount on mealCharge (taxAmount)
 * compute halfBill (tax + charge for meal) 
 * compute 0.2 % tipAmount on halfBill
 * compute totalBill
 * 
 */

public class Challenge13 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		// Declare all variables to be used
		double mealCharge,
		       taxAmount,
		       halfBill,
		       tipAmount,
		       totalBill;
		
		// Prompte for input
		System.out.print("Enter the charge for the meal: ");
		mealCharge = keyboard.nextDouble();
		
		// Compute taxAmount and halfBill
		taxAmount = mealCharge * 0.0675;
		
		halfBill = mealCharge + taxAmount;
		
		// Compute tipAmount and totalBill
		tipAmount = halfBill * 0.2;
		
		totalBill = halfBill + tipAmount;
		
		// Display the results
		System.out.println("\nMeal charge: K" + mealCharge);
		System.out.println("Tax: K" + taxAmount);
		System.out.println("Tip: K" + tipAmount);
		System.out.println("Total bill: K" + totalBill);
		
		keyboard.close();
	}

}
