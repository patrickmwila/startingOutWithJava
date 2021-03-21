package chapter2.challenges;
import java.util.Scanner;
/**
 * @author patrick
 * 
 * source code solution for programming challenge - 14 
 * chapter 2 | StartingOutWithJava 7/e (Tony Gaddis).
 *
 */

public class Challenge14 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//declare male and female literal variables 
		double numOfMales,   
		       numOfFemales,
		       totalNum;
		
		//declare male and female percent variable to store result
		double malePercent,
		       femalePercent;
		
		//prompt for input
		System.out.print("Enter the number of males registered in class: ");
		numOfMales = keyboard.nextInt();
		
		System.out.println("Enter the number of females registered in class: ");
		numOfFemales = keyboard.nextInt();
		
		
		//compute percentage of males and females
        totalNum = numOfMales + numOfFemales;	
        
        malePercent = (numOfMales / totalNum) * 100;
        femalePercent = (numOfFemales / totalNum) * 100;
        
        //display the results to the console
        System.out.println("\nMale percentage in class: " + malePercent + "%");
        System.out.println("Female percentage in class: " + femalePercent + "%");

        keyboard.close();
	}

}
