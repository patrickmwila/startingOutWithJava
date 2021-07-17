/**
 * Author     : Patrick Mwila
 * Date       : 17/07/2021
 * Description: A program that calculates distance traveled by a vehicle
 *
 */
import java.util.Scanner;

public class _02_DistanceTraveled
{
    public static void main(String[] args)
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

        var_count = 1; // controls the do while loop
        System.out.println("\nHours\t\tDistance Traveled");
        System.out.println("---------------------------------");

        do 
        {

            // calculate distance for each hour
            var_distance = var_speed * var_count;

            // display the results
            System.out.println("\t"+ var_count + "\t|\t" + var_distance);

            // increment the value of var_count by 1
            var_count++;

        } while (var_count <= var_hours);

        // stop reading input from the keyboard
        keyboard.close();
    }
}
