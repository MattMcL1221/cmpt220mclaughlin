package hw08;
import java.util.*;
public class Flights {
    private String flightNo;
    private GregorianCalendar departureTime;
    private GregorianCalendar arrivalTime;
    public Flights(String flightNo, GregorianCalendar departureTime, GregorianCalendar arrivalTime) {
        setFlightNo(flightNo);
        setDepartureTime(departureTime);
        setArrivalTime(arrivalTime);
    }

    //get&set departureTime
    public GregorianCalendar getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(GregorianCalendar departureTime) {
        this.departureTime = departureTime;
    }
    //get&set arrivalTime
    public GregorianCalendar getArrivalTime(){
        return arrivalTime;
    }
    public void setArrivalTime(GregorianCalendar arrivalTime) {
        this.arrivalTime=arrivalTime;
    }
    //Get the flight number and the flight time
    public String getFlightNo(){
        return flightNo;
    }
    public void setFlightNo(String flightNo){
        this.flightNo = flightNo;
    }
    public long getFlightTime(){
        return (long)(arrivalTime.getTimeInMillis() - departureTime.getTimeInMillis())/60000;
    }
}
