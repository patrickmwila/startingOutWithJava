/**
 * @author patrick
 * source code source for programming challenge - 7
 * chapter 3 | startingOutWithJava 7/e (Tonny Gaddis).
 */
import java.util.Scanner;

public class SortedNames
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);

        // prompt the user to enter three names 
        System.out.print("Enter 1st name: ");
        String var_name1 = keyboard.nextLine();
        
        System.out.print("Enter 2nd name: ");
        String var_name2 = keyboard.nextLine();

        System.out.print("Enter 3rd name: ");
        String var_name3 = keyboard.nextLine();
        
        System.out.println(); // display a blank line

        if (var_name1.compareToIgnoreCase(var_name2) < 0 && 
                var_name1.compareToIgnoreCase(var_name3) < 0)
        {
            System.out.println(var_name1);
            if (var_name2.compareToIgnoreCase(var_name3) < 0)
            {
                System.out.println(var_name2);
                System.out.println(var_name3);
            }
            else
            {
                System.out.println(var_name3);
                System.out.println(var_name2);
            }
        }
        else if (var_name2.compareToIgnoreCase(var_name1) < 0 && 
                var_name2.compareToIgnoreCase(var_name3) < 0)
        {
            System.out.println(var_name2);
            if (var_name1.compareToIgnoreCase(var_name3) < 0)
            {
                System.out.println(var_name1);
                System.out.println(var_name3);

            }
            else
            {
                System.out.println(var_name3);
                System.out.println(var_name1);

            }
        }
        else if (var_name3.compareToIgnoreCase(var_name1) < 0 && 
                var_name3.compareToIgnoreCase(var_name2) < 0)
        {
            System.out.println(var_name3);
            if (var_name1.compareToIgnoreCase(var_name2) < 0)
            {
                System.out.println(var_name1);
                System.out.println(var_name2);
            }
            else
            {
                System.out.println(var_name2);
                System.out.println(var_name1);
            }

        }

    }
}


