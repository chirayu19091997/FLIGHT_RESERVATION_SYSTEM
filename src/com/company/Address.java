package com.company;

public class Address {
    private String Street;
    private String city;
    private String state;

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Address(String Street, String city, String state) {
        this.Street = Street;
        this.city = city;
        this.state = state;
    }
    public String getAddressDetails(){
        String addressdetails = Street + city + state ;
        return addressdetails;
    }
    public void updateAddressDetails(String AddressDetail){

    }

}
