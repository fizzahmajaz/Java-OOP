public class Flight {

private String flightNumber;
private String origin;
private String destination;
private String date; //format YYYY-MM-DD
private int availableSeats;  


//constructor to take values
public Flight(String flightNumber, String origin, String destination,  String date, int availableSeats){
    this.flightNumber = flightNumber;
    this.origin = origin;
    this.destination = destination;
    this.date = date;
    this.availableSeats = availableSeats;
}

//getters

public String getFlightNumber() {
    return flightNumber;
}

public String getOrigin() {
    return origin;
}

public String getDestination() {
    return destination;
}

public String getDate() {
    return date;
}

public int getAvailableSeats() {
    return availableSeats;
}

//Reduce seats

public void reduceSeats(){
    if (availableSeats > 0){
        availableSeats--;
    }
}

//Increase seats

public void increaseSeats(){
    availableSeats++;
}

public String toString(){
    return "Flight{" + "Flight No='" + flightNumber + '\'' +
    ", From='" + origin + '\'' +
    ", To='" + destination + '\'' +
    ", Date='" + date + '\'' +
    ", Seats Availible='" + availableSeats + '\'' +
    '}';
}










    
}
