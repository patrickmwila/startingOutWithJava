/**
 * Author     : Patrick Mwila
 * Date       : 17/07/2021
 * Description: A program that calculates the occupancy rate for each floor of 
 *              Hotel.
 *              Occupancy rate = Number of rooms occupied ÷ Total number of rooms
 */
import java.util.Scanner;

public class _07_HotelOccupancy
{
    public static void main(String[] args)
    {
        // create a Scanner object that will get input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // variable declaration
        int hotelFloors,
            floor,
            rooms,
            totalRooms = 0,
            occupiedRooms,
            totalRoomsOccupied = 0,
            vacantRooms;
        double occupancyRate;

        // prompt for userInput
        System.out.print("\nEnter the number of floors in the hotel: ");
        hotelFloors = keyboard.nextInt();

        while (hotelFloors < 1)
        {
            System.out.print("\nThe number of floors must be atleast 1 " + 
                       "\nEnter the number of floors in the hotel: ");
            hotelFloors = keyboard.nextInt();
        }

        // a loop which iterates once for each floor
        for (floor = 1; floor <= hotelFloors; floor++)
        {
            System.out.printf("\n(%d floor) Enter the number of rooms on " +
                       "this floor: ", floor);
            rooms = keyboard.nextInt();

             while (rooms < 10)
             {
                 System.out.printf("\nNumber of rooms must be atleast 10 " +
                            "\n(%d floor) Enter the number of rooms " +
                            "on this floor: ", floor);
                 rooms = keyboard.nextInt();
             }
             totalRooms += rooms;

             System.out.print("How many rooms are occupied? ");
             occupiedRooms = keyboard.nextInt();

	     while(occupiedRooms > rooms)
	     {
		 System.out.print("\nOccupied rooms cannot exceed number of current rooms!" +
				  "\nEnter valid number of rooms occupied: ");
		 occupiedRooms = keyboard.nextInt();

	     }
             totalRoomsOccupied += occupiedRooms;
            
        }
        // calculate number of rooms which are vacant
        vacantRooms = totalRooms - totalRoomsOccupied;

        // calculate the occupancy rate
        occupancyRate =(double)(totalRoomsOccupied) / (double)(totalRooms);
        // display all the needed information
        System.out.println("\nNumber of rooms the hotel has is: " + totalRooms);
        System.out.println("Number of the rooms occupied is: " + totalRoomsOccupied);
        System.out.println("Number of rooms vacant is: " + vacantRooms);
        System.out.printf("Occupancy rate of the hotel is:  %.2f\n", occupancyRate );
    }
}
