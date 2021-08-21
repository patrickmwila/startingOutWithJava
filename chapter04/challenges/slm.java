/**
 * Author     : Patrick Mwila
 * Date       : 17-08-2021
 * Description: A program that simulates a slot machine.
 */

import java.util.Scanner;
import java.util.Random;

public class slm
{
    public static void main(String[] args)
    {
        // create a scanner object to get input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // variables to hold the selected words
        int word1 = 0, word2 = 0, word3 = 0;

        // create a random object
        Random r = new Random();

        // prompt for user input
        System.out.print("\nEnter the amount of money you want to put into the " + 
                         "\nthe slot machine: ");
        double user_cash = keyboard.nextDouble();

        double cash_won = 0.0, cash_consumed = user_cash;

        int count = 1;
        int index;
        // use a loop to generate a random random and select word
        char flag = 'y';

        System.out.println(); // blank line for readability

        while (flag == 'y')
        {
            // generate a random number
            index = r.nextInt(6);

            // use a switch statement to select a word
            switch(index)
            {
                case 0:
                    System.out.println("Cherries");
                    break;

                case 1:
                    System.out.println("Oranges");
                    break;

                case 2:
                    System.out.println("Plums");
                    break;

                case 3:
                    System.out.println("Bells");
                    break;

                case 4:
                    System.out.println("Melons");
                    break;

                case 5:
                    System.out.println("Bars");
                    break;

                default:
                    System.out.println("Logical error (wrong random value)!");
                    System.exit(-1);
            }

            // re-initialize word1, word2, and word3 
            if (count == 1)
            {
                word1 = index; 
            }

            else if (count == 2)
            {
                word2 = index;
            }

            else 
            {
                word3 = index;

                // compare the values fo word1, word3 and word3
                if (word1 == word2 && word1 == word3)
                {
                    System.out.println("\nYou have won 3 times the amount you entered!");
                    cash_won += (3 * user_cash);
                }

                else if (word1 == word2)
                {
                    System.out.println("\nYou have won 2 times the amount you entered!");
                    cash_won += (2 * user_cash);
                }

                else if (word1 == word3)
                {
                    System.out.println("\nYou have won 2 times the amount you entered!");
                    cash_won += (2 * user_cash);
                }

                else if (word2 == word3)
                {

                    System.out.println("\nYou have won 2 times the amount you entered!");
                    cash_won += (2 * user_cash);
                }

                else 
                {
                    System.out.println("\nNon of the words match,\nYou have won $0");
                }

                System.out.print("\nRun this program again (y = yes / any key to quit): ");
                String status = keyboard.next();

                flag = status.charAt(0);
                count = 0;

                if (flag == 'y')
                {
                    System.out.print("\nEnter the amount of money you want to put into the " + 
                                     "\nthe slot machine: ");
                    user_cash = keyboard.nextDouble();
                    cash_consumed += user_cash;
                }
            }

            // increment count by 1
            count++;
        }

        System.out.printf("\nTotal amount you entered = $%.2f", cash_consumed);
        System.out.printf("\nTotal amount you have won =$%.2f\n", cash_won);

        keyboard.close();
    }
}
