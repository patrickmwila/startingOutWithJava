/**
 * Author     : Patrick Mwila
 * Date       : 11-08-2021
 * Description: A program that creates a bar chart representation based on user
 *              input
 */
import java.util.Scanner;

public class _12_BarChart
{
    public static void main(String[] args)
    {
        // create a Scanner object
        Scanner keyboard = new Scanner(System.in);

        // declare variables initializing them with default values
        int store1 = 0, store2 = 0, store3 = 0, store4 = 0, store5 = 0;

        // prompt for user input 
        for (int count = 1; count <= 5; count++)
        {
            System.out.printf("Enter today's sales for store %d: ", count);
            int input = keyboard.nextInt();

            // update sales for each store
            switch (count)
            {
                case 1:
                    store1 += input;
                    break;
                case 2:
                    store2 += input;
                    break;
                case 3:
                    store3 += input;
                    break;
                case 4:
                    store4 += input;
                    break;
                case 5:
                    store5 += input;
                    break;
            }

        }

        // display the result's
        System.out.println("\nSALES BAR CHART");

        int max1, max2, max3, max4, max5;
        max1 = store1 / 100;
        max2 = store2 / 100;
        max3 = store3 / 100;
        max4 = store4 / 100;
        max5 = store5 / 100;
        
        System.out.print("Store 1: ");
        for (int count1 = 1; count1 <= max1; count1++)
        {
            System.out.print("*");
        }
        System.out.println();
        
        System.out.print("Store 2: ");
        for (int count2 = 1; count2 <= max2; count2++)
        {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Store 3: ");
        for (int count3 = 1; count3 <= max3; count3++)
        {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Store 4: ");
        for (int count4 = 1; count4 <= max4; count4++)
        {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Store 5: ");
        for (int count5 = 1; count5 <= max5; count5++)
        {
            System.out.print("*");
        }
        System.out.println();

    }
}

