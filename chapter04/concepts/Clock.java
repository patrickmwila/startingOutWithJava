/**
 * Author : @patrick
 * Concept: A loop that is inside another loop is called a nested loop.
 *          A clock is a good example of something that works like a nested loop.
 *          The following program uses nested loops to simulate a clock.
 *
 *          The simulated clock example brings up a few points about nested loops:
 *
 *          An inner loop goes through all of its iterations for each iteration of an
 *          outer loop.
 *
 *          Inner loops complete their iterations before outer loops do.
 *
 *          To get the total number of iterations of a nested loop, multiply the
 *          number of iterations of all the loops.
 *
 *          Interesting Questions to consider:
 *          What is the maximum number of iteration each loop goes through in
 *          the following code segment?
 */

public class Clock
{
    public static void main(String[] args)
    {
        for (int hours = 1; hours <= 12; hours++)
        {
            for (int minutes = 0; minutes <= 59; minutes++)
            {
                for (int seconds = 0; seconds <= 59; seconds++)
                {
                    System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
                }
            }
        }
    }
}
