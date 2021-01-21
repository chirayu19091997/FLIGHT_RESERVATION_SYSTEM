package com.company;

public class Ticket {
    public String pnr;
    public String from;
    public String to;
    public String flight;
    public String arrivalDateTime;
    public String departureDateTime;
    public String passenger;
    public String seatNo;
    public float price;
    public boolean cancelled;

    public Ticket(String pnr, String from, String to, String flight, String arrivalDateTime, String departureDateTime, String passenger, String seatNo, float price, boolean cancelled) {
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
    public String checkStatus(){
        return seatNo;
    }
    public int getFlightDuration(){
        return 10;
    }
    public void cancel(){

    }
}

