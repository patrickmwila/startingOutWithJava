/**
 * Author     : Patrick Mwila
 * Date       : 17/07/2021
 * Description: A program that counts the number of times a character appears in 
 *              in a given file.
 */
import java.util.Scanner;       // will be used to read input from the file
import javax.swing.JOptionPane; // will be used to interact with the program
import java.io.File;            // will be used to hold the file for reading
import java.io.IOException;     // will be used to throw IOExceptions

public class _06_FileLetterCounter
{
    public static void main(String[] args) throws IOException
    {
        // prompt user for file name input
        String userFile = JOptionPane.showInputDialog("Enter file name ");

        // create a File object
        File file = new File(userFile);     

        // check if the file exists
        if (!file.exists())
        {
            String errorFlag = "File was not found";
            JOptionPane.showMessageDialog(null, errorFlag,"FileLetterCounter",
                        JOptionPane.ERROR_MESSAGE);

            System.exit(0);
        }

        // create a Scanner object to read input from file
        Scanner inputFile = new Scanner(file);

        // "prompt user for character input"
        String userChar = JOptionPane.showInputDialog("Enter a character");
        char findChar = userChar.charAt(0);


        int count = 0; // used to count findChar in str

        // a loop to read the lines of the file
        while (inputFile.hasNext())
        {
            String line = inputFile.nextLine(); // read file line by line

            // loop through each line
            // i = index
            for (int i = 0; i < line.length(); i++)
            {
                if (line.charAt(i) == findChar)
                {
                    count++; // increment count by 1
                }
            }
        }

        // clean the rams buffer
        inputFile.close();

        // display the results
        String msg = "'" + findChar + "' appears " + count + " times in " + userFile;
        JOptionPane.showMessageDialog(null, msg, "FileLetterCounter",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
