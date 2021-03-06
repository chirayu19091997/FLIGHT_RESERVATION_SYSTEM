package com.company;

public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;

    // GETTERS AND SETTERS
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    // CONSTRUCTOR
    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    // METHOD GETFLIGHTDETAILS
    public String getFlightDetails() {
        return flightNumber +" "+ airline +" "+ capacity +" "+ bookedSeats;
    }

    // METHOD CHECKAVAILABILITY
    public boolean checkAvailability(){
        if(bookedSeats==capacity)
        return false;
        else{
            return true;
        }
    }

    // INCREMENT BOOKING COUNTER
    public void incrementBookingCounter(){
        bookedSeats = bookedSeats+1;
        capacity = capacity-1;
    }
}
