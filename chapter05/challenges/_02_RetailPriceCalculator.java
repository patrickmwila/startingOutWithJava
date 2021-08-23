/**
 * Author     : Patrick Mwila
 * Date       : 22-08-2021
 * Description: A program that calculates the retail price of an item, given 
 *              it's whosalse price and it's markup %.
 */

import java.util.Scanner;

public class _02_RetailPriceCalculator
{
    public static void main(String[] args)
    {
        // create a Scanner object for getting input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // prompt for user input
        System.out.print("Enter an item's wholesale cost: ");
        double wPrice = keyboard.nextDouble();

        System.out.print("Enter it's equivalent markup %: ");
        double mPercent = keyboard.nextInt();

        // invoke the calculateRetail()
        double rPrice = calculateRetail(wPrice, mPercent);

        // display the retail price
        System.out.printf("The item's retail price is $%.2f\n", rPrice);
    }

    /**
     * calculateRetail() caculates the retail price of an item
     *
     * @param cost   stores the wholesale price of an item
     * @param mValue stores the markup % asscociated with the item
     *
     * @return the retail price of the item
     */
    public static double calculateRetail(double cost, double mValue)
    {
        return cost + ((mValue / 100.0) * cost);
    }
}
