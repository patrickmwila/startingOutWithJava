package chapter2.challenges;
/**
 * @author patrick
 * source code solution for programming challenge - 6 
 * chapter 2 | StartingOutWithJava 7/e (Tony Gaddis).
 */
public class Challenge06 
{
	public static void main(String[] args)
	{
		int totalNumOfAcres, 		// declare total of acres to the result of a calculation
			oneAcre = 43560,		// declare and initialize one acre equivalence
			tractOfLand = 389767;   // declare and initialize the respective land to determine the number of acres available
		
			
			// calculate
			totalNumOfAcres = tractOfLand / oneAcre;
			
			// Display details
			System.out.println("Tract of land = " + tractOfLand + " square feet");
			System.out.println("One Acre = " + oneAcre + " square feet");
			System.out.println("Total Acres from tract of land = " + totalNumOfAcres + " square feet");
		
	}

}
