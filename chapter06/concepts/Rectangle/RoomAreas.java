/**
 * This program creates three instances of the rectangle class
 */
import javax.swing.JOptionPane;

public class RoomAreas {
    public static void main(String[] args) {

        // create three instances of the rectangle class
        Rectangle kitchen = new Rectangle("kitchen");
        Rectangle bedroom = new Rectangle("bedroom");
        Rectangle den = new Rectangle("den");

        // accumulator to hold total area
        double totalArea = 0.0;

        // invoke the ProcessRooms method on each Rectangle object created
        totalArea += processRooms(kitchen, totalArea);
        totalArea += processRooms(bedroom, totalArea);
        totalArea += processRooms(den, totalArea);

        // display the total area
        String msg = String.format("The total area of the rooms is %.1f", totalArea);
        JOptionPane.showMessageDialog(null, msg, "RoomAreas", JOptionPane.PLAIN_MESSAGE);
        
    } // end of main method

    public static double processRooms(Rectangle rectangle, Double totalArea){

        // prompt for user input
        String strLength = "What is the " + rectangle.getName() + "'s length?";
        String strWidth = "What is the " + rectangle.getName() + "'s width?";

        String strInput = JOptionPane.showInputDialog(strLength);
        double length = Double.parseDouble(strInput);
        rectangle.setLength(length);

        strInput = JOptionPane.showInputDialog(strWidth);
        double width =  Double.parseDouble(strInput);
        rectangle.setWidth(width);

        // calculate the area and store it in totalArea
        double area = rectangle.getArea();
        return area;

    } // end of processRooms method
}
