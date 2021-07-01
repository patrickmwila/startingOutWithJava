
public class DecreasingTriangle
{
    public static void main(String[] args)
    {

        final int SIZE = 5;

        for (int row = 1; row <= SIZE; row++)
        {
            for (int col = row; col <= SIZE; col++)
            {
                System.out.print("*");
            }
            System.out.println(); // display a blank line after each row
        }
    }
}
