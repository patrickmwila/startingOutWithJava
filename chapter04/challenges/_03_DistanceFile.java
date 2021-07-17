/**
 * Author     : Patrick Mwila
 * Date       : 17/07/2021
 * Description: A program that calculates distance traveled by a vehicle
 *              And writes the result to a file
 */
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

public class _03_DistanceFile
{
    public static void main(String[] args) throws IOException
    {
        // create a Scanner object to get input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // variable declaration
        int var_speed,
            var_hours,
            var_count,
            var_distance;

        // prompt user for input
        System.out.print("Enter speed (in miles-per-hour): ");
        var_speed = keyboard.nextInt();

        System.out.print("Enter the number of hours the car traveled: ");
        var_hours = keyboard.nextInt();

        // validate user input
        while (var_speed < 0 || var_hours < 1)
        {
            if (var_speed < 0)
            {
                System.out.print("\nValue for speed cannot be negative! " + 
                           "\nEnter speed (in miles-per-hour): ");
                var_speed = keyboard.nextInt();
            }
            else 
            {
                System.out.print("\nValue for time should be atleast 1! " + 
                           "\nEnter the number of hours the car traveled: ");
                var_hours = keyboard.nextInt();
            }
        } // end of input validation

        // create a PrintWriter object to write data to a file
        PrintWriter outputFile = new PrintWriter("DistanceTraveled.txt");

        var_count = 1; // controls the do while loop
        outputFile.println("Hours\t\tDistance Traveled");
        outputFile.println("---------------------------------");

        do 
        {

            // calculate distance for each hour
            var_distance = var_speed * var_count;

            // display the results
            outputFile.println("\t"+ var_count + "\t|\t" + var_distance);

            // increment the value of var_count by 1
            var_count++;

        } while (var_count <= var_hours);

        outputFile.close(); // clean memory buffer and close outputFile
        keyboard.close();   // stop reading input from the keyboard
    }
}
