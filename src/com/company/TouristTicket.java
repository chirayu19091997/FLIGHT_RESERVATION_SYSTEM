package com.company;

public class TouristTicket {
    public String hotelAddress;
    public String[] selectedTouristLocation;

    public TouristTicket(String hotelAddress, String[] selectedTouristLocation) {
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
