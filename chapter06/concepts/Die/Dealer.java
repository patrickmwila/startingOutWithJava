public class Dealer {

    // fields
    private int die1Value;
    private int die2Value;

    
    /**
     * Constructor
     */
    public Dealer(){
        this.die1Value = 0;
        this.die2Value = 0;
    }

    /**
     * The rollDice method simulates the rolling of a six sided die.
     */
    public void rollDice(){
        final int SIDES = 6;

        // create two dice objects
        Die die1 = new Die(SIDES);
        Die die2 = new Die(SIDES);

        // roll the die
        die1.roll();
        die2.roll();

        // record the values 
        this.die1Value = die1.getValue();
        this.die2Value = die2.getValue();
    }

    /**
     * The getDie1Value returns the numbers stored in die1Value.
     * @return The number stored in die1Value field.
     */
    public int getDie1Value() {
        return die1Value;
    }

    /**
     * The getDie2Value returns the number stored in die2Value.
     * @return The number stored in die2Value field.
     */
    public int getDie2Value() {
        return die2Value;
    }

    /**
     * The getChoOrHan checks if the sum of die1Value is even or odd.
     * @return Cho if the sum is even or Han if the sum is odd.
     */
    public String getChoOrHan(){
        int isChoOrHan = this.die1Value + this.die2Value;

        if (isChoOrHan % 2 == 0)
            return "Cho (even)";

        else
            return "Han (odd)";
        
    }
}
