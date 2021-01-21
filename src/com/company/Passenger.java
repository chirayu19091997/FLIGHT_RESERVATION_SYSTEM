package com.company;

public class Passenger {
    public int id;
    public String address;
    public String contact;

    public Passenger(int id, String address, String contact) {
        this.id = id;
        this.address = address;
        this.contact = contact;
    }

    public String getAddress(){
        return address;
    }
    public String getContact(){
        return contact;
    }

}
