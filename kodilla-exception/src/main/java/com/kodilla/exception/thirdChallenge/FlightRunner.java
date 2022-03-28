package com.kodilla.exception.thirdChallenge;

public class FlightRunner {
    public static void main(String[] args) throws RouteNotFoundException {
        Flight flight1 = new Flight("WAR", "WRO");
        Flight flight2 = new Flight("WAR", "OSL");
        Flight flight3 = new Flight("WAR", "KRK");
        Flight flight4 = new Flight("KEF", "WRO");

        FlightSearch flightSearch = new FlightSearch();

        flightSearch.findFlight(flight1);
        flightSearch.findFlight(flight2);
        flightSearch.findFlight(flight3);
        flightSearch.findFlight(flight4);

        try {
            System.out.println("Exists: " + flightSearch.findAirports(flight1));
        } catch (RouteNotFoundException e) {
            System.out.println("Does not exist");
        }

        try {
            System.out.println("Exists: " + flightSearch.findAirports(flight2));
        } catch (RouteNotFoundException e) {
            System.out.println("Does not exist");
        }
    }
}
