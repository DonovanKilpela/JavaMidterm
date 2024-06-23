package model;

/*
 * Information I found on switch statements: https://www.w3schools.com/java/java_switch.asp
 * Information I found on encapsulation: https://www.w3schools.com/java/java_encapsulation.asp 
 * Information I found in lowercase method: https://www.w3schools.com/java/ref_string_tolowercase.asp
 * Information I found on trim(): https://www.w3schools.com/java/ref_string_trim.asp
 */
import java.util.Random;
import java.util.Scanner;

public class TravelBooking {
	Scanner scnr = new Scanner(System.in);

	// Variable declarations
	private String destinationCity1 = "Minneapolis";
	private String destinationCity2 = "Las Vegas";
	private String destinationCity3 = "New York";
	private String travelMethod1 = "Car";
	private String travelMethod2 = "Bus";
	private String travelMethod3 = "Plane";
	private String chosenDestination;
	private String chosenTravelMethod;
	private double budget;
	private int tripDuration;
	private double travelCost;

	// Default constructor
	public TravelBooking() {
		this.setBudget(0.0);
		this.setChosenDestination("No destination");
		this.setChosenTravelMethod("No Travel Method");

	}

	// Getters and Setters for all of the variables above
	public String getDestinationCity1() {
		return destinationCity1;
	}

	public void setDestinationCity1(String destinationCity1) {
		this.destinationCity1 = destinationCity1;
	}

	public String getDestinationCity2() {
		return destinationCity2;
	}

	public void setDestinationCity2(String destinationCity2) {
		this.destinationCity2 = destinationCity2;
	}

	public String getDestinationCity3() {
		return destinationCity3;
	}

	public void setDestinationCity3(String destinationCity3) {
		this.destinationCity3 = destinationCity3;
	}

	public String getTravelMethod1() {
		return travelMethod1;
	}

	public void setTravelMethod1(String travelMethod1) {
		this.travelMethod1 = travelMethod1;
	}

	public String getTravelMethod2() {
		return travelMethod2;
	}

	public void setTravelMethod2(String travelMethod2) {
		this.travelMethod2 = travelMethod2;
	}

	public String getTravelMethod3() {
		return travelMethod3;
	}

	public void setTravelMethod3(String travelMethod3) {
		this.travelMethod3 = travelMethod3;
	}

	public String getChosenDestination() {
		return chosenDestination;
	}

	public void setChosenDestination(String chosenDestination) {
		this.chosenDestination = chosenDestination;
	}

	public String getChosenTravelMethod() {
		return chosenTravelMethod;
	}

	public void setChosenTravelMethod(String chosenTravelMethod) {
		this.chosenTravelMethod = chosenTravelMethod;
	}

	// Method to get budget from the user
	public double getBudget() {
		boolean validInput = false;

		while (!validInput) {
			System.out.print("Enter in your budget (has to be a positve number): $");
			if (scnr.hasNextDouble()) {
				budget = scnr.nextDouble();
				if (budget >= 0) {
					validInput = true;
				} else {
					System.out.println("Invalid input please put in a positive budget amount");

				}
			} else {
				System.out.println("Invaild input, please put in a number");
				scnr.next();
			}
		}
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public int getTripDuration() {
		return tripDuration;
	}

	public void setTripDuration(int tripDuration) {
		this.tripDuration = tripDuration;
	}

	public double getTravelCost() {
		return travelCost;
	}

	public void setTravelCost(int travelCost) {
		this.travelCost = travelCost;
	}

	// Method to show the destination cities to the user
	public void displayDestinationCities() {
		System.out.println("Avaliable destinations");
		System.out.println("City #1. " + destinationCity1);
		System.out.println("City #2. " + destinationCity2);
		System.out.println("City #3. " + destinationCity3);
		System.out.println();
	}

	// Method to get the destination from the user
	// Will only continue once it has valid input
	public void chooseDestination() {
		System.out.print("Enter in the number of the destination city you would like to go to: ");

		int citySelection = scnr.nextInt();
		switch (citySelection) {
		case 1:
			chosenDestination = destinationCity1;
			break;
		case 2:
			chosenDestination = destinationCity2;
			break;
		case 3:
			chosenDestination = destinationCity3;
			break;
		default:
			System.out.println("Invalid Choice please enter in a 1, 2, or 3");
			chooseDestination();
		}
	}

	// Method to show the user travel methods they can choose from
	public void displayTravelMethods() {
		System.out.println("Avaliable Travel Methods");
		System.out.println("Travel method #1. " + travelMethod1);
		System.out.println("Travel method #2. " + travelMethod2);
		System.out.println("Travel method #3. " + travelMethod3);
		System.out.println();
	}

	// Method to get the user to choose which travel method
	// It will only move on when the user enters valid input
	public void chooseTravelMethod() {
		System.out.print("Enter in the number of the travel method you would like to take: ");
		int travelMethodSelection = scnr.nextInt();

		switch (travelMethodSelection) {
		case 1:
			chosenTravelMethod = travelMethod1;
			break;
		case 2:
			chosenTravelMethod = travelMethod2;
			break;
		case 3:
			chosenTravelMethod = travelMethod3;
			break;
		default:
			System.out.println("Invalid Choice please enter a 1, 2, or 3");
			chooseTravelMethod();
		}
	}

	// This will get the cost of the travel method from the selected
	// City and travel method the user provided
	// it will show the user a message about how much it will cost to travel
	// and to the place they have chosen to travel to
	public void calculateCost() {
		if (chosenDestination.equals(destinationCity1)) {
			if (chosenTravelMethod.equals(travelMethod1)) {
				travelCost = 55;
			} else if (chosenTravelMethod.equals(travelMethod2)) {
				travelCost = 75;
			} else {
				travelCost = 158;
			}
		} else if (chosenDestination.equals(destinationCity2)) {
			if (chosenTravelMethod.equals(travelMethod1)) {
				travelCost = 206;
			} else if (chosenTravelMethod.equals(travelMethod2)) {
				travelCost = 186;
			} else {
				travelCost = 260;
			}
		} else {
			if (chosenTravelMethod.equals(travelMethod1)) {
				travelCost = 150;
			} else if (chosenTravelMethod.equals(travelMethod2)) {
				travelCost = 123;
			} else {
				travelCost = 210;
			}
		}
		System.out.printf(
				"Travel cost from Des Moines to " + chosenDestination + " by " + chosenTravelMethod + " is $%.2f",
				travelCost);
		System.out.println();
	}

	// This method will get a random number 1-15 on how long they will be on their
	// trip
	public void tripDuration() {
		Random random = new Random();
		setTripDuration(random.nextInt(15) + 1);
	}

	// This method will show the user all of their choices and how much the total
	// cost is
	// It will also show them the amount they can spend per day on the trip
	public void displayBookingInformation() {
		double remainingBudget = budget - travelCost;
		double dailySpendingLimit = remainingBudget / tripDuration;

		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("Travel Booking Information");
		System.out.println("Destination city: " + chosenDestination);
		System.out.println("Travel Method: " + chosenTravelMethod);
		System.out.println("Trip length is: " + tripDuration + " days");
		System.out.printf("Travel Cost: $%.2f", travelCost);
		System.out.printf("\nRemaining Budget: $%.2f", remainingBudget);
		System.out.printf("\nDaily spendining limit: $%.2f", dailySpendingLimit);
		System.out.println();
		System.out.println("-------------------------------");
	}

}