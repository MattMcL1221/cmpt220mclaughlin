package hw08;
import java.util.*;
public class Problem3 {                               //Flights uses params(String, departureTime, arrivalTime)
    public static void main(String[] args) {        //GregorianCalender uses parameters
        List<Flights> flights = new ArrayList<>(); //Year,Month,DayOfMonth,Hour,Minutes,Seconds
        flights.add(new Flights("US230", new GregorianCalendar(2014, 4, 5, 5, 5, 0), new GregorianCalendar(2014, 4, 5, 6, 15, 0)));
        flights.add(new Flights("US235", new GregorianCalendar(2014, 4, 5, 6, 55, 0), new GregorianCalendar(2014, 4, 5, 7, 45, 0)));
        flights.add(new Flights("US237", new GregorianCalendar(2014, 4, 5, 9, 35, 0), new GregorianCalendar(2014, 4, 5, 12, 55, 0)));
        Itinerary itinerary = new Itinerary(flights);
        System.out.println("Total Travel Time: " + itinerary.getTotalTravelTime() + " Minutes.");
        System.out.println("Total Flight Time: " + itinerary.getTotalFlightTime() + " Minutes.");
    }
}
