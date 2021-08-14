/**
 * Author     : Patrick Mwila
 * Date       : 14-08-2021
 * Description: A program that calculates the average rainfall over a period of 
 *              years.
 */
import java.util.Scanner;

 public class _08_AverageRainfall
 {
    public static void main(String[] args)
    {
        // create a Scanner object to get input from the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        // declare variables to be used
        int total_months;
            
        double inches           = 0.0,
               inches_total     = 0.0,
               average_rainfall = 0.0,
               average_total    = 0.0;
        
        // prompt user to enter number of years
        System.out.print("\nEnter the number of years: ");
        int years = keyboard.nextInt();
        
        // make sure the number of years entered is >= 1
        while (years < 1)
        {
            System.out.print("\nEnter number of years >= 1: ");
            years = keyboard.nextInt();
        }
        
        for (int year = 1; year <= years; year++)
        {
            for (int month = 1; month <= 12; month++)
            {
                System.out.printf("Enter the inches for month %d: ", month);
                inches = keyboard.nextDouble();
                
                // make sure the number of inches >= 1
                while (inches < 1)
                {
                    System.out.printf("\nEnter the inches >= 1 for month %d: ", month);
                    inches = keyboard.nextDouble();
                }
                inches_total += inches;         // update inches_total
                
                average_rainfall = inches / 30; 
                average_total += average_rainfall;
            }
            
            // display a blank line after 12 iteration
            System.out.println();
        }
        
        // calculate the total number of months in X-years
        total_months = 12 * years;
        
        // display the results
        System.out.printf("Number of months in %d year(s) = %d\n", years,
                          total_months);
                          
        System.out.printf("Total inches of rainfall in %d year(s) = %.2f inches\n",
                         years, inches_total);
                         
        System.out.printf("Total average rainfall in %d year(s) = %.2f inches\n", 
                         years, average_rainfall);
    }
 }
