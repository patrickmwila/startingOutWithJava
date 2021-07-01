public class Rectangle
{
    public static void main(String[] args)
    {
        final int SIZE = 10;

        for (int row = 1; row <= SIZE; row++)
        {
            for (int col = 1; col <= SIZE; col++)
            {
                System.out.print("* ");
            }
            System.out.println(); // display a blank line after each row
        }
    }
}
