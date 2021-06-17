/**
 * author @patrick
 *
 * A program that displays a table of speeds in kilometers per
 * hour with their values converted to miles per hour (MPH). The
 * formula for converting KPH to MPH is MPH = KPH * 0.6214
 */

public class KilometersToMiles
{
    public static void main(String[] args)
    {
        final double UNIT         = 0.6214;
        final int    STARTING_KPH = 60,
                     MAX_KPH      = 600,
                     INCREMENT    = 10;
        
        System.out.println("KPH\t|\tMPH");
        for (int KPH = STARTING_KPH; KPH <= MAX_KPH; KPH += INCREMENT)
        {
            double MPH = KPH * UNIT;
            if (MPH < 100.0)
            {
                System.out.println("---------------------");
                String var_mph = String.format("|%d\t|\t%.1f|", KPH, MPH);
                System.out.println(var_mph);
            }
            else 
            {
                System.out.println("----------------------");
                String var_mph = String.format("|%d\t|\t%.1f|", KPH, MPH);
                System.out.println(var_mph);
            }
        }

    }
}
