/**
 * @author patrick
 * source code solution for programming challenge - 1
 * chapter 3 | startingOutWithJava 7/e (Tonny Gaddis).
 */

import java.util.Scanner;

public class RomanNumerals
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);

        // prompt user for input
        System.out.print("Enter a number within the range of 1 through 10: ");
        byte var_num = keyboard.nextByte(); // get input and store it in var_num

        // convert the var_num into roman numeral and display it to the user
        switch(var_num)
        {
            case 1:
                System.out.printf("%d in roman numeral is: I\n", var_num);
            break;

            case 2:
                System.out.printf("%d in roman numeral is: II\n", var_num);
            break;

            case 3:
                System.out.printf("%d in roman numeral is: III\n", var_num);
            break;

            case 4:
                System.out.printf("%d in roman numeral is: IV\n", var_num);
            break;

            case 5:
                System.out.printf("%d in roman numeral is: V\n", var_num);
            break;

            case 6:
                System.out.printf("%d in roman numeral is: VI\n", var_num);
            break;

            case 7:
                System.out.printf("%d in roman numeral is: VII\n", var_num);
            break;

            case 8:
                System.out.printf("%d in roman numeral is: VIII\n", var_num);
            break;

            case 9:
                System.out.printf("%d in roman numeral is: IX\n", var_num);
            break;

            case 10:
                System.out.printf("%d in roman numeral is: X\n", var_num);
            break;

            default:
                System.out.println("Invalid Entry!");
            break;
        }
    }
}
