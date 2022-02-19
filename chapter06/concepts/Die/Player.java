import java.util.Random;

public class Player {
    // fields
    private String name;
    private String guess; 
    private int points;

    public Player(String name) {
        this.name = name;
        this.guess = null;
        this.points = 0;
    }

    /**
     * makeGuess methods simulates a player making a guess,
     * either "Cho (even) or Han (odd)".
     */
    public void makeGuess(){
        Random rand = new Random();

        // generate 2 numbers 0 for "Cho" or 1 for "Han"
        int num = rand.nextInt(2);

        if (num == 0){
            this.guess = "Cho (even)";
        }
        else{
            this.guess = "Han (odd)";
        }
    }

    /**
     * addPoints methods updates the points attribute if player makes the 
     * correct guess.
     * @param points is the value to be added to the points field.
     */
    public void addPoints(int point){
        this.points += point;
    }

    /**
     * getName method returns the name of a player.
     * @return name of a player.
     */
    public String getName() {
        return name;
    }

    /**
     * getGuess methods returns the players guess.
     * @return players guess.
     */
    public String getGuess() {
        return guess;
    }


    /**
     * getPoints method returns the total points of a player.
     * @return number of points the player has accumulated.
     */
    public int getPoints() {
        return points;
    }
    
}
