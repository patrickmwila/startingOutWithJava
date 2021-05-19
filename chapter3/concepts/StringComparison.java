/**
 * Author     : Patrick Mwila
 * Description: A program that uses string methods to compare determine 
 *              if two strings are the same.
 */

public class StringComparison 
{
    public static void main(String [] args) 
    {
        // Exercise 3.20
        String name = "timothy"; // declare and initialise name

        if(name.equalsIgnoreCase("Timothy")) // check if name = to Timothy
        {
            System.out.println("Do I know you?");
        }

        // Exercise 3.21
        String name1 = "Harold",
               name2 = "Finch";

        System.out.println("\nThe following names are in alphabetical order.");
        if (name1.compareTo(name2) < 0)
        {
            System.out.printf("%s\n%s\n", name1, name2);
        }
        else 
        {
            System.out.printf("%s\n%s\n", name2, name1);
        }
    }
}
