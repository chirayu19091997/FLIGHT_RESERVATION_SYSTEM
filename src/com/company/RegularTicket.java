package com.company;

public class RegularTicket extends Ticket{
    private String specialService;

    public String getSpecialService() {
        return specialService;
    }

    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }

    public RegularTicket(String pnr, String from, String to, Flight flight, String arrivalDateTime, String departureDateTime, Passenger passenger, String seatNo, float price, boolean cancelled,String specialService) {
        super(pnr, from, to, flight, arrivalDateTime, departureDateTime, passenger, seatNo, price, cancelled);
        this.specialService = specialService;
    }

    public void updateSpecialService(String specialService){

    }
}
