/**  
 * Author     : Patrick Mwila
 * Date       : 21-07-2021
 * Description: A that displays the largest and smallest numbers given a series
 *              of integers.
 *
 */
import java.util.Scanner;

public class _10_LargestAndSmallest
{
    public static void main(String[] args)
    {
        // create a Scanner object to read input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // declare & sentinel value
        final int SENTINEL_VALUE = -99;      

        int num = 0,    // holds the user num 
            min = 0,    // will store the least number
            max = 0;    // will store the max number

        System.out.print("\nThis program will display the greatest and the " + 
                         "\nleast values from a given series of integers." +
                         "\n\nEnter a value or -99 to quit: ");
        num = keyboard.nextInt(); // get input and store it in num
        
        // initialize min and max to num
        if (num != -99)
        {
            min = max = num;
        }
        else
        {
            System.exit(0);
        }

        // get the values and store the least in min and largest in max
        while (num != SENTINEL_VALUE)
        {

            if (num < min)
            {
                min = num;
            }
            else if (num > max)
            {
                max = num;
            }
            System.out.print("Enter a value or -99 to quit: ");
            num = keyboard.nextInt();

        }
        System.out.println("\nSmallest number is: " + min);
        System.out.println("Largest number is: " + max);
        
        keyboard.close();
    }
}
