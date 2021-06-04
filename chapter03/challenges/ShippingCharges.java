/**
 * @author patrick
 * source code source for programming challenge - 9
 * chapter 3 | startingOutWithJava 7/e (Tonny Gaddis).
 */
import java.util.Scanner;

public class ShippingCharges
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("======= Fast Freight Shipping Company =======");
    
        System.out.print("Enter the weight of a package: ");
        double var_weight = keyboard.nextDouble();

        if (var_weight < 2.0)
        {
            System.out.println("Shipping fee is $1.10");
        }
        
        else if (var_weight > 2.0 && var_weight <= 6.0)
        {
            System.out.println("Shipping fee is $2.20");
        }
        else if (var_weight > 6.0 && var_weight <= 10.0)
        {
            System.out.println("Shipping fee is $3.70");
        }
         else 
        {
            System.out.println("Shipping fee is $3.80");
        }
    }
}
