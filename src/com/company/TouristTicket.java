package com.company;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    private String[] selectedTouristLocation;

    // GETTERS AND SETTERS
    public String getHotelAddress(){
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }

    // CONSTRUCTOR
    public TouristTicket(String pnr, String from, String to, Flight flight, String arrivalDateTime, String departureDateTime, Passenger passenger, String seatNo, float price, boolean cancelled, String hotelAddress, String[] selectedTouristLocation) {
        super(pnr, from, to, flight, arrivalDateTime, departureDateTime, passenger, seatNo, price, cancelled);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }

    // METHOD TOURISTLOCATION
    public String getTouristLocation(){
        return selectedTouristLocation + hotelAddress;
    }

    // METHOD REMOVETOURISTLOCATION
    public void removeTouristLocation(String[] selectedTouristLocation){
    }

    // METHOD ADDTOURISTLOCATION
    public void addTouristLocation(String hotelAddress){

    }

}
