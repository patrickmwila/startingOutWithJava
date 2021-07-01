/**
 * Author : @patrick
 * Concept: The Java API provides several classes that you can use for
 *          writing data to a file and reading data from a file. 
 *          To write data to a file, you can use the PrintWriter class and, 
 *          optionally, the FileWriter class. To read data from a file, you 
 *          can use the Scanner class and the File class.
 */

import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class PrintWriterClone
{
    public static void main(String[] args) throws FileNotFoundException
    {
        // create an outputFile object. Open or create PersonalData.txt file and link it to outputFile
        PrintWriter var_output_file = new PrintWriter("PersonalData.txt"); 

        String var_admin = "Patrick Mwila",  // declare var_admin and initialize it with admin name
               var_id    = "2019037459";     // declare var_id and initialize it with ID number

        // write the above data stored as variables to filename PersonalData.txt
        //
        var_output_file.print(var_admin + " ");
        var_output_file.print(var_id);
        var_output_file.println("\npatrickmwila.org@gmail.com");

        var_output_file.close(); // close the opened file to ensure all data in the ram buffer is written to it
    }
}
