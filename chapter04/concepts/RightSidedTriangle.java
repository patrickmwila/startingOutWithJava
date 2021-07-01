
public class RightSidedTriangle
{
    public static void main(String[] args)
    {

        final int SIZE = 5;

        for (int row = 1; row <= SIZE; row++)
        {
            for (int col = row; col <= SIZE; col++)
            {
                System.out.print("  ");
            }

            for (int col = 1; col <= row; col++)
            {
                System.out.print("* ");

            //  System.out.print("* ");  // display a completely different triangle
            }

            System.out.println(); // display a blank line after each row
        }
    }
}
