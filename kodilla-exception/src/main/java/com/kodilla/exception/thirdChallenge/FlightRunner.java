package com.kodilla.exception.thirdChallenge;

import java.util.HashMap;
import java.util.Map;

public class FlightRunner {
    public static void main(String[] args) throws RouteNotFoundException {
        Flight flight1 = new Flight("WAR", "WRO");
        Flight flight2 = new Flight("WAR", "OSL");
        Flight flight3 = new Flight("WAR", "KRK");
        Flight flight4 = new Flight("KEF", "WRO");

        Map<String, Boolean> map = new HashMap<>();
        map.put("KRK", true);
        map.put("OSL", true);
        map.put("WAR", true);
        map.put("WRO", true);

        FlightSearch flightSearch = new FlightSearch(map);

        try {
            System.out.println("Exists: " + flightSearch.findFlight(flight1));
        } catch (RouteNotFoundException e) {
            System.out.println("Does not exist");
        }

        try {
            System.out.println("Exists: " + flightSearch.findFlight(flight2));
        } catch (RouteNotFoundException e) {
            System.out.println("Does not exist");
        }

        try {
            System.out.println("Exists: " + flightSearch.findFlight(flight3));
        } catch (RouteNotFoundException e) {
            System.out.println("Does not exist");
        }

        try {
            System.out.println("Exists: " + flightSearch.findFlight(flight4));
        } catch (RouteNotFoundException e) {
            System.out.println("Does not exist");
        }
    }
}