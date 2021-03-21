package chapter2.challenges;
import java.util.Scanner;
/**
 * @author patrick
 * source code solution for programming challenge - 7 
 * chapter 2 | StartingOutWithJava 7/e (Tony Gaddis).
 * 
 * Algorithm
 * Enter amount of a purchase
 * Compute State sales tax (which is 4%)
 * Compute County Sales tax (Which is 2%)
 * Compute total sales tax
 * Compute total of Sales
 * Display purchase amount
 * Display state sales tax
 * Display County sales tax
 * Display total sales tax
 * Display total of the sale (amount of purchase + total sales tax)
 */
public class Challenge07 
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		// Declare variables corresponding to the algorithme above

		double purchasePrice,
		       stateSalesTax,
		       countySalesTax,
		       totalSalesTax,
		       totalSalePrice;

		//Prompt the user to enter purchase price
		System.out.print("Enter purchase price: ");
		purchasePrice = keyboard.nextDouble();
		
		//Compute the state sales tax  0.04
		stateSalesTax = purchasePrice * 0.04;
		
		//Compute the county sales tax 0.02
		countySalesTax = purchasePrice * 0.02;
		
		//Compute total sales tax
		totalSalesTax = stateSalesTax + countySalesTax;
		
		//Compute total of sales
		totalSalePrice = purchasePrice + totalSalesTax;
		
		//Display all the details as designed by the algorithm
		System.out.println("\nPurchase price: K" + purchasePrice);
		System.out.println("State tax: K" + stateSalesTax);
		System.out.println("County tax: K" + countySalesTax);
		System.out.println("Total sales tax: K" + totalSalesTax);
		System.out.print("Total sale price: K" + totalSalePrice);
		
		keyboard.close();
	}

}
