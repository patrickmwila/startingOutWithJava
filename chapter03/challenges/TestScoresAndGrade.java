/**
 * @author patrick
 * source code solution for programming challenge - 4
 * chapter 3 | startingOutWithJava 7/e (Tonny Gaddis).
 */

import java.util.Scanner;

public class TestScoresAndGrade
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in); // create a scanner object

        // display purpose of program
        System.out.println("This program average's three test scores!");
        System.out.println("=========================================\n");

        // prompt user for input
        System.out.print("Enter your test 1 score: ");
        float var_test1 = keyboard.nextByte();

        System.out.print("Enter your test 2 score: ");
        float var_test2 = keyboard.nextByte();

        System.out.print("Enter your test 3 score: ");
        float var_test3 = keyboard.nextByte();

        // calculate the average of the 3 test scores
        float var_average = (float)((var_test1 + var_test2 + var_test3)/3);

        // display the result to the user
        if (var_average >= 90 && var_average <= 100)
        {
            System.out.printf("Your average test score is: %3.1f\n", var_average);
            System.out.println("\nTherefore you got an A");
        }

        else if (var_average >= 80 && var_average <= 89) 
        {
            System.out.printf("Your average test score is: %3.1f\n", var_average);
            System.out.println("\nTherefore you got a B");
        }

        else if (var_average >= 70 && var_average <= 79) 
        {
            System.out.printf("Your average test score is: %3.1f\n", var_average);
            System.out.println("\nTherefore you got a C");
        }
        else if (var_average >= 60 && var_average <= 69) 
        {
            System.out.printf("Your average test score is: %3.1f\n", var_average);
            System.out.println("\nTherefore you got a D");
        
        }
        else 
        {
            System.out.printf("Your average test score is: %3.1f\n", var_average);
            System.out.println("\nYou Failed!");
        }
    }
}
