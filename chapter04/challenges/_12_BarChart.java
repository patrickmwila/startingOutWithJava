/**
 * Author     : Patrick Mwila
 * Date       : 11-08-2021
 * Description: A program that creates a bar chart representation based on user
 *              input
 */
import java.util.Scanner;

public class _12_BarChart
{
    public static void main(String[] args)
    {
        // create a Scanner object
        Scanner keyboard = new Scanner(System.in);

        // declare and initialize output string
        String output = "\nSALES BAR CHART\n";

        // prompt for user input 
        for (int store = 1; store <= 5; store++)
        {
            System.out.printf("Enter today's sales for store %d: ", store);
            double sales = keyboard.nextDouble();

            // calculate how many 100's are in sales value
            int count100 = (int)(sales / 100); 

            output += String.format("Store %d: ", store);

            // prepare output string via concatenation
            for (int asterisk = 1; asterisk <= count100; asterisk++)
            {
                output += "*";
            }
            output += "\n";      //concatenate a blank line after each iteration
        }

        // display the chart
        System.out.println(output);
    }
}

