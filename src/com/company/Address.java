package com.company;

public class Address {
    public String Street;
    public String city;
    public String state;

    public Address(String Street, String city, String state) {
        this.Street = Street;
        this.city = city;
        this.state = state;
    }
    public String getAddressDetails(){
        return Street;
    }
    public void updateAddressDetails(String AddressDetail){

    }

}
