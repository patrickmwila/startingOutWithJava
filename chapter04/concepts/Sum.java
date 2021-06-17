/**
 * Author     : @patrick
 * Description: Write a for loop that repeats seven times, asking the user
 *              to enter a number. The loop should also calculate the sum of
 *              the numbers entered.
 */
import java.util.Scanner;

public class Sum
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int var_input,         // will hold user input
            var_sum_total = 0; // accumulator initialized to 0

        // create a for loop to iterate 10 times asking the user to enter a num
        System.out.println("A program that displays the sum of n-numbers(10).");
        for (int count = 1; count <= 10; count++)
        {
            System.out.print("Enter a number: ");
            var_input = keyboard.nextInt();

            var_sum_total += var_input;
        }

        // display sum of numbers
        System.out.printf("\nSum of numbers entered is %d",var_sum_total);
    }
}
