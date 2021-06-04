/**
 * @author patrick
 * source code source for programming challenge - 11
 * chapter 3 | startingOutWithJava 7/e (Tonny Gaddis).
 */

import java.util.Scanner;

public class RunningTheRace
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter name for 1st runner: ");
        String var_1st_runner = keyboard.nextLine();

        System.out.print("Enter the time (min) 1st runner took: ");
        int var_1st_min = keyboard.nextInt();

        keyboard.nextLine(); // clean the keyboards buffer
        System.out.print("\nEnter name for 2nd runner: ");
        String var_2nd_runner = keyboard.nextLine();

        System.out.print("Enter the time (min) 2nd runner took: ");
        int var_2nd_min = keyboard.nextInt();

        keyboard.nextLine(); // clean the keyboards buffer
        System.out.print("\nEnter name for 3rd runner: ");
        String var_3rd_runner = keyboard.nextLine();

        System.out.print("Enter the time (min) 3rd runner took: ");
        int var_3rd_min = keyboard.nextInt();

        System.out.println();

        if (var_1st_min < var_2nd_min && var_1st_min < var_3rd_min)
        {
            System.out.println(var_1st_runner);
            if (var_2nd_min < var_3rd_min)
            {
                System.out.println(var_2nd_runner);
                System.out.println(var_3rd_runner);
            }
            else
            {
                System.out.println(var_3rd_runner);
                System.out.println(var_2nd_runner);
            }
        }
        else if (var_2nd_min < var_1st_min && var_2nd_min < var_3rd_min)
        {
            System.out.println(var_2nd_runner);
            if (var_1st_min < var_3rd_min)
            {
                System.out.println(var_1st_runner);
                System.out.println(var_3rd_runner);

            }
            else
            {
                System.out.println(var_3rd_runner);
                System.out.println(var_1st_runner);
            }
        }
        else if (var_3rd_min < var_1st_min && var_3rd_min < var_2nd_min)
        {
            System.out.println(var_3rd_runner);
            if (var_1st_min < var_2nd_min)
            {
                System.out.println(var_1st_runner);
                System.out.println(var_2nd_runner);
            }
            else
            {
                System.out.println(var_2nd_runner);
                System.out.println(var_1st_runner);
            }

        }
    }
}
