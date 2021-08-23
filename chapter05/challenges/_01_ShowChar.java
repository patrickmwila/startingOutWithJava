/**
 * Author     : Patrick Mwila
 * Date       : 22-08-2021
 * Description: A program that uses a method to display a char of a given 
 *              string object
 */

public class _01_ShowChar
{
    public static void main(String[] args)
    {
        // invoke the showChar() 
        showChar("Patrick", 0);
    }

    /**
     * The showChar() accepts two arguments: a reference to a String object
     * and an integer. The integer arg is a char position within the String.
     * When the method executes, it displays the char at that char position.
     *
     * @param str holds a reference to a string object
     * @param i   holds the index position of a char in str
     */
    public static void showChar(String str, int i)
    {
        System.out.println(str.charAt(i));
    }
}
