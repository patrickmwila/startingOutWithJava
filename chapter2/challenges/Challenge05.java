package chapter2.challenges;
/**
 * @author patrick
 * source code solution for programming challenge - 5 
 * chapter 2 | StartingOutWithJava 7/e (Tony Gaddis).
 */

public class Challenge05 
{
	public static void main(String[] args)
	{
		double sales = 4.6000000000, // declare sales as double and initialize it a double literal of 4.6 million
			   incomeGenerated;      // declare incomeGenerated as double
		
		incomeGenerated = sales * 0.62; // calculate 62% income generated and store the result as double into the incomeGenerated double
		
		// Display the results
		System.out.println("Sales: $" + sales + " million");
		System.out.println("income: $" + incomeGenerated + " million");
	}


}
