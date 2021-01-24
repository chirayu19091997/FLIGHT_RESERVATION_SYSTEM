package com.company;

public abstract class Ticket{
    private String pnr;
    private String from;
    private String to;
    private Flight flight;
    private String arrivalDateTime;
    private String departureDateTime;
    private Passenger passenger;
    private String seatNo;
    private float price;
    private boolean cancelled;

    // GETTERS AND SETTERS
    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    // CONSTRUCTOR
    public Ticket(String pnr, String from, String to, Flight flight, String arrivalDateTime, String departureDateTime, Passenger passenger, String seatNo, float price, boolean cancelled) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.flight = flight;
        this.arrivalDateTime = arrivalDateTime;
        this.departureDateTime = departureDateTime;
        this.passenger = passenger;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;

    }

    // METHOD CANCEL
    public void cancel(){
        cancelled = true;
    }

    // METHOD CHECKSTATUS
    public String checkStatus(){
        if(cancelled==false)
        return "Ticket is confirmed with PNR: "+pnr;
        else{
            return "Ticket is cancelled";
        }
    }

    // METHOD FLIGHTDURATION
    public int getFlightDuration(){
        return 0;
    }

}

