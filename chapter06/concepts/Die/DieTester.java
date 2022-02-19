public class DieTester {
    public static void main(String[] args) {
        final int DIE1_SIDES = 6;
        final int DIE2_SIDES = 12;
        final int MAX_ROLLS = 5;

        // create a Die object
        Die die1 = new Die(DIE1_SIDES);
        Die die2 = new Die(DIE2_SIDES);

        die1.roll();
        die2.roll();

        System.out.printf(
            "\nThis simulates the rolling of a 6 sided die and a 12 sided die." +
            "\nInitial value of the dice: " +
            "\n%d %d" +
            "\nRolling the dice %d times.\n", die1.getValue(), die2.getValue(), MAX_ROLLS
        );

        // roll the die MAX_ROLLS times
        for(int i = 1; i <= MAX_ROLLS; i++)
        {
            die1.roll();
            die2.roll(); 

            // display the results
            System.out.printf(
                "%d %d\n", die1.getValue(), die2.getValue()
            );

        } // O(n)

    }
}
