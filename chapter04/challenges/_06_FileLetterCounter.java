/**
 * Author     : Patrick Mwila
 * Date       : 17/07/2021
 * Description: A program that counts the number of times a character appears in 
 *              in a given file.
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

import java.io.FileReader;
import java.io.IOException;

public class _06_FileLetterCounter
{
    public static void main(String[] args) throws IOException
    {
        // prompt user input
        String userFile = JOptionPane.showInputDialog("Enter file name ");
        String userChar = JOptionPane.showInputDialog("Enter a character");
        char findChar = userChar.charAt(0);

        // create a FileReader object to open the file for reading
        FileReader file = new FileReader(userFile);

        // create a Scanner object to read input from file
        Scanner inputFile = new Scanner(file);

        // read the lines of the file
        int count = 0; // used to count findChar in str

        while (inputFile.hasNext())
        {
            String str = inputFile.nextLine(); // read file line by line

            // loop through str line
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == findChar)
                {
                    count++; // increment count by 1
                }
            }
        }

        // clean the rams buffer
        file.close();
        inputFile.close();

        // display the results
        String msg = "'" + findChar + "' appears " + count + " times in " + userFile;
        JOptionPane.showMessageDialog(null, msg, "FileLetterCounter",
                    JOptionPane.INFORMATION_MESSAGE);
    }
}
