/**
 * Author     : Patrick Mwila
 * Date       : 22/07/2021
 * Description: A program that asks the user for the name of a file. 
 *              The program should display the contents of the file with each 
 *              line preceded with a line number followed by a colon. 
 */
// import all classes needed for the program.
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class _14_LineNumbers
{
    public static void main(String[] args) throws IOException
    {
        // create a Scanner object to get input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // prompt for user input
        System.out.print("\nEnter name of a file: ");
        String userFile = keyboard.nextLine();

        // open file for reading
        File file = new File(userFile);
        
        // check if the file exits
        if(!file.exists())
        {
            System.out.println("File was not found!");
            System.exit(0);
        }

        // create a Scanner object to read input from a file
        Scanner inputFile = new Scanner(file);

        System.out.println(); // display blank line 
        int lineNumber = 1;   // set line number initial value

        // read all lines of a file-displaying each line with a number
        while (inputFile.hasNext())
        {
            System.out.println( lineNumber + ": " + inputFile.nextLine());
            lineNumber++;
        }

        System.out.println(); // display a blank line

        inputFile.close();
        keyboard.close();  
    }

}
