package chapter2.challenges;
import java.util.Scanner;

/**
 * @author patrick
 * 
 * source code solution for programming challenge - 18
 * chapter 2 | StartingOutWithJava 7/e (Tony Gaddis).
 */

public class Challenge18 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String userName,
		       city,
		       university,
		       profession,
		       animalType,
		       petsName;

		int age;
		
		// prompt the user to enter the required details
		System.out.print("Enter your name: ");
        userName = keyboard.nextLine();
        
        System.out.print("Enter your age: ");
        age = keyboard.nextInt();
        
        // clear keyboard buffer
        keyboard.nextLine();

		System.out.print("Enter your city: ");
        city = keyboard.nextLine();

		System.out.print("Enter name of your University or College: ");
        university = keyboard.nextLine();

		System.out.print("Enter your profession: ");
        profession = keyboard.nextLine();
        
		System.out.print("Enter animal type: ");
        animalType = keyboard.nextLine();

		System.out.print("Enter your pet's name: ");
        petsName = keyboard.nextLine();

        // Display the story
        
        System.out.println("\nThere was once a person named " + userName + " who lived in " + city + "." +
        		           "\nAt the age of " + age + ", \n" + userName + " went to University at " + university + "." + userName + " graduated and " + 
        		           "\nwent to work as a \n" + profession + ". Then, " + userName + " adopted a " + animalType + " named \n" + 
        		           petsName + ". They both lived \nhappily ever after!"
        		          );
        
		keyboard.close();
	}

}
