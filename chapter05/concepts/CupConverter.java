/**
 * Author     : Patrick Mwila
 * Date       : 21-08-2021
 * Description: A simple program that converts cups to fluid ounces. 
 */
import javax.swing.JOptionPane;

public class CupConverter
{
    public static void main(String[] args)
    {
        displayResults();

        System.exit(0);
    }

    /**
     * getCups() allows the user to enter the number of cups        `
     *
     * @return the number of cups
     */
    public static double getCups()
    {
        String input;
        input = JOptionPane.showInputDialog(
                "This program converts measurements in cups to fluid ounces." + 
                "\nFor your reference the formula is:" + 
                "\n1 cup = 8 fluid ounces" + 
                "\n\nEnter the number of cups"
             );

        // return the number of cups as a double
        return Double.parseDouble(input);
    }

    /**
     * cupsToOunces() converts the number of cups to the equivalent number
     * of fluid ounces as a double
     *
     * @param numOfCups holds the number of cups passed as an argument
     * @return number of fluid ounces as a double
     */
    public static double cupsToOunces(double numOfCups)
    {
        return numOfCups * 8.0;
    }

    /**
     * displayResults() displays a message indicating the results of the cups
     * to ounces conversion
     */
    public static void displayResults()
    {
        double numOfcups = getCups();

        JOptionPane.showMessageDialog(
            null, numOfcups + " cups equals " + cupsToOunces(numOfcups) +
            " fluid ounces"
        );
    }
}
