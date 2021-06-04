/**
 * @author patrick
 * source code source for programming challenge - 10
 * chapter 3 | startingOutWithJava 7/e (Tonny Gaddis).
 */

import java.util.Scanner;

public class FatGramCalculator
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("====== Fat Gram Calculator =====");

        System.out.println("From your preferred food item");
        System.out.print("Enter the number of calories (grams) it contains: ");
        double var_calories = keyboard.nextDouble();

        double var_per_calories = var_calories * 0.3;

        System.out.print("Enter the number of fat (grams) it containes: ");
        double var_fat = keyboard.nextDouble();

        double var_fat_calories = var_fat * 9;
        double var_per_fat_calories = var_fat_calories / var_calories;


        if (var_fat_calories > var_calories)
        {
            System.out.println("\nThe number of calories (grams) is invalid!");
        }
        else
        {
            System.out.printf("\nCalories comming from fat = %.2fg\n", var_fat_calories);

            if (var_fat_calories < var_per_calories)
            {
                System.out.println("The food is low in fat!");
            }

        }
    }
}
