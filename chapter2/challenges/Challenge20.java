package chapter2.challenges;
import java.util.Scanner;

/**
 * source code solution for programming challenge - 20 
 * chapter 2 | StartingOutWithJava 7/e (Tony Gaddis).
 * 
 */
public class Challenge20 
{
	public static void main(String[] args)
	{
        Scanner keyboard = new Scanner(System.in);
        int numOfGrapevines,
            lengthOfRow,            //feet
            spaceBetweenVines,
            spaceUsedByEndPost;

        System.out.println("Hi, This program calculates the number of grapevines that will fit in the row!!");

        // Prompt the user to enter the required details
        System.out.print("\nEnter the length of the row: ");
        lengthOfRow = keyboard.nextInt();
	
        // Consume the newline character in the keyboard's buffer
        //keyboard.nextInt();

        System.out.print("Enter the amount of space used by an end-post: ");
        spaceUsedByEndPost = keyboard.nextInt();

        // Consume the newline character in the keyboard's buffer
        //keyboard.nextInt();

        System.out.print("Enter the amount space between the vines: ");
        spaceBetweenVines = keyboard.nextInt();

        // compute the number of grapevines that will fit in the row
        // formula: V = (lengthOfRow - 2(spaceUsedByEndPost)) / spaceBetweenVines
        numOfGrapevines = (lengthOfRow - 2*(spaceUsedByEndPost)) / spaceBetweenVines;

        System.out.println("\nThe number of grapevines that will fit in the row = " + numOfGrapevines);

        keyboard.close();
	}

}
