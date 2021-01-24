package com.company;

public class RegularTicket extends Ticket{
    private String specialService;

    // GETTERS AND SETTERS
    public String getSpecialService() {
        return specialService;
    }

    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }

    // CONSTRUCTOR
    public RegularTicket(String pnr, String from, String to, Flight flight, String arrivalDateTime, String departureDateTime, Passenger passenger, String seatNo, float price, boolean cancelled,String specialService) {
        super(pnr, from, to, flight, arrivalDateTime, departureDateTime, passenger, seatNo, price, cancelled);
        this.specialService = specialService;
    }

    // METHOD UPDATESPECIALSERVICE
    public void updateSpecialService(String specialService){
        this.specialService = specialService;
    }
}
