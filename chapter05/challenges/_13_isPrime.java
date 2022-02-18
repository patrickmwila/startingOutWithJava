import java.util.Scanner;

public class _13_isPrime
{
    public static void main(String[] args)
    {
        // create a Scanner instance
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scan.nextInt();

        boolean isNumPrime = isPrime(num);

        if (isNumPrime == true)
        {
            System.out.println("The number you entered is prime.");
        }
        else
        {
            System.out.println("The number you entered is not prime");
        }


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
