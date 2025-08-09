import java.util.*;
public class FlightManager {
    private ArrayList<Flight> flight;
    private ArrayList<Booking> bookings;
    

    public FlightManager(){
        flight = new ArrayList<>();
        bookings = new ArrayList<>();
        loadSampleFlights();
    }

    //sample data

    private void loadSampleFlights(){
        flight.add(new Flight("PK101", "Karachi", "Lahore", "2025-12-10", 5));
        flight.add(new Flight("SA102", "Lahore", "Makkah", "2025-12-15", 2));
        flight.add(new Flight("SA103", "Makkah", "Madinah", "2025-12-25", 4));
        flight.add(new Flight("SA104", "Lahore", "Jaddah", "2025-12-29", 3));
    }

    //Whole list of flights

    public void listAllFlights(){
        for (Flight flights : flight){
            System.out.println(flights);
        }
    }

    //Search flight by date

    public ArrayList<Flight> searchByDate(String date){
        ArrayList<Flight> result = new ArrayList<>();
        for (Flight flights : flight){
            if(flights.getDate().equals(date)){
                result.add(flights);
            }
        }
        return result;

    }
    //search flight by destination "location" || "Country" || "City"

    public ArrayList<Flight> searchByDestination (String destination){
        ArrayList<Flight> result = new ArrayList<>();
        for (Flight flights : flight){
            if(flights.getDestination().equalsIgnoreCase(destination)){
                result.add(flights);
            }

        }
        return result;
    }

    //search flight by flight number

    public ArrayList<Flight> getFlightByNumber(String flightNumber){
        ArrayList<Flight> result = new ArrayList<>();
        for(Flight flights : flight){
            if (flights.getFlightNumber().equalsIgnoreCase(flightNumber)){
                return result;
            }
        }

        return null;
        
    }

    // ====================================
    // BOOKING METHODS
    // =====================================

    public Booking bookFlight(String flightNumber, Passenger passenger){
       ArrayList<Flight> flight = getFlightByNumber(flightNumber);
        if(flight == null){
            System.out.println("Flight not found");
            return null;
        }
        if(flight.getAvailableSeats()<=0){
            System.out.println("No seats availible on this flight. ");
            return null;
        }
        Booking booking = new Booking(flight, passenger);
        bookings.add(booking);
        flight.reduceSeats();
        System.out.println("Booking successful! Your booking Id: " + booking.getBookingId());
        return booking;
    }  

    //show all bookings

    public void showAllBookings(){
        if(bookings.isEmpty()){
            System.out.println("No bookings avalible");
        }
        else{
            for(Booking booking : bookings){
                System.out.println(booking);
            }
        }
    }

    
    


    
}
