/**
 * @author patrick
 *
 * CONCEPT: The while loop can be used to create input routines that
 *          repeat until acceptable data is entered.
 *          Input validation is the process of inspecting data given to a
 *          program by the user and determining whether it is valid.
 */
import java.util.Scanner;

public class InputValidation
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user to enter a number in the range of 1 through 50.
        System.out.print("Enter a number in the range of 1 through 50: ");
        int var_num = keyboard.nextByte();

        while (var_num < 1 || var_num > 50)
        {
            System.out.print("Invalid range.\nEnter a number in the range of 1 " +
                             "through 50: ");

            var_num = keyboard.nextByte();
        }

        System.out.println("Beautiful!\n");
        keyboard.nextLine(); // clear the keyboards buffer

        System.out.print("Do you want to run a similar program (Y/N) ");
        String var_input = keyboard.nextLine();

        char var_input_char = var_input.charAt(0);

        while (!(var_input_char == 'Y' || var_input_char == 'N'))
        {
            System.out.print("Invalid input!\nDo you want to run a similar " +
                               "program (Y/N) ");

            var_input = keyboard.nextLine();
            var_input_char = var_input.charAt(0);
        }

        if (var_input_char == 'N')
        {
            System.out.println("Noted! Try out the following though...\n ");
        }

        // prompt the user to enter a number in the range of 10 through 24
        System.out.print("Enter a number in the range of 10 through 24: ");
        byte var_num2 = keyboard.nextByte();
        
        while (var_num2 < 10 || var_num2 > 24)
        {
            System.out.print("Invalid range. Enter a number in the range of 10 " + 
                               "through 24: ");
            var_num2 = keyboard.nextByte();
        }
        System.out.println("Beautiful!");
        keyboard.nextLine(); // clear the keyboards buffer

        System.out.print("\nWould you like to run this program " +
                           "next time? (yes/no): ");
        String var_input2 = keyboard.nextLine();

        while (!(var_input2.equals("yes") || var_input2.equals("no")))
        {
            System.out.print("Invalid input.\nWould you like to run this " + 
                               "program next time? (yes/no): ");
            var_input2 = keyboard.nextLine();
        }

        System.out.println("Goodbye!");
    }
}
