/*
 * Author     : Patrick Mwila
 * Date       : 20/07/2021
 * Description: A program that displays a table of the Celsius temperatures
 *              0 through 20 and their Fahrenheit equivalents. 
 */
 public class _11_CelsiusToFahrenheit
 {
    public static void main(String[] args)
    {
        // display the column values
        System.out.println("\nCelsius\t\tFahrenheit");
        System.out.println("--------------------------");
        
        // variable declaration
        int celsius;
        double fahrenheit;
        
        // a loop to convert celsius to Fahrenheit
        for (celsius = 0; celsius <= 20; celsius++)
        {
            fahrenheit = (9.0/5.0 * celsius ) + 32;
            System.out.printf(" %d \t\t %.1f ", celsius, fahrenheit);
            
            System.out.println(); // display a blank line after each row
        }
    }
 }
