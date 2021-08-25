/**
 * Author     : Patrick Mwila
 * Date       : 24-08-2021
 * Description: This program calculates the distance of a falling object
 */
import java.util.Scanner;

public class _05_FallingDistance
{
    public static void main(String[] args)
    {
        // create a Scanner object for keybaord input
        Scanner keyboard = new Scanner(System.in);
        
        // variable declaration
        double time, distance;
        String str, output;

        // run the program 10 times for different values of time
        System.out.println("The program will run for 10 times\n");
        for (int count = 1; count <= 10; count++)
        {
            // prompt for user input
            System.out.print(
                "Enter the time in seconds it took for the object to fall "
            );
            time = keyboard.nextDouble();

            // invoke the fallingDistance() 
            distance = fallingDistance(time);

            // display the results
            output = String.format(
                        "The distance covered by the object is %.1fm", distance
                     );
            System.out.println(output + "\n\n");
        }
    }

    /**
     * fallingDistance() calculates the distance of a given object
     * @param seconds stores an object's falling time in seconds
     *
     * @return the distance the of an object covers when it falls
     */
    public static double fallingDistance(double seconds)
    {
        final double G_CONSTANT = 9.8;

        double d = (1.0 / 2.0) * (G_CONSTANT * Math.pow(seconds, 2.0));
        return d;
    }
}
