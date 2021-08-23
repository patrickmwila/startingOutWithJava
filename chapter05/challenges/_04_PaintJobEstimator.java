/**
 * Author     : Patrick Mwila
 * Date       : 22-08-2021
 * Description: A program that simulates a paint job Estimator.
 */
import java.util.Scanner;

public class _04_PaintJobEstimator
{
    public static void main(String[] args)
    {
        // create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        // prompt for user input
        System.out.print("\nEnter the number of rooms to be painted: ");
        short numOfRooms = keyboard.nextShort();


        // implement a for loop to get the square feet of wall space
        int squareFeet = 0;
        double costOfPaint, gallons, hours, cost, charges, totalCharges;

        for (int room = 1; room <= numOfRooms; room++)
        {
            System.out.printf(
                "\nEnter the square feet of wall space for room #%d: ", room
            );
            squareFeet = keyboard.nextInt();

            System.out.printf(
                "Enter the price of paint per gallon for room #%d: ", room
            );
            costOfPaint = keyboard.nextDouble();


            // invoke the required methods
            gallons      = gallonsOfPaint(squareFeet);
            hours        = laborHours(squareFeet);
            cost         = costOfPaint(squareFeet, costOfPaint);
            charges      = laborCharges(squareFeet);
            totalCharges = totalCost(squareFeet, costOfPaint, squareFeet);

            System.out.printf(
                "\nGallons of paint required = %.2f units" +
                "\nHours of labor required   = %dhrs" +  
                "\nCost of paint             = $%.2f" +
                "\nLabor charges             = $%.2f" +
                "\nTotal cost of paint job   = $%.2f\n\n",
                gallons, (int)hours, cost, charges, totalCharges
            ); 
        }
    }

    /**
     * gallonsOfPaint() calculates the number of gallons of paint requaired
     * @param squareFeet stores the square feet of wall space value
     *
     * @return the number of gallons of paint
     */
    public static double gallonsOfPaint(int squareFeet)    
    {
        return squareFeet / 115;
    }

    /**
     * laborHours() calculates the hours of labor required
     * @param squareFeet stores the square feet of wall space value
     *
     * @return the number of hours of labour required
     */
    public static double laborHours(int squareFeet)
    {
        return (8.0 * squareFeet) / 115.0;
    }

    /**
     * costOfPaint() calculates the cost of paint
     * @param costOfPaint stores the cost of paint per gallon
     *
     * @return the cost of paint
     */
    public static double costOfPaint(int squareFeet, double costOfPaint)
    {
        return gallonsOfPaint(squareFeet) * costOfPaint;
    }

    /**
     * laborCharges() calculates the labor charges
     * 
     * @return the labor charges
     */
    public static double laborCharges(int squareFeet)
    {
        return 18.0 * laborHours(squareFeet); }

    /**
     * totalCost() calculates the total cost of the paint job
     *
     * @return the total cost of the paint job
     */
    public static double totalCost(int squareFeet1, double costOfPaint, int squareFeet)
    {
        return costOfPaint(squareFeet1, costOfPaint) + laborCharges(squareFeet);
    }
}
