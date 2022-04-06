package com.kodilla.good.patterns.flights;

import java.util.*;
import java.util.stream.Collectors;

public class FlightMap {
    Flights flight1 = new Flights("Wrocław", "Gdańsk");
    Flights flight2 = new Flights("Wrocław", "Warszawa");
    Flights flight3 = new Flights("Wrocław", "Kraków");
    Flights flight4 = new Flights("Gdańsk", "Wrocław");
    Flights flight5 = new Flights("Gdańsk", "Poznań");
    Flights flight6 = new Flights("Gdańsk", "Kraków");
    Flights flight7 = new Flights("Poznań", "Gdańsk");
    Flights flight8 = new Flights("Poznań", "Warszawa");
    Flights flight9 = new Flights("Poznań", "Kraków");
    Flights flight10 = new Flights("Warszawa", "Wrocław");
    Flights flight11 = new Flights("Warszawa", "Poznań");
    Flights flight12 = new Flights("Warszawa", "Kraków");
    Flights flight13 = new Flights("Kraków", "Wrocław");
    Flights flight14 = new Flights("Kraków", "Gdańsk");
    Flights flight15 = new Flights("Kraków", "Poznań");
    Flights flight16 = new Flights("Kraków", "Warszawa");

    public Set<Flights> createSet() {
        Set<Flights> flightsSet = new HashSet<>();
        flightsSet.add(flight1);
        flightsSet.add(flight2);
        flightsSet.add(flight3);
        flightsSet.add(flight4);
        flightsSet.add(flight5);
        flightsSet.add(flight6);
        flightsSet.add(flight7);
        flightsSet.add(flight8);
        flightsSet.add(flight9);
        flightsSet.add(flight10);
        flightsSet.add(flight11);
        flightsSet.add(flight12);
        flightsSet.add(flight13);
        flightsSet.add(flight14);
        flightsSet.add(flight15);
        flightsSet.add(flight16);

        return flightsSet;
    }

    public List<Flights> findDepartures(String from) {
        return createSet().stream()
                .filter(d -> d.getDeparture().equals(from))
                .collect(Collectors.toList());
    }

    public List<Flights> findArrivals(String to) {
        return createSet().stream()
                .filter(a -> a.getArrival().equals(to))
                .collect(Collectors.toList());
    }

    public List<ConnectingFlight> findFlights(String from, String to) {
        List<Flights> findDepartures = findDepartures(from);
        List<Flights> findArrivals = findArrivals(to);

        Map<Flights, List<Flights>> result = new HashMap<>();

        findDepartures.stream()
                .forEach(departure -> {
                    List<Flights> list1 = findArrivals.stream()
                            .filter(arrival -> arrival.getDeparture().equals(departure.getArrival()))
                            .collect(Collectors.toList());

                    if (list1.size() > 0) result.put(departure, list1);
                });

        return result.entrySet().stream()
                .map(entry -> {
                    Flights a = entry.getKey();
                    List<Flights> list2 = entry.getValue();
                    ConnectingFlight connectingFlight = new ConnectingFlight(a, list2.get(0));
                    return connectingFlight;
                })
                .collect(Collectors.toList());
    }
}
