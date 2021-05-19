/**
 * @author patrick
 * source code solution for programming challenge - 3
 * chapter 3 | startingOutWithJava 7/e (Tonny Gaddis).
 */
import java.util.Scanner; // import the Scanner class

public class BodyMassIndex
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in); // create a scanner object
        final double CONVERSION_FACTOR = 703.0;
        
        // display the purpose of the program
        System.out.println("This program displays a person's body mass index "+ 
                "(BMI).");
        System.out.println("------------------------------------------------");
        // prompt for input
        System.out.printf("\nEnter your weight (in pounds): ");
        double var_weight = keyboard.nextDouble();

        System.out.printf("Enter your height (in inches): ");
        double var_height = keyboard.nextDouble();

        // calculate BMI
        // NB: BMI = Weight x 703/Height^2
        //
        var_height = var_height*var_height;
        var_height = CONVERSION_FACTOR/var_height;

        double var_BMI = var_weight * var_height;

        // display user's BMI
        if(var_BMI < 18.5)
        {
            System.out.printf("Your BMI is %.1f, you're underweight!\n", var_BMI);
        }
        else if(var_BMI >= 18.5 && var_BMI <= 25)
        {
            System.out.printf("Your BMI is %.1f, your weight is optimal!\n", var_BMI);
        }
        else
        {
            System.out.printf("Your BMI is %.1f, you're overweight!\n", var_BMI);
        }

        System.out.println("\n----------------------------------------------");
    }
}
