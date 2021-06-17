/**
 * @author patrick
 * Description: A program that calculates the number of soccer teams a youth 
 *              league may create, based on a given number of players 
 *              and a maximum number of players per team.
 */
import javax.swing.JOptionPane;

public class SoccerTeams
{
    public static void main(String[] args)
    {
        final int MIN_PLAYERS = 9,
                  MAX_PLAYERS = 15;

        int var_players,            // number of available players
            var_team_size,          // number of players per team
            var_teams,              // number of teams
            var_leftover;           // number of leftover players

        String  var_input;          // to hold user input

        var_input = JOptionPane.showInputDialog("Enter the number of players "+
                                                "per team.");
        var_team_size = Integer.parseInt(var_input);

        // validate the number entered
        while (var_team_size < MIN_PLAYERS || var_team_size > MAX_PLAYERS)
        {
            var_input = JOptionPane.showInputDialog("The number must be atleast " + 
                                        MIN_PLAYERS + " and no more than " + 
                                        MAX_PLAYERS + ".\nEnter the number " +
                                        "of players per team." );

            var_team_size = Integer.parseInt(var_input);
        }

        var_input = JOptionPane.showInputDialog("Enter the available number "+ 
                                                "of players.");
        var_players = Integer.parseInt(var_input);

        // validate the number entered
        while(var_players < 0)
        {
            var_input = JOptionPane.showInputDialog("Enter 0 or greater.");
            var_players = Integer.parseInt(var_input);
        }

        // calculate the number of teams
        var_teams = var_players / var_team_size;

        // calculate the number of leftover players
        var_leftover = var_players % var_team_size;

        // display the results
        JOptionPane.showMessageDialog(null, "There will be " + var_teams + " teams" +
                                     " with " + var_leftover+" players left over.");
        System.exit(0);
    }
}
