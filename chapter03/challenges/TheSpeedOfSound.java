/** * @author patrick
 * source code source for programming challenge - 12
 * chapter 3 | startingOutWithJava 7/e (Tonny Gaddis).
 */
import javax.swing.JOptionPane;

public class TheSpeedOfSound
{
    public static void main(String[] args) {
        // declare and initialize final variables for speed of air, water and steel in feet/s.
        final int AIR   = 1100,
                  WATER = 4900,
                  STEEL = 16400;

        String var_prompt  = "Enter \"air\", \"water\", or \"steel\"",
               var_prompt2 = "Enter the distance that a sound wave will " +
                             "travel in the medium",
               var_title   = "TheSpeedOfSound",
               var_error   = "Invalid input for medium";

        String var_medium = JOptionPane.showInputDialog(var_prompt);

        String var_str_distance = JOptionPane.showInputDialog(var_prompt2);
        int var_distance = Integer.parseInt(var_str_distance);

        if (var_medium.equalsIgnoreCase("air"))
        {
            double var_time = var_distance/AIR;
            String var_message = String.format("The amount of time it will " +
                                               "take for sound to travel in " +
                                               "air is %.1fs", var_time);

            JOptionPane.showMessageDialog(null, var_message, var_title, JOptionPane.INFORMATION_MESSAGE);
        }
        else if(var_medium.equalsIgnoreCase("water"))
        {
            double var_time = var_distance/WATER;
            String var_message = String.format("The amount of time it will " +
                                               "take for sound to travel in " +
                                               "water is %.1fs", var_time);

            JOptionPane.showMessageDialog(null, var_message, var_title, JOptionPane.INFORMATION_MESSAGE);
        }
         else if (var_medium.equalsIgnoreCase("STEEL"))
        {
            double var_time = var_distance/STEEL;
            String var_message = String.format("The amount of time it will " +
                                               "take for sound to travel in " +
                                               "steel is %.1fs", var_time);

            JOptionPane.showMessageDialog(null, var_message, var_title, JOptionPane.INFORMATION_MESSAGE);
        }
        else 
        {
            JOptionPane.showMessageDialog(null, var_error, var_title, JOptionPane.ERROR_MESSAGE);
        }
    }
}
