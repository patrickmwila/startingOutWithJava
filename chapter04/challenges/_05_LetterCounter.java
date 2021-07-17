/**
 * Author     : Patrick Mwila
 * Date       : 17/07/2021
 * Description: A program that counts the number of times a character appears in 
 *              in a given string.
 */
import javax.swing.JOptionPane;

public class _05_LetterCounter
{
    public static void main(String[] args)
    {
        // variable declaration
        String userString,
               userChar,
               msg;
        char   myChar;
        int    count = 0;

        // prompt for user input 
        userString = JOptionPane.showInputDialog("Enter a string");
        userChar   = JOptionPane.showInputDialog("Enter a character");
        myChar     = userChar.charAt(0);

        // create a loop that will count the number of times a char appears in a string
        // i = index
        for(int i= 0; i < userString.length(); i++)
        {
            if (userString.charAt(i) == myChar)
            {
                count++;
            }
        }

        // display the results
        msg = "'" + myChar + "' appears " + count + " times in " + userString;
        JOptionPane.showMessageDialog(null, msg, "LetterCounter",
                    JOptionPane.INFORMATION_MESSAGE);
    }
}

