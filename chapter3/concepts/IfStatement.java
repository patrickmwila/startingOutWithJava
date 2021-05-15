import java.util.Scanner;

/**
 * @author patrick
 * 
 * CONCEPT: The if statement is used to create a decision structure,
 * which allows a program to have more than one path of execution. The
 * if statement causes one or more statements to execute only when a
 * boolean expression is true .
 *
 */

public class IfStatement 
{
	public static void main(String[] args)
	{
		// Creates a scanner object in memory and reference it by keyboard
		Scanner keyboard = new Scanner(System.in);
		
		//This program calculates the average of the three test scores of a student
		//Declare all variables to be used
		
		double score1,
			   score2,
			   score3,
			   average;
		
		System.out.println("This program averages 3 test scores");
		
		//Get the first score
		System.out.print("Enter score #1: ");
		score1 = keyboard.nextDouble();
		
		//Get the second score
		System.out.print("Enter score #2: ");
		score2 = keyboard.nextDouble();
		
		//Get the third score
		System.out.print("Enter score #3: ");
		score3 = keyboard.nextDouble();
		
		//Calculate  and display the average
		average = (score1 + score2 + score3) / 3.0 ;
		System.out.printf("\nThe average is: %2.1f", average);
        System.out.println("%");
		
		//If the average is higher than 95, congratulate the user
		if (average > 95.0)
			System.out.println("That's a great score!");
		
		keyboard.close();
	}
}
