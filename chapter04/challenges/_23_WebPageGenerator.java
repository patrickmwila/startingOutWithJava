/**
 * Author     : Patrick Mwila
 * Date       : 06-08-2021
 * Description: A program that generates an html file containing personal info...
 */
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

public class _23_WebPageGenerator
{
    public static void main(String[] args) throws IOException
    {
        // create a Scanner object for getting input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // declare variables to be used...
        String userName, userBio;

        // prompt for user input
        System.out.print("Enter your name: ");
        userName = keyboard.nextLine();

        System.out.print("Describe yourself: ");
        userBio = keyboard.nextLine();

        // create a PrintWriter object for writing to file
        PrintWriter outputFile = new PrintWriter("Index.html");

        // generate an html file containing user data
        outputFile.println("<html>\n" + 
                           "<head> </head>\n" + 
                           "<body>\n" +
                           "<center>" + userName + "</center>\n" + 
                           "<hr>\n" + userBio + "\n</hr>\n" + 
                           "</body>\n" + 
                           "</html>");

        keyboard.close();
        outputFile.close();
    }
}
