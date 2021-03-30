package chapter2.challenges;
/**
 * @author patrick
 * source code solution for programming challenge - 2
 * chapter 2 | StartingOutWithJava 7/e (Tony Gaddis).
 */

public class Challenge02 
{
	public static void main(String[] args)
	{
		// Variable declaration
		String firstName,
			   middleName,
			   lastName;
		
		// Variable initialization
		firstName = "Patrick";
		middleName = "DrivenThinker";
		lastName = "Mwila";
		
		// Decalare character variables
		char firstInitial,
		     middleInitial,
		     lastInitial;
		
		// Initialize character variables
	    firstInitial = firstName.charAt(0);
	    middleInitial = middleName.charAt(0);
	    lastInitial = lastName.charAt(0);

	    // Display the details to the console
	    System.out.println("FirstName: " + firstName + ". Whose initial is: " + firstInitial);
	    System.out.println("MiddleNmae: " + middleName + ". Whose initial is: " + middleInitial);
	    System.out.println("lastName: " + lastName + ". Whose initial is: " + lastInitial);

	}

}
