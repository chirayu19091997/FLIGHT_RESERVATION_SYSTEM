package com.company;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    private String[] selectedTouristLocation;

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }

    public TouristTicket(String pnr, String from, String to, Flight flight, String arrivalDateTime, String departureDateTime, Passenger passenger, String seatNo, float price, boolean cancelled, String hotelAddress, String[] selectedTouristLocation) {
        super(pnr, from, to, flight, arrivalDateTime, departureDateTime, passenger, seatNo, price, cancelled);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }

    public String getHotelAddress(){
        return hotelAddress;
    }

    public String getTouristLocation(){
        return hotelAddress;
    }

    public void removeTouristLocation(){

    }
    public void addTouristLocation(){

    }

}
