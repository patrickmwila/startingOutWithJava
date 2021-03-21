package chapter2.challenges;
/**
 * @author patrick
 * source code solution for programming challenge - 16 
 * chapter 2 | StartingOutWithJava 7/e (Tony Gaddis).
 */
public class Challenge16
{
	public static void main(String[] args)
	{
		int customers = 12467,
		    NumOfCustomersWhoPurchaseDrink,
		    NumOfCitrusCustomers;
		
		// compute approximate number of customers in the survey who purchase
		// one or more energy drinks per week
		NumOfCustomersWhoPurchaseDrink = (int)(customers * 0.14);
		
		// compute  number of customers in the survey who prefer
		// citrus-flavored energy drinks
        NumOfCitrusCustomers = (int)(NumOfCustomersWhoPurchaseDrink * 0.64);

        // display the results
        System.out.println("Number of customers who purchase drinks: " + NumOfCustomersWhoPurchaseDrink);
        System.out.println("Number of customers who like citrus drinks: "+ NumOfCitrusCustomers);

	}

}
