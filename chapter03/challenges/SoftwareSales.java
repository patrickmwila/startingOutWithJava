/**
 * @author patrick
 * source code source for programming challenge - 8
 * chapter 3 | startingOutWithJava 7/e (Tonny Gaddis).
 */

import java.util.Scanner;

public class SoftwareSales
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        final double PACKAGE_PRICE = 99.0;

        System.out.print("Enter the number of packages purchased: ");
        int var_packages = keyboard.nextInt();

        double var_purchase_price = var_packages * PACKAGE_PRICE;

        if (var_packages >= 10 && var_packages <= 19)
        {
            double var_discount =  0.2 * var_purchase_price,
                   var_purchase = var_purchase_price - var_discount;

            System.out.printf("Discount: $%.2f\n", var_discount);
            System.out.printf("Total Purchase: $%.2f\n", var_purchase);
        }
        
        else if (var_packages >= 20 && var_packages <= 49)
        {
            double var_discount =  0.3 * var_purchase_price,
                   var_purchase = var_purchase_price - var_discount;

            System.out.printf("Discount: $%.2f\n", var_discount);
            System.out.printf("Total Purchase: $%.2f\n", var_purchase);
        }
        
        else if (var_packages >= 50 && var_packages <= 99)
        {
            double var_discount =  0.4 * var_purchase_price,
                   var_purchase = var_purchase_price - var_discount;

            System.out.printf("Discount: $%.2f\n", var_discount);
            System.out.printf("Total Purchase: $%.2f\n", var_purchase);
        }
        
        else if (var_packages >= 100)
        {
            double var_discount =  0.5 * var_purchase_price,
                   var_purchase = var_purchase_price - var_discount;

            System.out.printf("Discount: $%.2f\n", var_discount);
            System.out.printf("Total Purchase: $%.2f\n", var_purchase);
        }
        
        else 
        {
            double var_discount =  0 * var_purchase_price,
                   var_purchase = var_purchase_price - var_discount;

            System.out.printf("Discount: $%.2f\n", var_discount);
            System.out.printf("Total Purchase: $%.2f\n", var_purchase);
        } 
        
    }
}
