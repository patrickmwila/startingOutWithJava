/**
 * Author     : 2019037459
 * Description: A program that uses a switch statement to determine 
 *              the output of a program
 */
import java.util.Scanner;

public class SwitchStatement
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        // Get the name of the season from the user
        System.out.printf("Enter the name of a season: ");
        String season = keyboard.next();

        // Translate the season to spanish
        switch(season.toLowerCase())
        {
            case "spring":
                System.out.println("la primavera");
                break;

            case "autumn":
            case "fall":
                System.out.println("el otono");
                break;

            case "winter":
                System.out.println("el invierno");
                break;

            default:
                System.out.println("Please run the program again and enter " +
                        "one of these words:\n'spring', 'summer', 'autumn'," +
                        "'fall', or 'winter'");
        }
        
    }
}
