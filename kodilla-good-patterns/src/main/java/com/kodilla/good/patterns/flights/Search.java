package com.kodilla.good.patterns.flights;

public class Search {
    public static void main(String[] args) {
        FlightMap flightMap = new FlightMap();

        flightMap.createSet();

        flightMap.findDepartures();
        System.out.println("");

        flightMap.findArrivals();
        System.out.println("");

        flightMap.commonCity("Warszawa");
    }
}
