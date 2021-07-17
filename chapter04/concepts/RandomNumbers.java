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

        int var_secret_num = var_nums.nextInt(10);

        String var_info = "I am thinking of a number between 0 and 10" + 
                         "\nGuess the number (enter -1 to quit)";
        String var_input = JOptionPane.showInputDialog(var_info);
        int var_guess  =  Integer.parseInt(var_input);

        while (!(var_guess == -1))
        {

            if (var_guess > var_secret_num)
            {
                var_input = JOptionPane.showInputDialog("Your guess was too high!"+
                                       "\nGuess the number (enter -1 to quit)");
                var_guess = Integer.parseInt(var_input);
            }
            else if (var_guess < var_secret_num)
            {
                var_input = JOptionPane.showInputDialog("Your guess was too low!"+
                                       "\nGuess the number (enter -1 to quit)");
                var_guess = Integer.parseInt(var_input);
            }
            else
            {
                String var_str = "Bingo! my secrete number is " + var_guess;
                JOptionPane.showMessageDialog(null, var_str);
                break;
            }

        }
        JOptionPane.showMessageDialog(null, "Goodbye!");

        keyboard.close();
    }
}
