/**
 * @author patrick
 * source code solution for programming challenge - 6
 * chapter 3 | startingOutWithJava (Tonny Gaddis).
 */
import java.util.Scanner;

public class TimeCalculator
{
    public static void main(String [] args)
    {
        Scanner keybaord = new Scanner(System.in); // create a scanner object

        // display purpose of the program
        System.out.println("================================================");
        System.out.println("                TIME CALCULATOR                 ");
        System.out.println("================================================");

        // prompt the user for input
        System.out.print("Enter a number of seconds: ");
        int var_sec = keybaord.nextInt();

        // display one of the following statements based on the input
        if (var_sec >= 60 && var_sec < 3600)
        {
            int var_min = var_sec / 60;
            if (var_min == 1)
            {
                System.out.printf("The number of minutes in %ds is just %d"+ 
                        "min.\n", var_sec, var_min);
            }
            else
            {
                System.out.printf("The number of minutes in %ds is %dmin.\n",
                        var_sec, var_min);
            }
        }

        else if (var_sec >= 3600 && var_sec < 86400)
        {
            int var_hours = var_sec / 3600;
            if (var_hours == 1)
            {
                System.out.printf("The number of hours in %ds is just %dhr." +
                        "\n", var_sec, var_hours);
            }
            else
            {
                System.out.printf("The number of hours in %ds is %dhrs.\n",
                        var_sec, var_hours);
            }
        }

        else if (var_sec >= 86400)
        {
            int var_days = var_sec /86400;
            if (var_days == 1)
            {
                System.out.printf("The number of days in %ds is just %d day." +
                        "\n", var_sec, var_days);
            }
            else
            {
                System.out.printf("The number of days in %ds is %d days.\n",
                        var_sec, var_days);
            }
        }

        else
        {
            System.out.printf("The number of seconds your entered is: %ds" +
                    "\nRun the program again & enter a number of seconds > 60",
                    var_sec);
        }
    } // end of main method
} // end of TimeCalculator class
