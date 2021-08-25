/**
 * @author patrick
 * source code solution for programming challenge - 2
 * chapter 3 | startingOutWithJava 7/e (Tonny Gaddis).
 */
import java.util.Scanner;

public class MagicDates
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);

        // prompt the user for input
        System.out.printf("Enter a month (in numeric form): ");
        byte var_month = keyboard.nextByte();

        System.out.printf("Enter a day (in numeric form): ");
        byte var_day = keyboard.nextByte();

        System.out.printf("Enter a two-digit-year: ");
        byte var_year = keyboard.nextByte();

        // determine whether month * day equal equals to the year
        byte var_magic_date = (byte)(var_month * var_day);

        if (var_magic_date == var_year)
        {
                System.out.printf("The date is magic!\n");
        }

        else
        {
                System.out.println("The date is not magic!");
        }
    }
}
