package hw10;
public class Time implements Cloneable, Comparable<Time>{
    private long time;
    //need to take a look at the flights and itinerary java files to use as a reference 
    public Time() {
        time = System.currentTimeMillis() * 1000; //curentTimeMillis grabs time in milliseconds from when the Unix Epoch was created
    }                                         //aka - Jan 1st, 1970
    public Time(long t) {
        this.time = t;
    }
    public Time(int hours, int minutes, int seconds) { //Constructor
        time = (hours * 60 * 60);
        time += (minutes * 60);
        time += (seconds);
    }
    public void setTime(long lengthOfTime) {
        time = lengthOfTime;
    }
    public long getTime() {
        return time;
    }
    public int getHour() {
        return (int)(time / (60 * 60)) % 24; //1000 Milliseconds within ONE second * 60 minutes * 60 seconds
    }                                                  //Only 24 hours in a day so %24 to find the remaining hours from total time
    public int getMinute() {
        return (int)(time / (60)) % 60; //60 mins in an hour
    }
    public int getSecond() {
        return (int)((time) % 60);
    }
    public int getSeconds() {
        return (int)(time); 
    }
    @Override
    public String toString() {
        return getHour() + " Hours, " + getMinute() + " Minutes, " + getSecond() + " Seconds";
    }
    @Override // Implement the compareTo method in Comparable
    public int compareTo(Time o) {
        return (int)(time - o.getTime());
    }
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex) {
            return "Error: Clone Not Supported";
        }
    }
}
