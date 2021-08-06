/**
 * Author : @patrick
 * Concept: Random numbers are used in a variety of applications. Java provides 
 *          the Random class that you can use to generate random numbers.
 *
 */
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class RandomNumbers
{
    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        Random var_nums = new Random();

        int var_secret_num = var_nums.nextInt(10) + 1;

        String var_info = "I am thinking of a number in the range of 1 via 10" + 
                         "\nGuess the number";

        String var_input = JOptionPane.showInputDialog(var_info);
        int var_guess  =  Integer.parseInt(var_input);

        while (!(var_guess == var_secret_num))
        {

            if (var_guess > var_secret_num)
            {
                var_input = JOptionPane.showInputDialog("Your guess was too high!"+
                                       "\nGuess the number");
                var_guess = Integer.parseInt(var_input);
            }

            else if (var_guess < var_secret_num)
            {
                var_input = JOptionPane.showInputDialog("Your guess was too low!"+
                                       "\nGuess the number)");
                var_guess = Integer.parseInt(var_input);
            }

	    else
	    {
		break;
	    }

        }

        String var_str = "Bingo! my secrete number is " + var_guess + 
			 "\nGoodbye";
        JOptionPane.showMessageDialog(null, var_str);

        keyboard.close();
    }
}
