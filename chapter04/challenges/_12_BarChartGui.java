
/**
 * Author     : Patrick Mwila
 * Date       : 11-08-2021
 * Description: A program that creates a bar chart representation based on user
 *              input
 */
import javax.swing.JOptionPane;

public class _12_BarChartGui
{
    public static void main(String[] args)
    {
        // variable declaration 
        String output, msg;
        double sales;
        int count100;

        // declare and initialize output string
        output = "\nSALES BAR CHART\n";

        // prompt for user input 
        for (int store = 1; store <= 5; store++)
        {
            // create user prompt
            msg = String.format("Enter today's sales for store %d", store);
            
            // display the prompt
            String input = JOptionPane.showInputDialog(msg);
            sales = Double.parseDouble(input);

            // calculate how many 100's are in sales value
            count100 = (int)(sales / 100); 


            output += String.format("Store %d: ", store);
            // prepare output string via concatenation
            for (int asterisk = 1; asterisk <= count100; asterisk++)
            {
                output += "*";
            }
            output += "\n";      //concatenate a blank line after each iteration
        }

        // display the chart
        JOptionPane.showMessageDialog(null, output);
    }
}

