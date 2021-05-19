/**
 * Author     : Patrick Mwila
 * Description: A program that uses the conditional operator 
 *             (booleanExpression ? value1 : value2;)
 */

import java.util.Scanner;

public class ConditionalOperator
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        // The conditional operator is a shorthand of expressing a simple
        // if-else statement.
        // Read more about it's implementation to understand the code below
        // IT'S SIMPLE!

        System.out.printf("Enter your test score: ");
        byte userTestScore = keyboard.nextByte();


        System.out.print("You have: " + 
                (userTestScore > 45 ? "Passed\n": "Failed\n"));
    }
}
