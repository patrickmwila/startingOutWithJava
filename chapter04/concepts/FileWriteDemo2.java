/**
 * Author     : @patrick
 * Description: This programs stores the names of your friends to a file.
 *
 */

import java.util.Scanner;   // used to create an object for reading user input 
import java.util.InputMismatchException; // used to catch mismatch input from the keyboard

import java.io.FileWriter;  // used to create an object for opening a file & appending data to file
import java.io.PrintWriter; // used to create an object for opening a file & writing data to file
import java.io.IOException; // used to throw a possible IOException

//import java.io.FileNotFoundException; // used to catch a FileNotFoundException

public class FileWriteDemo2
{
    public static void main(String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in); // create a scanner object for getting user input

        FileWriter var_fwriter = new FileWriter("Friends.txt", true); // create a FileWriter object & open the file to append data to it
        PrintWriter var_output_file = new PrintWriter(var_fwriter);   // create a PrintWriter object & open the file associated with fwriter to append data to it

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
            System.out.println("Friends added to Friends.txt");
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
