package com.kodilla.good.patterns.flights;

public class ConnectingFlight {
    private Flights from;
    private Flights to;

    public ConnectingFlight(Flights from, Flights to) {
        this.from = from;
        this.to = to;
    }

    public Flights getFrom() {
        return from;
    }

    public Flights getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "ConnectingFlight{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConnectingFlight that = (ConnectingFlight) o;

        if (!from.equals(that.from)) return false;
        return to.equals(that.to);
    }

    @Override
    public int hashCode() {
        int result = from.hashCode();
        result = 31 * result + to.hashCode();
        return result;
    }
}
