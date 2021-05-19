package chapter2.challenges;
/**
 * @author patrick
 * source code solution for programming challenge - 15 
 * chapter 2 | StartingOutWithJava 7/e (Tony Gaddis).
 *
 */

public class Challenge15 
{
	public static void main(String[] args)
	{
		int shares = 600; 			//declare and initializse shares to 600

		double stockPrice = 21.77,  // declare and initialize stockprice to 21.77
			   //declare remaining variables
			   amountPaid,        
			   commission,
			   totalAmountPaid;
		
		// compute the amount to paid 
		amountPaid = shares * stockPrice;
		commission = amountPaid * 0.02;
		totalAmountPaid = amountPaid + commission;
		
		//display the result to the console
		System.out.println("Shares bought: " + shares);
		System.out.println("Amount paid: $" + amountPaid);
		System.out.println("Commission: $" + commission);
		System.out.print("Total amount paid: $" + totalAmountPaid);
	}

}
