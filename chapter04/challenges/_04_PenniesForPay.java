/**
 * Author     : Patrick Mwila
 * Date       : 17/07/2021
 * Description: A program that calculates the amount a person would earn over 
 *              a period of time if his or her salary is one penny the first day,
 *              two pennies the second day, and continues to double each day.
 */
import java.util.Scanner;

public class _04_PenniesForPay
{
    public static void main(String[] args)
    {
        // create a Scanner get input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // variable declaration
        int var_total = 0;

        // prompt for user input
        System.out.print("Enter the number of days worked: ");
        int var_days = keyboard.nextInt();

        // validate user input 
        while (var_days < 1)
        {
            System.out.print("\nThe number of days worked must be atleast 1!" +
                       "\nEnter the number of days worked: ");
            var_days = keyboard.nextInt();
        }

        System.out.println("\nDays\tSalary");
        System.out.println("--------------");

        for (int count = 1; count <= var_days; count++)
        {
            var_total += count;
            System.out.println(count + "\t$" + count);
            
        }

        System.out.println("--------------");
        System.out.println("Total\t$" + var_total);

        keyboard.close(); // clean the keyboards the buffer
    }
}
