package chapter2.challenges;
/**
 * @author patrick
 * source code solution for programming challenge - 19
 * chapter 2 | StartingOutWithJava 7/e (Tony Gaddis).
 * This program needs to be modified after studying control structures!! 
 */

public class Challenge19 
{
	public static void main(String[] args)
	{
		String name = "Joe";
		int sharesPurchased = 1000,
		    sharesSold = 1000; 
		
		double purchasePricePerShare = 32.87,
			   totalPurchasePrice,
			   sellingPricePerShare = 33.92,
			   totalSellingPrice,
			   commissionOnPurchase,   //0.02
			   commissionOnSale,       //0.02
			   totalAmountSpent,
			   totalAmountEarned,
			   totalCommissionSpent;     
		
		// Compute the total's
		totalPurchasePrice = sharesPurchased * purchasePricePerShare;
		commissionOnPurchase = totalPurchasePrice * 0.02;
		
		totalSellingPrice = sharesSold * sellingPricePerShare;
		commissionOnSale = totalSellingPrice * 0.02;

		totalAmountSpent = totalPurchasePrice + commissionOnPurchase + commissionOnSale;
		totalAmountEarned = totalSellingPrice - totalAmountSpent;
		totalCommissionSpent = commissionOnPurchase + commissionOnSale;
		
		// Display the output to the screen
		System.out.println("Amount " + name + " spent on share purchase: $" + totalPurchasePrice);
        System.out.println("Amount " + name + " spent on purchase commission: $" + commissionOnPurchase);
        System.out.println("Amount " + name + " earned on selling shares : $" + totalSellingPrice);
        System.out.println("Amount " + name + " spent on sales commission: $" + commissionOnSale);
        System.out.println("Total Amount " + name + " spent on commission: " + totalCommissionSpent);
        System.out.println("Total Amount " + name + " spent: " + totalAmountSpent);
        System.out.println("Profit " + name + " made: " + totalAmountEarned);

	}

}
