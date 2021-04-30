package hw08;
import java.util.*;
public class Itinerary {
    private List<Flights> flights;
    public Itinerary(List<Flights> flights) {
        this.flights=flights;
    }
    public long getTotalTravelTime() {
        return (flights.get(flights.size()-1).getArrivalTime().getTimeInMillis() - flights.get(0).getDepartureTime().getTimeInMillis())/60000;
    }
    public long getTotalFlightTime() {
        long flightTime=0;
        for (Flights tFt : flights) {
            flightTime += tFt.getFlightTime();
        }
        return flightTime;
    }
}
