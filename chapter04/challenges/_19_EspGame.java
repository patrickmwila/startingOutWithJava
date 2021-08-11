/**
 * Author     : Patrick Mwila
 * Date       : 02-08-2021
 * Description: A program that tests your ESP (extrasensory perception).
 */
import java.util.Scanner;
import java.util.Random;

public class _19_EspGame
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in); 
        Random rand = new Random();

        int randVar = rand.nextInt(4);
        String userInput = null;
        byte guesses = 0;

        System.out.println("\nA program that tests your extrasensory perception.");

        System.out.println("\nI'll be thinking of a random colour from either; " +
                           "\nRed, Green, Blue, Orange or Yellow." +
                           "\nGuess the colour and I'll display mine." + 
                           "\nYou have 10 chances!");

        for (byte count = 1; count <= 10; count++)
        {
            System.out.print("\nGuess the colour: ");
            userInput = keyboard.next();
       
            switch (randVar)
            {
                case 0:
                    if (userInput.equalsIgnoreCase("Red")) guesses++;
                    System.out.println("Red");
                    break;

                case 1:
                    if (userInput.equalsIgnoreCase("Green")) guesses++;
                    System.out.println("Green");
                    break;

                case 2:
                    if (userInput.equalsIgnoreCase("Green")) guesses++;
                    System.out.println("Blue");
                    break;

                case 3:
                    if (userInput.equalsIgnoreCase("Orange")) guesses++;
                    System.out.println("Orange");
                    break;

                case 4:
                    if (userInput.equalsIgnoreCase("Yellow")) guesses++;
                    System.out.println("Yellow");
                    break;
            }
            randVar = rand.nextInt(4);
        }
        
        System.out.printf("\nNumber of guesses correct = %d\n", guesses);

        keyboard.close();
    }
}
