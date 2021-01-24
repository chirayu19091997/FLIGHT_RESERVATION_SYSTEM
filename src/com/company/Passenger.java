package com.company;

public class Passenger {
    private int id;
    private Address address;
    private Contact contact;
    private int idCounter=0;

    // GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public int getIdCounter() {
        return idCounter;
    }

    public void setIdCounter(int idCounter) {
        this.idCounter = idCounter;
    }

    //CONSTRUCTOR
    public Passenger(int id,String name,String phone, String email,String street,String city,String state) {
        this.id = id;
        idCounter++;
        Contact contact = new Contact(name, phone, email);
        this.contact = contact;
        Address address = new Address(street, city, state);
        this.address = address;
    }

    // METHOD GETPASSENGER COUNT
    public int getPassengerCount(){
        return idCounter;
    }

}
