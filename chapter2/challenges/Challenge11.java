package chapter2.challenges;
import javax.swing.JOptionPane;

/**
 * @author patrick
 * source code solution for programming challenge - 11 
 * chapter 2 | StartingOutWithJava 7/e (Tony Gaddis).
 *
 */

public class Challenge11 
{
	public static void main(String[] args)
	{
		double retailPrice,  // declare variable to hold retail price
			   profit;       // declare variable to hold profit (40% = 0.4)
		String userInput;
		
		// Ask ther user to enter retail price of circuit board
		String prompt = "Enter retail price of a circuit board";
		userInput = JOptionPane.showInputDialog(prompt);
		
		// Convert userInput from string to double
		retailPrice = Double.parseDouble(userInput);
		
		// Calculate 40% profit on retail price entered
		profit = retailPrice * 0.4;

		// Print the profit earned
		String profitEarned = "40% profit earned is: K" + profit;
		JOptionPane.showMessageDialog(null, profitEarned);
	}

}
