import java.util.Scanner;

public class ChoHan {
    
    public static void main(String[] args) {

        // create a Scanner object
        Scanner keyboard = new Scanner(System.in);

        // create a Dealer object
        Dealer dealer = new Dealer();

        // variables
        final int ADD_POINT = 1;
        String name;

        // prompt for user input
        System.out.print("\nEnter the first player's name: ");
        name = keyboard.nextLine();

        // create a Player object
        Player player1 = new Player(name);

        System.out.print("Enter the second player's name: ");
        name = keyboard.nextLine();

        // create a Player object
        Player player2 = new Player(name);


        // start game
        for ( int i = 1; i <= 5; i++ ){

            dealer.rollDice();

            // allow players to make their guesses
            player1.makeGuess();
            player2.makeGuess();

            System.out.printf(
                "\n----------------------------" +
                "\nNow playing round %d" +
                "\nThe dealer rolled %d and %d" +
                "\nResult: %s\n", i, dealer.getDie1Value(), dealer.getDie2Value(), 
                dealer.getChoOrHan()
            );
            
            // award points 
            if ( player1.getGuess().equals(dealer.getChoOrHan()) ) {
                player1.addPoints(ADD_POINT);

                System.out.println("The player " + player1.getName() + " guessed " + player1.getGuess());
                System.out.println("Awarding " + ADD_POINT + " point(s) to "  + player1.getName());
            }
            else {
                System.out.println("The player " + player1.getName() + " guessed " + player1.getGuess());
            }

            if ( player2.getGuess().equals(dealer.getChoOrHan()) ) {
                player2.addPoints(ADD_POINT);
                System.out.println("The player " + player2.getName() + " guessed " + player2.getGuess());
                System.out.println("Awarding " + ADD_POINT + " point(s) to "  + player2.getName());
            }
            else {
                System.out.println("The player " + player2.getName() + " guessed " + player2.getGuess());

            }
        }


        // display final results
        System.out.println(
            "\n----------------------------" +
            "\nGame over. Here are the results: \n" +
            player1.getName() + ": " + player1.getPoints() + " point(s).\n" +
            player2.getName() + ": " + player2.getPoints() + " point(s)." 
        );

        if ( player1.getPoints() > player2.getPoints() ){
            System.out.println(
                player1.getName() + " is the grand winner!"
            );
        }

        else if ( player1.getPoints() < player2.getPoints() ) {
            System.out.println(
                player2.getName() + " is the grand winner!"
            );
        }

        else {
            System.out.println("It's a tie!");
        }

        keyboard.close();
    }
}
