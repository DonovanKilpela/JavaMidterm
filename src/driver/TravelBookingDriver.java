package driver;

/*
 * Name: Donovan Kilpela
 * Course: CIS 171 Java 
 * Date: 6/22/24
 */
import java.util.Scanner;
import model.TravelBooking;

public class TravelBookingDriver {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean continueBooking = true;

		// loop that will run until the user wants to stop booking trips
		while (continueBooking) {
			TravelBooking trip = new TravelBooking();
			trip.getBudget();
			trip.displayDestinationCities();
			trip.chooseDestination();
			trip.displayTravelMethods();
			trip.chooseTravelMethod();
			trip.tripDuration();
			trip.calculateCost();
			trip.displayBookingInformation();

			System.out.println();
			System.out.println("Would you like to keep booking additional trips?");
			System.out.print("Enter y to continue. Enter n to stop booking. : ");
			String reponse = scnr.nextLine().trim().toLowerCase();

			if (!reponse.equals("y")) {
				continueBooking = false;
			}
		}

		scnr.close();
		System.out.println("Thank you, have a wonderful trip");

	}

}
