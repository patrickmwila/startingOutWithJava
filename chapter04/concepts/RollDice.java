/**
 * Author     : @patrick
 * Description: A program that simulates the rolling of dice.
 */

import javax.swing.JOptionPane;
import java.util.Random;

public class RollDice
{
    public static void main(String[] args)
    {
        // create a object to generate random numbers
        Random var_rand = new Random();

        String var_input = null; // will hold user input
        char   var_flag  = 'y';  // wiil control loop execution

        // variables to hold generated random numbers
        int var_num1 = 0,
            var_num2 = 0;

        while (var_flag == 'y')
        {
            // generate two random numbers
            var_num1 = var_rand.nextInt(6) + 1;
            var_num2 = var_rand.nextInt(6) + 1;

            JOptionPane.showMessageDialog(null, "Rolling the dice ... " +
                        "\nTheir values are: \n" + var_num1 + " & " + var_num2);

            var_input = JOptionPane.showInputDialog("Roll them again (y = yes)?");
            var_flag = var_input.charAt(0);
        }

    
    }

}

