package chapter2.challenges;
import java.util.Scanner;
/**
 * @author patrick
 * 
 * source code solution for programming challenge - 17
 * chapter 2 | StartingOutWithJava 7/e (Tony Gaddis).
 * 
 */
public class Challenge17 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double cupsOfSugar = 1.5,
		       cupsOfFlower = 2.75,
		       userCupsOfSugar,
		       userCupsOfFlower;
		
		int cookies = 48,
		    cupOfButter = 1, 
		    userCupOfButter,
		    userCookies;

		// prompt the user to enter number of cookies to be made
		System.out.print("How many cookies do you want to make: ");
		userCookies = keyboard.nextInt();

		// compute the ratio of each ingrediant
        userCupsOfSugar = (cupsOfSugar * userCookies) / cookies;
        userCupOfButter = (cupOfButter * userCookies) / cookies;
        userCupsOfFlower = (cupsOfFlower * userCookies)/ cookies;
      
        // print the result to the console
        System.out.println("You will need the following: \n");
        System.out.println(userCupsOfSugar + " cups of sugar");
        System.out.println(userCupOfButter + " cups of butter");
        System.out.println(userCupsOfFlower + " cups of flower");

		keyboard.close();
	}

}
