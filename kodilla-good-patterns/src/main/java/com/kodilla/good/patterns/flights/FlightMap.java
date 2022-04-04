package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
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

    public void findDepartures() {
        List<String> departures = createSet().stream()
                .map(Flights::getDeparture)
                .distinct()
                .collect(Collectors.toList());

        departures.stream()
                .forEach(System.out::println);
    }

    public void findArrivals() {
        List<String> arrivals = createSet().stream()
                .map(Flights::getArrival)
                .distinct()
                .collect(Collectors.toList());

        arrivals.stream()
                .forEach(System.out::println);
    }

    public void commonCity(String city) {
        List<String> first = createSet().stream()
                .map(a -> a.getArrival())
                .collect(Collectors.toList());

        List<String> second = createSet().stream()
                .map(b -> b.getDeparture())
                .collect(Collectors.toList());

        boolean common = createSet().stream()
                .filter(c -> first.equals(second)).equals(city);

        if(common) {
            System.out.println(common);
        }
    }
}
