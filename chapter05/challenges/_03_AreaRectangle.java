/**
 * Author     : Patrick Mwila
 * Date       : 22-08-2021
 * Description: A program that calculates and display's the area of a rectangle
 */

import java.util.Scanner;

public class _03_AreaRectangle
{
    public static void main(String[] args)
    {
        // display a message...
        System.out.println(
            "\nThis program calculates the area of a rectangle\n"
        );

        // declare variables used...
        double length, width, area;

        // invoke the required methods for input and area calculation...
        length = getLength();
        width  = getWidth();
        area   = getArea(length, width);

        // invoke the displayData() to ouput the results
        displayData(length, width, area);
    }

    /**
     * getLength() enables the user to enter the length of a rectangle
     *
     * @return the length of a rectangle
     */
    public static double getLength()
    {
        // creates a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter it's length: ");
        double length = keyboard.nextDouble();

        return length;
    }

    /**
     * getWidth() enables the user to enter the width of a rectangle
     *
     * @return the width of a rectangle
     */
    public static double getWidth()
    {
        // creates a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter it's width: ");
        double width = keyboard.nextDouble();

        return width;
    }

    /**
     * getArea() calculates the area of a triangle
     *
     * @param length stores the length 
     * @param width  stores the width
     *
     * @return the area of a triangle
     */
    public static double getArea(double length, double width)
    {
        return length * width;
    }

    /**
     * displayData() outputs a message to the console, stating the length, width
     *               and area of a triangle
     * @param length stores the length
     * @param width  stores the width 
     * @param area   stores the area
     */
    public static void displayData(double length, double width, double area)
    {
        System.out.printf(
            "\nLength = %.2f units\n" +
            "Width  = %.2f units\n" +
            "Area   = %.2f square units\n", length, width, area
        );
    }
}
