/**
 * @author patrick
 * source code solution for programming challenge - 5
 * chapter 3 | startingOutWithJava 7/e (Tonny Gaddis)
 */

import java.util.Scanner;

public class MassAndWeight
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in); // create a scanner object

        // prompt for input
        System.out.print("Enter the mass of an object (in kilograms): ");
        double var_mass = keyboard.nextShort(); // get input and store it in var_mass

        // calculate weight
        double var_weight = var_mass * 9.8;

        // display the result
        if (var_weight > 1000)
        {
            System.out.printf("The object is too heavy! It's weight = %.1fN\n",
                    var_weight);
        }
        else if (var_weight < 10)
        {
            System.out.printf("The object is too light! It's weight = %.1fN\n", 
                    var_weight);
        }
        else 
        {
            System.out.printf("The object's weight is: %.1fN\n", var_weight);
        }
    }
}
