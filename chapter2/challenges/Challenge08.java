package chapter2.challenges;
import javax.swing.JOptionPane;

/**
 * @author patrick
 * source code solution for programming challenge - 8 
 * chapter 2 | StartingOutWithJava 7/e (Tony Gaddis).
 * 
 */
public class Challenge08 
{
	public static void main (String[] args)
	{
		int numOfCookies,        // variable to hold the number of cookies ate by the user
		    totalNumOfCalories;  // variable to hold the total number of calories consumed by the end user based on the number calories ate
		
		// prompt class variable allowing us to store the message to pass to the JOptionPane class
		String prompt = "Enter the number of cookies you ate this morning";
		 
		// use JOptionPane class to get input from the user and store it in a variable
		String cookies = JOptionPane.showInputDialog(prompt);
		
        // convert the number of calories entered by the user from string to int		
		numOfCookies = Integer.parseInt(cookies);
		
		// compute number of calories consumed | serving equals 300 calories
		totalNumOfCalories = numOfCookies * 300;
		
		// Display the result to the user using JOptionPane
		String caloriesConsumed = "You have consumed about " + totalNumOfCalories + " calories today.";
		JOptionPane.showMessageDialog(null, caloriesConsumed);
	}

}
