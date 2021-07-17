/**
 * Author     : @patrick
 * Description: A program that simulates 10 coin tosses.
 *
 */

import java.util.Scanner;
import java.util.Random;

public class CoinToss
{
    public static void main(String[] args)
    {
        // create a Scanner object to read input from keyboard
        Scanner keyboard = new Scanner(System.in);

        // create an object used to generate random numbers
        Random var_rand = new Random();

        // declare variables used to control the loop
        String var_flag = "Y"; 
        boolean var_true = var_flag.equalsIgnoreCase("y");

        // declare variabl used to hold generated value
        int var_bool;

        while (var_true)
        {
            for (int count = 1; count <= 10; count++)
            {
                var_bool =  var_rand.nextInt(2);

                // display Heads if var_bool = 1 and Tails if = 0
                if (var_bool == 1)
                {
                    System.out.println("Heads");
                }
                else 
                {
                    System.out.println("Tails");
                }
            }

            System.out.print("Perfom another toss (y = yes) ");
            var_flag = keyboard.next();

            var_true = var_flag.equalsIgnoreCase("y");
        }
    }
}
