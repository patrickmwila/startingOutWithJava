import java.util.Random;

public class Die{
    // fields
    private int sides;
    private int value;

    /**
     * Constructor
     */
    public Die(int sides){
        this.sides = sides;
    }

    /**
     * The getSides method returns the object's number of sides.
     * @return The number stored in sides field.
     */
    public int getSides() {
        return sides;
    }

    /**
     * The getValue method returns the object's value which is as a result of
     * rolling the simulated dice.
     * @return The number stored in value field.
     */
    public int getValue() {
        return value;
    }

    /**
     * The roll method simulates a rolling dice.
     */
    public void roll(){
        Random rand = new Random();
        this.value = rand.nextInt(this.sides) + 1;
    }
}