import java.util.Scanner;  // used to create a Scanner object
import java.io.File;       // used to create a File object to hold our file

import java.io.FileWriter;  // used to create an object for appending data to a file
import java.io.PrintWriter; // used to create an object for writing to a file

import java.io.IOException; // used to throw any potential IOException
public class ReadNumbers
{
    public static void main(String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);  // create a Scanner object to read input from the keyboar as it's source

        int var_items = 0;
        double var_price = 0.0;

        FileWriter var_fwriter = new FileWriter("Prices.txt", true); // create a FileWriter object to append text data to the file
        PrintWriter var_output_file = new PrintWriter(var_fwriter);   // create a PrintWriter object to write data to the file

        System.out.print("How many items do you have in your shop? ");
        var_items = keyboard.nextInt();

        //var_output_file.println("-------- PRICES --------");
        for (int count = 1; count <= var_items; count++)
        {
            System.out.printf("Enter price for item number %d: ", count);
            var_price = keyboard.nextDouble();
            
            // store the price in Prices.txt
            var_output_file.println(var_price);
        }

        var_output_file.close(); // stop write process

        System.out.println("\nAll information has been stored in Prices.txt!");
        System.out.println("The following are the contents of Prices.txt\n");

        Scanner var_input = new Scanner(new File("Prices.txt"));

        while (var_input.hasNextDouble())
        {
            System.out.println(var_input.nextDouble());
        }

        var_input.close(); // stop read process
    }
}
