/**
 * Author     : Patrick Mwila
 * Date       : 24-07-2021
 * Description: A program that determines if the user is over or under budget 
 *              given the budgeted month figure and the month expenses.
 */
import javax.swing.JOptionPane;

public class _16_BudgetAnalysis
{
    public static void main(String[] args)
    {
        // prompt the user to enter budgeted figure for the month
        String input = JOptionPane.showInputDialog("Enter the amount you have "+ 
                                   "budgeted for the month");
        double budgetAmount = Double.parseDouble(input);
        double expense = 0.0,
               expenseTotal = 0.0;


        // create a loop -- allow user to enter expenses for the month
        for (int day = 1; day <= 30; day++)
        {
            input = JOptionPane.showInputDialog("Enter day " + day + " expense");
            expense = Double.parseDouble(input);
            expenseTotal += expense;            // initialize accumulator to expense + current value
        }

        // display the results
        if (expenseTotal > budgetAmount)
        {
            JOptionPane.showMessageDialog(null, "Expense Total = " + expenseTotal + 
                    "\nYou're over the budget.");
        }
        else if (expenseTotal < budgetAmount)
        {
            JOptionPane.showMessageDialog(null, "Expense Total = " + expenseTotal + 
                    "\nYou're under the budget.");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "You're on the right track" +
                    "\nBudget Amount = " + budgetAmount +
                    "\nExpense Total = " + expenseTotal);
        }
    }
}
