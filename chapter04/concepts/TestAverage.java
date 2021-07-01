/**
 * Author     : @patrick
 * Description: A program that a teacher might use to get the average of each 
 *              student’s test scores.
 */

import java.util.Scanner; // import the Scanner class

public class TestAverage
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int var_score,
            var_total_score = 0; // accumulator to  hold total test scores

        double var_average_test_score;

        System.out.print("How many students do you have? ");
        int var_students  = keyboard.nextInt();

        System.out.print("How many test scores per student? ");
        int var_test_scores = keyboard.nextInt();

        // process all the students
        for (int student = 1; student <= var_students; student++)
        {
            System.out.println("\nStudent number " + student);
            System.out.println("-------------------------");

            // get the test scores for each student
            for (int test = 1; test <= var_test_scores; test++)
            {
                System.out.print("Enter score " + test + ": ");
                var_score = keyboard.nextInt();
                var_total_score += var_score;  // add each test score enter to total score
            }

            // calculate and display the average
            var_average_test_score = var_total_score / var_test_scores;
            System.out.printf("The average for student number %d is %3.1f\n", 
                             student, var_average_test_score);

            var_total_score = 0; // empty the accumulator (total score) to leave room for other students if any
        }

    }
}
