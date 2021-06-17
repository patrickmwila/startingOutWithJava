/**
 * author @patrick
 * The for loop is ideal for performing a known number of
 * iterations.
 * A loop that repeats a specific number of times is known 
 * as a count-controlled loop
 *
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class CountControlled
{
    public static void main(String[] args)
    {
        Scanner keyboard  = new Scanner(System.in);
        int var_int = 0;

        try
        {
            System.out.print("Enter an integer: ");
            var_int = keyboard.nextInt();
        }
        catch (InputMismatchException ex)
        {
            System.out.println("Invalid input.");
        }

        if (var_int == 0)
        {
            System.out.println("Run the program and enter an integer greater than 0!");
        }

        else if (!(var_int == 0))
        {
            System.out.printf("Even numbers from 2 up to %d\n", var_int);
            for (int count = 2; count <= var_int; count += 2)
            {
                System.out.print(count + " ");
            }
        }
    }
}
