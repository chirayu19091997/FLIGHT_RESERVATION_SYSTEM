package com.company;

public class Contact {
    private String name;
    private String phone;
    private String email;

    // GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //CONSTRUCTOR
    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    //METHOD GETCONTACT DETAILS
    public String getContactDetails(){
        return name + " " + phone +" " +email;
    }

    //METHOD UPDATECONTACTDETAILS
    public void updateContactDetails(String contactDetails){

    }

}
