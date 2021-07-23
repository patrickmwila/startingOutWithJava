/**
 * Author     : Patrick Mwila
 * Date       : 22/07/2021
 * Description: A program that reads from a file and writes to another file.
 */
import java.util.Scanner;
import java.io.File;

import java.io.PrintWriter;
import java.io.IOException;

public class _15_UppercaseFileConverter
{
    public static void main(String[] args) throws IOException
    {
        // create a Scanner object to get input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // prompt for user input
        System.out.print("\nEnter name of file1: ");
        String file1 = keyboard.nextLine();

        // create a File object to open file1 for reading
        File readFile = new File(file1);

        // check if file1 exists
        if (!readFile.exists())
        {
            System.out.println("Invalid file name!");
            System.exit(0);
        }
        // create a Scanner object for reading lines from file1
        Scanner inputFile = new Scanner(readFile);

        System.out.print("Enter name of file2: ");
        String file2 = keyboard.nextLine();

        // create a File object to open file2 for writing
        File writeFile = new File(file2);

        // check if file 2 exixts
        if (!writeFile.exists())
        {
            System.out.println("Invalid file name!");
            System.exit(0);
        }
        // create a PrintWriter object for writing to file2
        PrintWriter outputFile = new PrintWriter(writeFile);

        // a loop to read lines from file1 & write them to file2 in Uppercase
        //
        String line;
        while (inputFile.hasNext())
        {
            line = inputFile.nextLine().toUpperCase(); // read line converted to upper case
            outputFile.println(line);                  // write line to outputFile 
        }

        // clear rams buffer by closing inputFile and ouputFile objects
        inputFile.close();
        outputFile.close();

        keyboard.close();
    }
}
