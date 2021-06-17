/**
 * author @patrick
 *
 * CONCEPT: A running total is a sum of numbers that accumulates with
 *          each iteration of a loop. The variable used to keep the running total is
 *          called an accumulator. A sentinel is a value that signals when the end of a
 *          list of values has been reached
 */
import javax.swing.JOptionPane;

public class RunningTotal
{
    public static void main(String[] args)
    {
        int    var_days;        // number of days
        double var_total_sales; // accumulator
        String var_input;       // holds the user's input

        // get the number of day's
        var_input = JOptionPane.showInputDialog("For how many days do you have the sales figures?");
        var_days = Integer.parseInt(var_input);

        var_total_sales = 0.0;

        // get the sales figures and calculate the running total
        for (int count = 1; count <= var_days; count++)
        {
            var_input = JOptionPane.showInputDialog("Enter the sales for day " + count);
            var_total_sales += Double.parseDouble(var_input); // add var_input to var_total_sales
        }

        // display the running total
        JOptionPane.showMessageDialog(null, String.format("The total sales are $%,.2f", var_total_sales));
        System.exit(0); 
    }
}
