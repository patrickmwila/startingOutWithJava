/**
 * Author     : Patrick Mwila
 * Date       : 15-08-2021
 * Description: A program that predicts the size of a population of organisms.
 */
import java.util.Scanner;

public class _09_Population
{
    public static void main(String[] args)
    {
        // create a Scanner object -- used to get input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // declare variables to be used...
        int initial_organisms, days;
        double population, percent_increase;
        
        // prompt for user input...
        System.out.print("\nEnter the starting number of organisms: ");
        initial_organisms = keyboard.nextInt();

        // make sure the initial_organisms >= 2
        while (initial_organisms < 2)
        {
            System.out.println("\nStarting number of organisms must be >= 2!");
            System.out.print("Enter the starting number of organisms: ");
            initial_organisms = keyboard.nextInt();
        }
        
        // set the current population to initial_organisms
        population = initial_organisms;

        System.out.print("\nEnter the average daily population increase " + 
                         "\nas a percentage (e.g 0.5 for 50%): ");
        percent_increase = keyboard.nextDouble();

        // make sure the percent_increase is not negative
        while (percent_increase < 0)
        {
            System.out.println("\nPercentage cannot be negative!");
            System.out.print("Enter a valid value for population increase: ");
            percent_increase = keyboard.nextDouble();
        }

        System.out.print("\nEnter the number of day's the organisms are" + 
                         "\nallowed to multiply: ");
        days = keyboard.nextInt();

        // make sure the number of days is atlease 1
        while (days < 1)
        {
            System.out.println("\nNumber of day's must be atleast 1: ");
            System.out.print("Enter a valid number for days: ");
            days = keyboard.nextInt();
        }

        System.out.println();   // blank line for readability 
        // use a loop to display the size of population for each day
        for (int day = 1; day <= days; day++)
        {
            System.out.printf("Population for day %d = %.2f\n", day, population);

            // calculate the increment of the population size
            population = population + (population * percent_increase);
        }
    }
}
