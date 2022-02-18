/**
 * This program runs a simple test of the cellphone class.
 */
import java.util.Scanner;

public class CellPhoneTester {
    public static void main(String[] args) {
        // craete a scanner object
        Scanner keyboard = new Scanner(System.in);

        // create a cellphone object
        CellPhone cellPhone = new CellPhone();

        // prompt for input and initialize object
        System.out.print("\nEnter the manufacturer: ");
        String manufact = keyboard.nextLine();
        cellPhone.setManufact(manufact);

        System.out.print("Enter the model number: ");
        String model = keyboard.nextLine();
        cellPhone.setModel(model);

        System.out.print("Enter the retail price: ");
        double price = keyboard.nextDouble();
        cellPhone.setRetailPrice(price);

        // display the results
        System.out.printf(
            "\nHere is the data that you provided:\n" +
            "Manufacturer: %s\n" +
            "Model number: %s\n" +
            "Retail Price: $%.1f\n", cellPhone.getManufact(), cellPhone.getModel(), 
            cellPhone.getRetailPrice()
        );

        // close scanner object
        keyboard.close();
    }
}
