/**
 * Author     : @patrick
 * Description: This programs stores the names of your friends to a file.
 *
 */

import java.util.Scanner;   // used to create an object for reading user input 
import java.io.PrintWriter; // used to create an object for opening a file  & writing data to file
import java.io.FileNotFoundException; // used to throw a possible IOException
import java.util.InputMismatchException; // used to catch mismatch input from the keyboard

public class FileWriteDemo
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner keyboard = new Scanner(System.in); // create a scanner object for getting user input
        PrintWriter var_output_file = new PrintWriter("Friends.txt"); // create a PrintWriter object & open the file

        String var_friend_name;  // friend's name
        int var_num_friends = 0;     // number of friends

        // get the number of friends
        System.out.print("How many friends do you have? ");
        try
        {
            var_num_friends = keyboard.nextInt();
        }
            catch (InputMismatchException EXCEPTION)
            {
                System.out.println("Invalid input!");
                var_num_friends = -1; // ignore flag
            }

        keyboard.nextLine(); // clean the keyboard's buffer

        if (!(var_num_friends != 0) && (var_num_friends != 0) || (var_num_friends > 0))
        {
            var_output_file.println("A list of my friends names");

            // get the data and write it to the file
            for (int count = 1; count <= var_num_friends; count++)
            {
                // get friend's name
                System.out.printf("Enter the name of friend %d: ", count);
                var_friend_name = keyboard.nextLine();
                
                // write friends name to Friends.txt
                var_output_file.println(var_friend_name);
            }

            var_output_file.close(); // close the file
        }

        else if (var_num_friends == 0)

        {
            System.out.println("I recommend you start making friends of similar interest.");
        }

        else 
        {
            System.out.println("Rerun the program and enter the correct data.");
        }
    }
}
