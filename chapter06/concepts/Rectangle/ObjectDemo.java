/**
 * This program writes random numbers to a file
 */
import java.util.Scanner;
import java.util.Random;
import java.io.PrintWriter;
import java.io.IOException;

public class ObjectDemo{
    public static void main( String[] args ) throws IOException{
        // create a Scanner object for keyboard input
        Scanner scan = new Scanner( System.in );

        // create a Random object for generating random numbers
        Random rand = new Random();

        System.out.print(
            "\nHow many random numbers should I write? "
        );
        int maxNum = scan.nextInt();

        // create a PrintWriter object
        PrintWriter outputFile = new PrintWriter( "numbers.txt" );

        // use a for loop to write maxNum random numbers to a file
        for ( int count = 0; count <= maxNum; count++ ){

            // generate a random number and write it to file
            outputFile.println( rand.nextInt(maxNum) );

        } // O(n)

        System.out.println( "Done!" );

        scan.close();
        outputFile.close();
    } // end of main method
}