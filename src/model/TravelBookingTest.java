package model;

/*
 * Information about BeforeEach : https://www.geeksforgeeks.org/junit-5-beforeeach/
 * Information about assertTrue: https://howtodoinjava.com/junit5/junit-5-assertions-examples/
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TravelBookingTest {

	private TravelBooking trip;

	@BeforeEach
	void setUp() {
		trip = new TravelBooking();
	}

	@Test
	void testDefaultConstructor() {
		assertEquals(0, trip.getBudget(), 0.01);
		assertEquals("No destination", trip.getChosenDestination());
		assertEquals("No Travel Method", trip.getChosenTravelMethod());
	}

	@Test
	void testBudget() {
		trip.setBudget(500);
		assertEquals(500, trip.getBudget(), 0.01);
	}

	@Test
	void testChosenDestination() {
		// Tests the place to travel to is Minneapolis
		trip.setChosenDestination("Minneapolis");
		assertEquals(trip.getDestinationCity1(), trip.getChosenDestination());

		// Test the place of travel to is Las Vegas
		trip.setChosenDestination("Las Vegas");
		assertEquals(trip.getDestinationCity2(), trip.getChosenDestination());

		// Test the place of travel to New York
		trip.setChosenDestination("New York");
		assertEquals(trip.getDestinationCity3(), trip.getChosenDestination());
	}

	@Test
	public void testTravelMethod() {
		// Test the travel method of being Car
		trip.setChosenTravelMethod("Car");
		assertEquals(trip.getTravelMethod1(), trip.getChosenTravelMethod());

		// Tests the travel Method being a bus
		trip.setChosenTravelMethod("Bus");
		assertEquals(trip.getTravelMethod2(), trip.getChosenTravelMethod());

		// Tests the travel method being a plane
		trip.setChosenTravelMethod("Plane");
		assertEquals(trip.getTravelMethod3(), trip.getChosenTravelMethod());

	}

	@Test
	public void testCalculateCost() {
		// Test the cost of driving to Minneapolis
		trip.setChosenDestination(trip.getDestinationCity1());
		trip.setChosenTravelMethod(trip.getTravelMethod1());
		trip.calculateCost();
		assertEquals(55, trip.getTravelCost(), 0.01);

		// Test the cost of bus to Minneapolis
		trip.setChosenDestination(trip.getDestinationCity1());
		trip.setChosenTravelMethod(trip.getTravelMethod2());
		trip.calculateCost();
		assertEquals(75, trip.getTravelCost(), 0.01);

		// Test the cost of a plane ticket to Minneapolis
		trip.setChosenDestination(trip.getDestinationCity1());
		trip.setChosenTravelMethod(trip.getTravelMethod3());
		trip.calculateCost();
		assertEquals(158, trip.getTravelCost(), 0.01);

		// Test for driving to Las Vegas
		trip.setChosenDestination(trip.getDestinationCity2());
		trip.setChosenTravelMethod(trip.getTravelMethod1());
		trip.calculateCost();
		assertEquals(206, trip.getTravelCost(), 0.01);

		// Test for riding a bud to Las Vegas
		trip.setChosenDestination(trip.getDestinationCity2());
		trip.setChosenTravelMethod(trip.getTravelMethod2());
		trip.calculateCost();
		assertEquals(186, trip.getTravelCost(), 0.01);

		// Test for a plane ticket to Las Vegas
		trip.setChosenDestination(trip.getDestinationCity2());
		trip.setChosenTravelMethod(trip.getTravelMethod3());
		trip.calculateCost();
		assertEquals(260, trip.getTravelCost(), 0.01);

		// Test of driving to New York
		trip.setChosenDestination(trip.getDestinationCity3());
		trip.setChosenTravelMethod(trip.getTravelMethod1());
		trip.calculateCost();
		assertEquals(150, trip.getTravelCost(), 0.01);

		// Test of riding a bus to New York
		trip.setChosenDestination(trip.getDestinationCity3());
		trip.setChosenTravelMethod(trip.getTravelMethod2());
		trip.calculateCost();
		assertEquals(123, trip.getTravelCost(), 0.01);

		// Test of flying to New York
		trip.setChosenDestination(trip.getDestinationCity3());
		trip.setChosenTravelMethod(trip.getTravelMethod3());
		trip.calculateCost();
		assertEquals(210, trip.getTravelCost(), 0.01);
	}

	@Test
	public void testTripDuration() {
		// Tests and makes sure that the trip duration random number is in the range of
		// 1 - 15
		trip.tripDuration();
		assertTrue(trip.getTripDuration() >= 1 && trip.getTripDuration() <= 15);
	}

}
