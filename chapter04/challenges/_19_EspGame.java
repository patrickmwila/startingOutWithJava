/**
 * Author     : Patrick Mwila
 * Date       : 02-08-2021
 * Description: A program that tests your ESP (extrasensory perception).
 */
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class _19_EspGame
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);  // creates a Scanner object
        Random rand = new Random();                 // creates a random object

        int randVar = rand.nextInt(5);         // generate values from 1 via 4 
        String userInput = null;
        int guesses = 0;                            // accumulator to keep track of user's correct guesses

        System.out.println("\nA program that tests your extrasensory perception.");

        System.out.println("\nI'll be thinking of a random colour from either; " +
                           "\nRed, Green, Blue, Orange or Yellow." +
                           "\nGuess the colour and I'll display mine." + 
                           "\nYou have 10 chances!");

        // a loop to prompt for user input, display computer's colour 
        // and keep track of users' correct guesses
        for (int count = 1; count <= 10; count++)
        {
            System.out.print("\nGuess the colour: ");
            userInput = keyboard.next();
       
            switch (randVar)
            {
                case 0:
                    System.out.println("Red");
                    if (userInput.equalsIgnoreCase("Red")) guesses++;
                    break;

                case 1:
                    System.out.println("Green");
                    if (userInput.equalsIgnoreCase("Green")) guesses++;
                    break;

                case 2:
                    System.out.println("Blue");
                    if (userInput.equalsIgnoreCase("Blue")) guesses++;
                    break;

                case 3:
                    System.out.println("Orange");
                    if (userInput.equalsIgnoreCase("Orange")) guesses++;
                    break;

                case 4:
                    System.out.println("Yellow");
                    if (userInput.equalsIgnoreCase("Yellow")) guesses++;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "An error occured!" +
                                "\nReport this bug!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    System.exit(-1);
                    break;
            }
            randVar = rand.nextInt(5);
        }
        
        System.out.printf("\nNumber of guesses correct = %d\n", guesses);
        keyboard.close();
    }
}
