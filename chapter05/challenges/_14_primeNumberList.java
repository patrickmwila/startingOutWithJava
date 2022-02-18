import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class _14_primeNumberList
{
    public static void main(String[] args) throws IOException
    {
        // create a PrintWriter object
        PrintWriter outputFile = new PrintWriter("prime.txt");

        // print all prime numbers from 1 to 100
        for (int i = 2; i <= 100; i++)
        {
            boolean num = isPrime(i);

            if (num == true)
            {
                outputFile.println(i);
            }
        }

        // stop writing to the file
        outputFile.close();

    }

    /**
     * isPrime() is used to check if a given number is prime
     * @param number integer to be checked
     * @return true if the argument is a prime number and false if it's not
     */
    public static boolean isPrime(int number)
    {
        boolean isPrimeNumber = true;
        for (int i = 2; i < number; i++)
        {
            if ( ((double)number % i) == 0)
            {
                isPrimeNumber = false;
            }
        }

        return isPrimeNumber;
    }
}
