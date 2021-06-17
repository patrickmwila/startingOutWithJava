/**
 * author @patrick
 * Concept: It is possible to execute more than one statement in the 
 *          initialization expression and the update expression.
 */

public class MultiVariable
{
    public static void main(String[] args)
    {
        int x, y;
        for (x = 1, y = 1; x <= 5; x++, y++)
        {
            System.out.println(x + " + " + y + " = " + (x + y));
        }
    }
}
