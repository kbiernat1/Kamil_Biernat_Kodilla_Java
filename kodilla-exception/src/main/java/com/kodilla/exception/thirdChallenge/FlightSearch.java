package com.kodilla.exception.thirdChallenge;

import java.util.Map;

public class FlightSearch {

    Map<String, Boolean> flightMap;
    public FlightSearch(Map<String, Boolean> flightMap) {
        this.flightMap = flightMap;
    }

    private boolean airportName(String airport) throws RouteNotFoundException {
        if (flightMap.containsKey(airport)) {
            return flightMap.get(airport);
        } else {
            throw new RouteNotFoundException("airport not in the map");
        }
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        return airportName(flight.getDepartureAirport()) && airportName(flight.getArrivalAirport());
    }
}
