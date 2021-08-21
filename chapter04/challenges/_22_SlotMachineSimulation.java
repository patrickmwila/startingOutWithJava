/**
 * Author     : Patrick Mwila
 * Date       : 18-08-2021
 * Description: A program that simulates a slot machine.
 */

import java.util.Scanner;
import java.util.Random;

public class _22_SlotMachineSimulation
{
    public static void main(String[] args)
    {
        // create a Scanner object for getting input via keyboard 
        Scanner keyboard = new Scanner(System.in);

        // create a Random object
        Random r = new Random();

        // variable declaration...
        int index, word1 = 0, word2 = 0, word3 = 0;

        // prompt the user for input
        System.out.print(
            "\nEnter the amount you want to enter into the " +  
            "\nslot machine: "
        );
        double cash_entered = keyboard.nextDouble();
        
        double cash_won = 0, cash_consumed = cash_entered;

        // a while to control the number of times the program runs
        char flag_status = 'y';

        while (flag_status == 'y')
        {
            // using a for loop to keep track of the selected words
            System.out.println();
            for (int count = 1; count <= 3; count++)
            {
                index = r.nextInt(6);  // generate a random number (0 - 5)
                switch (index)
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
                        System.out.println(
                            "A logical error occured (check your random value!)"
                        );
                        System.exit(-1);
                        break;
                }

                // keep track of the words generated
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

                    // compare words...
                    if (word1 == word2 && word1 == word3)
                    {
                        System.out.println(
                            "\nYou have won 3 times the amount you entered!"
                        );
                        cash_won =+ 3 * cash_entered;
                    }

                    else if (word1 == word2)
                    {
                        System.out.println(
                            "\nYou have won 2 times the amount you entered!"
                        );
                        cash_won += 2 * cash_entered;
                    }

                    else if (word1 == word3)
                    {
                        System.out.println(
                            "\nYou have won 2 times the amount you entered!"
                        );
                        cash_won += 2 * cash_entered;
                    }

                    else if (word2 == word3)
                    {
                        System.out.println(
                            "\nYou have won 2 times the amount you entered!"
                        );
                        cash_won += 2 * cash_entered;
                    }

                    else 
                    {
                        System.out.println(
                            "\nNon of the generated words match!" + 
                            "\nTherefore, You have won $0"
                        );
                    }

                    System.out.print(
                        "\nRun the program again. (y = yes / any later to quit): "
                    );
                    String response = keyboard.next();

                    // re-initialize the flag_status
                    flag_status = response.charAt(0);

                    // check if the user wants to play again
                    if (flag_status == 'y')
                    {
                        System.out.print(
                            "\nEnter the amount you want to enter into the " +
                            "\nslot machine: "
                        );
                        cash_entered = keyboard.nextDouble();

                        // update the cash consumed
                        cash_consumed += cash_entered;
                    }
                }
            }
        }
   
        // display the results
        System.out.printf("\nTotal amount entered = $%.2f", cash_consumed);
        System.out.printf("\nTotal amount won = $%.2f\n", cash_won);

        keyboard.close();
    }
}
