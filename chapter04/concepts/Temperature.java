/**
 * @author patrick
 *
 * 1. Prompt the user to enter the substance’s temperature.
 * 2. Repeat the following steps as long as the temperature is
 *    greater than 102.5 degrees Celsius:
 *
 *      a. Tell the technician to turn down the thermostat, wait 5
 *         minutes, and check the temperature again.
 *      b. Prompt the user to enter the substance’s temperature.
 *
 *  3.After the loop finishes, tell the technician that the
 *    temperature is acceptable and to check it again in 15
 *    minutes.
 */

import javax.swing.JOptionPane;

public class Temperature
{
    public static void main(String[] args)
    {
        final double MAX_TEMP = 102.5;
              double var_temp;

        String var_prompt  = "Enter the substance's temperature",
               var_info1   = "The temperature is too high. Turn down the "+
                             "\nthermostat, wait 5 minutes, and check the " +
                             "\ntemperature again.",
               var_info2   = "Temperature is acceptable, check it again in " +
                             "\n15 minutes.",

               var_title   = "TEMPERATURE",
               var_str_temp = null;

        var_str_temp = JOptionPane.showInputDialog(var_prompt);
        var_temp     = Double.parseDouble(var_str_temp);

        while (var_temp > MAX_TEMP)
        {
            JOptionPane.showMessageDialog(null, var_info1, var_title,
                                          JOptionPane.ERROR_MESSAGE);
            
             var_str_temp = JOptionPane.showInputDialog(var_prompt);
             var_temp = Double.parseDouble(var_str_temp);
        }

        JOptionPane.showMessageDialog(null, var_info2, var_title, 
                                      JOptionPane.INFORMATION_MESSAGE);
    }
}
