package chapter2.challenges;
import java.util.Scanner;
/**
 * @author patrick
 * source code solution for programming challenge - 12 
 * chapter 2 | StartingOutWithJava 7/e (Tony Gaddis).
 *
 */

public class Challenge12 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String userFavouriteCity; // Class reference variable to store user's favourite city
		
		// Prompt the user for favourite city
		System.out.print("Enter your favourite city: ");
		userFavouriteCity = keyboard.nextLine();
		
		// Print the result in the format specified in the challenge question
		System.out.println("\nCharacters in city: " + userFavouriteCity.length());
		System.out.println("City name in uppercase: " + userFavouriteCity.toUpperCase());
		System.out.println("City name in lowercase: " + userFavouriteCity.toLowerCase());
		System.out.print("First character in city: " + userFavouriteCity.charAt(0));
		
		keyboard.close();
	}

}
