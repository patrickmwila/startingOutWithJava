/**
 * Author     : Patrick Mwila
 * Date       : 17/07/2021
 * Description: A program that calculates the sum of numbers from 1 up to n.
 *
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class _01_SumOfNumbers
{
    public static void main(String[] args)
    {
        // create a Scanner object that reads input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // prompt for user input
        int var_input = 0, // will hold user input
            var_sum   = 0; // accumulator to store sum of numbers

        System.out.print("Enter a positive nonzero integer: ");

        try
        {
            var_input = keyboard.nextInt();

            if (var_input <= 0)
            {
                System.out.println("Run the program again and enter a " + 
                           "positive nonzero integer!" );
                System.exit(0);
            }

            // a loop to calculate the sum of numbers from 1 up to n (var_input)
            for (int count = 1; count <= var_input; count++)
            {
                // set accumulator value to accumulator + count
                var_sum += count;
            }
            System.out.println("Sum of natural numbers from 1 up to " + 
                       var_input + " is " + var_sum);
        }

        catch (InputMismatchException ex)
        {
            System.out.println("Invalid input!");
        }

        keyboard.close(); // stop reading input from keyboard
    }
}
