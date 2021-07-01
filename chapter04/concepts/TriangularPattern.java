/**
 * Author     : @patrick
 * Description: This program displays a triangular pattern of asterisks.
 */

import java.util.Scanner;

public class TriangularPattern
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int var_rows,
     //     var_cols,
            var_flag;

        System.out.print("\nThis program displays a triangular pattern of " +
                         "\nasterisks. (enter 0 to quit or 1 to proceed) ");

        var_flag = keyboard.nextInt();

        while (!(var_flag == 0))
        {
            System.out.print("\nHow many rows? ");
            var_rows = keyboard.nextInt();

          //  System.out.print("How many columns? ");
          //  var_cols = keyboard.nextInt();

            System.out.println();

            for (int row = 0; row < var_rows; row++)
            {
                for (int col = 0; col < (row + 1); col++)
                {
                    System.out.print("*");
                }

                System.out.println(); // display a blank line after each row
            }

            System.out.print("\nEnter 0 to quit or 1 to run the program again: ");
            var_flag = keyboard.nextInt();
        }
    }
}
