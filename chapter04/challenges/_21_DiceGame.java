/**
 * Author     : Patrick Mwila
 * Date       : 09-08-2021
 * Description: A program that simulates a dice game
 */
import java.util.Random;

public class _21_DiceGame
{
    public static void main(String[] args)
    {
        // create a random object
        Random r = new Random();

        // declare variables to be used
        int pc_rand, 
            pc_total = 0,
            user_rand,
            user_total = 0;

        // roll the dice 10 time's displaying the winner
        for (int count = 1; count <= 10; count++)
        {
            System.out.printf("\nRolling Dice... (%d)",count);
            pc_rand = r.nextInt(6) + 1;
            user_rand = r.nextInt(6) + 1;

            System.out.printf("\ncomputer = %d\nuser = %d\n", pc_rand, user_rand);
            if (pc_rand > user_rand)
            {
                System.out.printf("Roll %d winner is computer\n\n", count);
                pc_total += pc_rand;
            }
            else if(pc_rand < user_rand)
            {
                System.out.printf("Roll %d winner is user\n\n", count);
                user_total += user_rand;
            }
            else
            {
                System.out.printf("Roll %d is a tie\n\n", count);
                pc_total += pc_rand;
                user_total += user_rand;
            }
        }

        // display the grand winner
        if (pc_total > user_total)
        {
            System.out.printf("computer total = %d\nuser total = %d\n", 
                            pc_total, user_total);
            System.out.println("Grand winner = computer");
        }

        else if(pc_total < user_total)
        {
            System.out.printf("computer total = %d\nuser total = %d\n", 
                            pc_total, user_total);
            System.out.println("Grand winner = user");
        }
        else 
        {
            System.out.printf("computer total = %d\nuser total = %d\n", 
                            pc_total, user_total);
            System.out.println("It's a tie");
        }
    }
}
