/**
 * @author patrick
 * source code solution for programming challenge - 5
 * chapter 3 | startingOutWithJava 7/e (Tonny Gaddis)
 */
import java.util.Scanner;

public class MassAndWeight
{
    public static void main(String[] args)
    {
        // create a scanner object that will read input from the keyboard
        Scanner keyboard = new Scanner(System.in); 

        double var_mass,                // will hold the mass of an object
               var_weight;              // will hold the calculated weight

        // prompt for input
        System.out.print("Enter the mass of an object (in kilograms): ");
        var_mass = keyboard.nextDouble(); 

        // calculate weight
        var_weight = var_mass * 9.8;


        // display the result result based on the following conditions
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
