//package chapter2.challenges;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author patrick
 * Practicing various java syntax and programming concepts
 */
public class Fundamentals 
{
   public static void main(String[] args) 
   {
   	
   	// Demonstrating different data types
      int testing = 32768;
      long days = 189000L;
      System.out.println(testing);
      System.out.println(days);
       		
   	
   	// Variable declaration and initialization at the same time
      int length = 10, width = 5, area = length * width;
      System.out.println();   // print a blank line
      System.out.println(area);
   		
   	
   	// Every floating point literal is considered a double unless forced by the programmer
      float pi = 3.142F;
      System.out.println("\nThe value of pie is always known as: " + pi);
   
   	
   	// Demonstrating the boolean data type
      boolean bool = true;
      System.out.println(bool);
   
   	
   	// The char data type stores numbers under the wood
      System.out.println(); // print a blank line
      char letter = 65;
      System.out.println(letter);
   	
   	
      char letter2 = 66;
      System.out.println(letter2);
   		
   	
   	// Variables hold only one value at a time
      System.out.println(); // print a blank line
      int x = 5;
      System.out.println(x);
      x = 99;
      System.out.println(-x);
   		
   	
   	// Variable names are case sensitive
      System.out.println(); // print a blank line
      float sales = 23.0F, Sales = 12.45F;
      System.out.println(sales + "," + Sales);
   	
   	
   	// Integer division
      System.out.println("\nDemonstrating integer division!");
      double num;
      num = 5 / 2;
      System.out.println(num);
   
   	
   	// Using the built in Math class 
      double computingPower, computingSqrt;
   
   	
      computingPower = Math.pow(3, 2);
      System.out.println(); // print a blank line
      System.out.println(computingPower); 
   
   	
      computingSqrt = Math.sqrt(9.0);
      System.out.println();  // print a blank line
      System.out.println(computingSqrt);
   
   	
   	// Java is a strongly typed language
   	// Conversion between different data types
   
      System.out.println(); // print a blank line
      int p;
      double y = 2.5;	

   	// p = y; // this causes an error "type mismatch"
   	// Refer to the book startingOutWithJava by Tony Gaddis for more details
      p = 20;
      y = p;  // (widening conversion) this works cause double is bigger than int
      System.out.println(y);
   	
   
   	// Casting using unary operators
      p = (int)y; // forcing double variable y to int via casting
      System.out.println(p);
   
   
        // Demonstrating casting
      int pies = 10, people = 4;
      double piesPerPerson = (float)pies / people; // unary operation occurs first on variables pies causing the result to be double
      System.out.println("Pies per person: " + piesPerPerson);
   
       
        // Demonstrating the behaviour of byte, short and int calculations
      short a = 10, b = 10;
      short c = (short)(a + b); // Here casting (a + b) is vital as the result is treated as int under the wood which would cause an error if we try to store an integer result in a short variable
      System.out.println(c);
        
   
        // Method 2
        // Adding more space to solve type mismatch which would occur on line 114 if casting was not applied
      int d = a + b;
      System.out.println("\n" + d);
   
        
        // Demonstrating the above on floating point leterals 
      float e = 12.0212F, f = 3.1342F; // suffix the leteral value with capital 'F' or lowercase 'f'
      float g = e + f;
      System.out.println("\n" + g);
        
   
        // Doubel + int = Double and therefore the result should be stored in a double variable  
      double h = 3.24;
      int i = 4;
        // int k = i + j; // causes an error
        // fix: method 1 | casting if you want the result to be integer
      int j = (int)(h + i);
      System.out.println("\n" + j);
   
   
        // fix: method 2 | Adding more space
      double k = h + i;
      System.out.println("\n" + k);
        // The same principle applies if performing calculations on float, long...
        
        
        // The String class		
      System.out.println(); // print a blank line
      String firstName = "Patrick";
      String lastName = " Mwila";
      System.out.println(firstName + lastName);
        
       
        // accessing methods of the String class through the created objects which are referenced by the String variables
      System.out.println("\"Patrick\" has " + firstName.length() + " characters.");
      System.out.println("\nHere is how patrick looks like when printed in different formats:");
      System.out.println("Lowercase: " + firstName.toLowerCase());
      System.out.println("Uppercase: " + firstName.toUpperCase());
        
      System.out.println(firstName.charAt(3) + " is at index 3 in 'patrick'");
        
   
        // The Scanner Class | How to read input from keyboard
      String name;
      Scanner keyboard = new Scanner(System.in);
   
      System.out.print("\nHello What is your name? ");
      name = keyboard.nextLine();
        
      String message = name + ", Enter an integer value ";
        //number = keyboard.nextInt();
        
      String integerOne = JOptionPane.showInputDialog(message);
      int userInteger1Parse = Integer.parseInt(integerOne);
        
        //System.out.println("The value you entered is: " + number);
   
      String message1 = "The value you entered is: " + integerOne; 
   
        // Dialog Boxes
        //JOptionPane outPut = new JOptionPane(); // Create an a JOptionPane object in memory and reference it by its address linked to outPut class variable
      JOptionPane.showMessageDialog(null, message1);
        
      String integerTwo = JOptionPane.showInputDialog("Enter the Second integer value");
      int userInteger2Parse = Integer.parseInt(integerTwo);
   
      int integerResult = userInteger1Parse + userInteger2Parse;
   
      String message2 = "The addition result of the two values you entered is: " + integerResult;
      JOptionPane.showMessageDialog(null, message2);
   
      keyboard.close(); // closes the keyboard class variable
      System.exit(0);
   }
}
