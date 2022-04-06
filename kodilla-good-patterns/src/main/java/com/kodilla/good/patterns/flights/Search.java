package com.kodilla.good.patterns.flights;

import java.util.List;

public class Search {
    public static void main(String[] args) {
        FlightMap flightMap = new FlightMap();

        flightMap.createSet();

        List<Flights> departures = flightMap.findDepartures("Kraków");
        System.out.println(departures);

        List<Flights> arrivals = flightMap.findArrivals("Warszawa");
        System.out.println(arrivals);

        List<ConnectingFlight> findFlight = flightMap.findFlights("Wrocław", "Poznań");
        System.out.println(findFlight);

    }
}
