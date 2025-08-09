# ✈️ Flight Booking System (Java)

A simple **Java-based Flight Booking System** that allows users to search for flights, view available seats, and book tickets for passengers. This project demonstrates the use of **OOP principles**, collections, control flow, and data handling in Java.

---

## 📌 Features
- **Add Flights**: Store flight details including flight number, date, destination, and available seats.
- **Search Flights by Number**: Retrieve flight details using a unique flight number.
- **Search Flights by Date**: List all flights available on a given date.
- **Book Flights**: Create bookings for passengers if seats are available.
- **Reduce Seats on Booking**: Automatically decreases the available seats when a booking is confirmed.
- **Display Bookings**: View all existing bookings with passenger and flight details.

---

## 🛠 Technologies Used
- **Java** (JDK 8+)
- **ArrayList** for storing and managing flights and bookings.
- **OOP Concepts**: Classes, Objects, Methods, and Encapsulation.
- **Control Flow**: Loops, Conditionals, and Switch Statements.

---

## 📂 Project Structure
FlightBookingSystem/
│
├── Flight.java # Flight details (number, date, seats, destination)
├── Passenger.java # Passenger information (name, contact)
├── Booking.java # Booking details (links Passenger and Flight)
├── FlightManager.java # Manages flight search, addition, and booking
├── Main.java # Entry point - menu-driven interface

yaml
Copy code

---

## 🚀 How to Run
1. **Clone this repository**  
   ```bash
   git clone https://github.com/your-username/flight-booking-system.git
   cd flight-booking-system
Compile the Java files

bash
Copy code
javac *.java
Run the program

bash
Copy code
java Main
📋 Example Usage
Add Flights

Search Flight by Number

Search Flight by Date

Book a Flight

View Bookings

Sample run:

Enter flight number: PK101
Flight found!
Available seats: 5
Booking successful! Your booking ID: B001
🧠 Key Learning Points
Handling ArrayLists and iterating with for-each loops.

Avoiding type mismatches between ArrayList<Flight> and Flight objects.

Using methods for modularity (e.g., getFlightByNumber, reduceSeats).

Implementing object relationships (Flight ↔ Booking ↔ Passenger).

📜 License
This project is open-source under the MIT License — feel free to use, modify, and share.
