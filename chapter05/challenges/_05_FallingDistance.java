/**
 * Author     : Patrick Mwila
 * Date       : 24-08-2021
 * Description: This program calculates the distance of a falling object
 */
import javax.swing.JOptionPane;

public class _05_FallingDistance
{
    public static void main(String[] args)
    {
        // variable declaration
        double time, distance;
        String str, output;

        // prompt for user input
        str = JOptionPane.showInputDialog(
                 "Enter the time in seconds it took for the object to fall "
              );
        time = Double.parseDouble(str);

        // invoke the fallingDistance() 
        distance = fallingDistance(time);

        // display the results
        output = String.format(
                    "The distance covered by the object is %.2fm", distance
                 );
        JOptionPane.showMessageDialog(null, output);
    }

    /**
     * fallingDistance() calculates the distance of a given object
     * @param seconds stores an object's falling time in seconds
     *
     * @return the distance the of an object covers when it falls
     */
    public static double fallingDistance(double seconds)
    {
        final double G_CONSTANT = 9.8;

        double d = (1.0 / 2.0) * (G_CONSTANT * Math.pow(seconds, 2.0));
        return d;
    }
}
