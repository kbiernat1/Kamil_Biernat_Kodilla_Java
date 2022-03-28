package com.kodilla.exception.thirdChallenge;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    Map<String, Boolean> flightMap;

    private boolean airportName(String airport) throws RouteNotFoundException {
        if (flightMap.containsKey(airport)) {
            return flightMap.get(airport);
        } else {
            throw new RouteNotFoundException("airport not in the map");
        }
    }

    public boolean findAirports(Flight flight) throws RouteNotFoundException {
        return airportName(flight.getDepartureAirport()) && airportName(flight.getArrivalAirport());
    }

    public Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        return flightMap;
    }
}
