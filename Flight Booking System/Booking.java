// import java.util.ArrayList;
import java.util.UUID;
public class Booking {

    private UUID bookingId;
    private Flight flight;
    private Passenger passenger;

    public Booking(Flight flight, Passenger passenger){
        this.bookingId = UUID.randomUUID();
        this.passenger = passenger;
        this.flight = flight;
    }

    public UUID getBookingId() {
        return bookingId;
    }

    public Flight getFlight() {
        return flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String toString(){
        return "Booking{" + "Booking ID=" + bookingId + ", Flight=" + flight + ", Passenger=" + passenger + '}';
    }


    

    
}
