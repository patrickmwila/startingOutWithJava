package chapter2.challenges;
import java.util.Scanner;

/**
 * @author patrick
 * source code solution for programming challenge - 21 
 * chapter 2 | StartingOutWithJava 7/e (Tony Gaddis).
 */ public class Challenge21 
{
	public static void main(String[] args)
	{
        Scanner keyboard = new Scanner(System.in);

        double principalAmount,
               annualInterest,
               amountEarned;

        int interestNumC,
            numOfYears;
       
        // compound interest calculator
        System.out.println("COMPOUND INTEREST CALCULATOR");
        System.out.println("================================================================\n");

        // prompt the user for input
        System.out.print("Enter the principal amount originally deposited into the account: ");
        principalAmount = keyboard.nextDouble();

        System.out.print("Enter the annual interest rate paid by the account: ");
        annualInterest = keyboard.nextDouble(); 

        System.out.print("Enter the number of times per year that the interest is compounded: ");
        interestNumC = keyboard.nextInt();

        System.out.print("Enter the number of years remaining to earn interest: ");
        numOfYears = keyboard.nextInt();

        // compute the compund interest using the formula:
        // A = (1 + r/n)^nt
        
        //amountEarned = principalAmount * ( (1 + (annualInterest/interestNumC) ) ** (interestNumC * numOfYears));
        double halfDone = (1 + (annualInterest/interestNumC) );
        double takePow = (interestNumC * numOfYears);
        amountEarned = principalAmount * Math.pow(halfDone, takePow);

        //Display the amount of money earned after the specified number of years
        System.out.print("\nAfter " + numOfYears + " years your account will have accumulated: K" + amountEarned);

        keyboard.close();
	}

}
