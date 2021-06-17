/**
 * Author : @patrick
 * Concept: A sentinel value is a special value that cannot be mistaken as a 
 *          member of the list, and signals that there are no more values to be 
 *          entered. When the user enters the sentinel value, the loop 
 *          terminates.
 */
import java.util.Scanner;

public class SoccerPoints
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in); // Create a Scanner object

        int var_points,           // Game points
            var_total_points = 0; // Accumulator initialized to 0

        // Display general instructions
        System.out.print("Enter the number of points your team has earned "+
                         "\nfor each game this season. (Enter -1 when done) ");
        var_points = keyboard.nextInt();

        // Accumulate the points until -1 is entered
        while (!(var_points == -1))
        {
            // Add var_points to var_total_points
            var_total_points += var_points;

            // Get the next number of points
            System.out.print("Enter game points or -1 to end: ");
            var_points = keyboard.nextInt();
        }

        // Display the total number of points
        System.out.printf("The total points are %d", var_total_points);
    }
}
