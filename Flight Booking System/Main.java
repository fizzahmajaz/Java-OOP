import java.util.*;
public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);
    FlightManager flightManager = new FlightManager();

    while(true){
        System.out.println("------Flight Booking System----------");
        System.out.println("1. List All Flights");
        System.out.println("2. Search Flights by Date");
        System.out.println("3. Search Flights by Destination");
        System.out.println("4. Search Flight byu flight number");
        System.out.println("5. Book a flight");
        System.out.println("6. View all Bookings");
        System.out.println("7. Exit");
        System.out.println("Choose your option");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
            flightManager.listAllFlights();  
            break;

            case 2:
            System.out.println("Enter the date (YYYY-MM-DD)");
            String date = sc.nextLine();
            ArrayList<Flight> byDate = flightManager.searchByDate(date);
            if(byDate.isEmpty()){
                System.out.println("No flights found on this date.");
            }else{
                for(Flight flight : byDate){
                    System.out.println(flight);
                }
            }
            break;

            case 3:
            System.out.println("Enter the Destination");
            String destination = sc.nextLine();
            ArrayList<Flight> byDestination= flightManager.searchByDestination(destination);
            if(byDestination.isEmpty()){
                System.out.println("No data found");
            }else{
                for(Flight flight : byDestination){
                    System.out.println(flight);
                }
            }
            break;

            case 4:
            System.out.println("Enter the Flight Number");
            String number = sc.nextLine();
            ArrayList<Flight> byNumber = flightManager.getFlightByNumber(number);
            if(byNumber.isEmpty()){
                System.out.println("No data found");
            } else{
                for(Flight flight : byNumber){
                    System.out.println(flight);
                }
            }  
            break;

            case 5:
            System.out.println("Enter Flight Number");  
            String flightnumb = sc.nextLine();
            System.out.println("Enter Name");  
            String name = sc.nextLine();
            System.out.println("Enter Email");  
            String email = sc.nextLine();
            Passenger passenger = new Passenger(name, email);
            flightManager.bookFlight(flightnumb, passenger);
            break;

            case 6:
            flightManager.showAllBookings();  
            break;

            case 7:
            System.out.println("Thank you for using system");  
            break;
        
            default:
            System.out.println("Invalid choice");
                break;
        }

        sc.close();
        
    }

    
    
        
    }


    
    
}
